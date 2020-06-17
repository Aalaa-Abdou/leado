package com.example.leado.data.remote

import com.example.leado.data.models.PlayListResponse
import com.example.leado.data.models.VideoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {
//    @GET("https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=4&order=rating&type=playlist")
//    fun getPlayListID(
//        @Query("key") key: String,
//        @Query("q") q: String
//    ): Call<PlayListResponse>

    @GET("https://www.googleapis.com/youtube/v3/playlistItems?part=snippet%2CcontentDetails")
    fun getVideos(
        @Query("key") key: String,
        @Query("playlistId") playlistId: String
    ): Call<VideoResponse>

}