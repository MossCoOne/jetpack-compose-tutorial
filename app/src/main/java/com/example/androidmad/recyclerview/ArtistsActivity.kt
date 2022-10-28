package com.example.androidmad.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmad.R

class ArtistsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artists_layout)
        val recyclerView = findViewById<RecyclerView>(R.id.songRecyclerView)

        recyclerView.apply {
            layoutManager =
                GridLayoutManager(this@ArtistsActivity, 1, GridLayoutManager.HORIZONTAL, false)
            itemAnimator = DefaultItemAnimator()
            adapter = PlayListAdapter(getDataSet())
        }
    }

    private fun getDataSet(): ArrayList<Artist> {
        return arrayListOf(
            Artist(
                "Kabza", arrayListOf(
                    Song(
                        title = "1",
                        albumArtUrl = "https://images.punkapi.com/v2/keg.png"
                    ),
                    Song(
                        title = "2",
                        albumArtUrl = "https://images.punkapi.com/v2/2.png"
                    ),
                    Song(
                        title = "3",
                        albumArtUrl = "https://images.punkapi.com/v2/keg.png"
                    ),
                    Song(
                        title = "3",
                        albumArtUrl = "https://images.punkapi.com/v2/4.png"
                    ),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "4"),
                    Song(title = "5"),
                    Song(title = "6"),
                    Song(title = "7"),
                    Song(title = "8")
                )
            ),
            Artist(
                "Madumane", arrayListOf(
                    Song(
                        title = "a",
                        albumArtUrl = "https://images.punkapi.com/v2/keg.png"
                    ),
                    Song(
                        title = "b",
                        albumArtUrl = "https://images.punkapi.com/v2/12.png"
                    ),
                    Song(
                        title = "g",
                        albumArtUrl = "https://images.punkapi.com/v2/13.png"
                    )
                )
            ),
            Artist(
                "Shasha", arrayListOf(
                    Song(
                        title = "1",
                        albumArtUrl = "https://images.punkapi.com/v2/8.png"
                    ),
                    Song(
                        title = "2",
                        albumArtUrl = "https://images.punkapi.com/v2/9.png"
                    ),
                    Song(
                        title = "3",
                        albumArtUrl = "https://images.punkapi.com/v2/10.png"
                    ),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "3"),
                    Song(title = "4"),
                    Song(title = "e"),
                    Song(title = "h")
                )
            ),
            Artist(
                "Demthuda ka Mazola", arrayListOf(
                    Song(
                        title = "a",
                        albumArtUrl = "https://images.punkapi.com/v2/keg.png"
                    )
                )
            ),
            Artist(
                "Zola", arrayListOf(
                    Song(title = "1",albumArtUrl = "https://images.punkapi.com/v2/14.png"),
                    Song(title = "2",albumArtUrl = "https://images.punkapi.com/v2/15.png"),
                    Song(title = "2",albumArtUrl = "https://images.punkapi.com/v2/16.png"),
                    Song(title = "2"),
                    Song(title = "3"),
                    Song(title = "4"),
                    Song(title = "e"),
                    Song(title = "h")
                )
            ),
            Artist(
                "Kabelo", arrayListOf(
                    Song(title = "1"), private fun getDataSet(): ArrayList<Artist> {
                        return arrayListOf(
                            Artist(
                                "Kabza", arrayListOf(
                                    Song(
                                        title = "1",
                                        albumArtUrl = "https://images.punkapi.com/v2/keg.png"
                                    ),
                                    Song(
                                        title = "2",
                                        albumArtUrl = "https://images.punkapi.com/v2/2.png"
                                    ),
                                    Song(
                                        title = "3",
                                        albumArtUrl = "https://images.punkapi.com/v2/keg.png"
                                    ),
                                    Song(
                                        title = "3",
                                        albumArtUrl = "https://images.punkapi.com/v2/4.png"
                                    ),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "4"),
                                    Song(title = "5"),
                                    Song(title = "6"),
                                    Song(title = "7"),
                                    Song(title = "8")
                                )
                            ),
                            Artist(
                                "Madumane", arrayListOf(
                                    Song(
                                        title = "a",
                                        albumArtUrl = "https://images.punkapi.com/v2/keg.png"
                                    ),
                                    Song(
                                        title = "b",
                                        albumArtUrl = "https://images.punkapi.com/v2/12.png"
                                    ),
                                    Song(
                                        title = "g",
                                        albumArtUrl = "https://images.punkapi.com/v2/13.png"
                                    )
                                )
                            ),
                            Artist(
                                "Shasha", arrayListOf(
                                    Song(
                                        title = "1",
                                        albumArtUrl = "https://images.punkapi.com/v2/8.png"
                                    ),
                                    Song(
                                        title = "2",
                                        albumArtUrl = "https://images.punkapi.com/v2/9.png"
                                    ),
                                    Song(
                                        title = "3",
                                        albumArtUrl = "https://images.punkapi.com/v2/10.png"
                                    ),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "3"),
                                    Song(title = "4"),
                                    Song(title = "e"),
                                    Song(title = "h")
                                )
                            ),
                            Artist(
                                "Demthuda ka Mazola", arrayListOf(
                                    Song(
                                        title = "a",
                                        albumArtUrl = "https://images.punkapi.com/v2/keg.png"
                                    )
                                )
                            ),
                            Artist(
                                "Zola", arrayListOf(
                                    Song(title = "1",albumArtUrl = "https://images.punkapi.com/v2/14.png"),
                                    Song(title = "2",albumArtUrl = "https://images.punkapi.com/v2/15.png"),
                                    Song(title = "2",albumArtUrl = "https://images.punkapi.com/v2/16.png"),
                                    Song(title = "2"),
                                    Song(title = "3"),
                                    Song(title = "4"),
                                    Song(title = "e"),
                                    Song(title = "h")
                                )
                            ),
                            Artist(
                                "Kabelo", arrayListOf(
                                    Song(title = "1"),
                                    Song(title = "2"),
                                    Song(title = "3"),
                                    Song(title = "4"),
                                    Song(title = "e"),
                                    Song(title = "e"),
                                    Song(title = "e"),
                                    Song(title = "e"),
                                    Song(title = "e"),
                                    Song(title = "h")
                                )
                            )
                        )

                    }
                    Song(title = "2"),
                    Song(title = "3"),
                    Song(title = "4"),
                    Song(title = "e"),
                    Song(title = "e"),
                    Song(title = "e"),
                    Song(title = "e"),
                    Song(title = "e"),
                    Song(title = "h")
                )
            )
        )

    }
}