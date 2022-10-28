package com.example.androidmad.recyclerview

data class Artist(val name: String? = "", val songs: List<Song>)

data class Song(
    var title: String? = "",
    var yearReleased: String? = "",
    var albumArtUrl: String? = ""
)