package com.example.leado.remote

import com.example.leado.models.VideoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {
    @GET("https://www.googleapis.com/youtube/v3/playlistItems?part=snippet%2CcontentDetails&playlistId=PL4A8jtujBZR3EFalC_HCBD7-ksnqz2jXU")
    fun getVideos(
        @Query("key") key: String
    ): Call<VideoResponse>

}