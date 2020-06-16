package com.example.leado.models

data class PlayListResponse(val items: List<PlayList>)
data class PlayList(val id: PlayListID)
data class PlayListID(val playlistId: String)