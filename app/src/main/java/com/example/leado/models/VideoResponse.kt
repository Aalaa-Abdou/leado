package com.example.leado.models

data class VideoResponse(val items: List<Videos>)
data class Videos(val snippet: Snippets)
data class Snippets(val title: String, val description: String, val resourceId: ResourceID)
data class ResourceID(val videoId: String)