package com.example.androidmad.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.androidmad.R

class PlayListAdapter(private val dataSet: ArrayList<Artist>) :
    RecyclerView.Adapter<PlayListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val artistNameTextView: TextView = view.findViewById(R.id.artistNameTextView)
        private val moreTextView: TextView = view.findViewById(R.id.moreSongsTextView)
        private val containerLayout: ConstraintLayout = view.findViewById(R.id.topContainerView)
        private val singleAlbumArtImageView: ImageView =
            view.findViewById(R.id.singleAlbumArtImageView)

        private val topLeftImageView: ImageView =
            view.findViewById(R.id.topLeftAlbumArtImageView)
        private val bottomLeftAlbumArtImageView: ImageView =
            view.findViewById(R.id.bottomLeftAlbumArtImageView)
        private val topRightAlbumArtImageView: ImageView =
            view.findViewById(R.id.topRightAlbumArtImageView)

        fun bindData(artist: Artist) {
            val songs = artist.songs
            artistNameTextView.text = artist.name
            moreTextView.isVisible = false
            singleAlbumArtImageView.isVisible = false
            loadImage(topLeftImageView, songs[0].albumArtUrl.orEmpty())
            loadImage(bottomLeftAlbumArtImageView, songs[2].albumArtUrl.orEmpty())
            loadImage(topRightAlbumArtImageView, songs[1].albumArtUrl.orEmpty())
        }

        fun bindDataForMoreOptions(artist: Artist) {
            val songs = artist.songs
            moreTextView.apply {
                isVisible = true
                text = "+${songs.size.minus(4)}"
            }
            loadImage(topLeftImageView, songs[0].albumArtUrl.orEmpty())
            loadImage(bottomLeftAlbumArtImageView, songs[2].albumArtUrl.orEmpty())
            loadImage(topRightAlbumArtImageView, songs[1].albumArtUrl.orEmpty())
            artistNameTextView.text = artist.name
            singleAlbumArtImageView.isVisible = false
        }

        fun bindDataForOneItem(artist: Artist) {
            moreTextView.isVisible = false
            singleAlbumArtImageView.isVisible = true
            containerLayout.isVisible = false
            artistNameTextView.text = artist.name

            Glide.with(singleAlbumArtImageView.context)
                .load(artist.songs[0].albumArtUrl.orEmpty())
                .into(singleAlbumArtImageView)
        }

        private fun loadImage(imageView: ImageView, imageUrl: String) {
            Glide.with(imageView.context)
                .load(imageUrl).dontAnimate().fitCenter()
                .into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.song_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val artist = dataSet[position]
        if (artist.songs.size > 4) {
            holder.bindDataForMoreOptions(artist)
        } else if (artist.songs.size == 1) {
            holder.bindDataForOneItem(artist)
        } else {
            holder.bindData(artist)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}