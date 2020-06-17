package com.example.leado.activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.navigation.navArgs
import com.example.leado.BuildConfig
import com.example.leado.R
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener {

    private val argument: VideoActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        Video_view.initialize(BuildConfig.APIKEY, this)
      //  Video_view.setPlayerStateChangeListener(this)
        introduction_TV.text = argument.videoDescription
    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {

        Toast.makeText(this, "Initialized Youtube Player successfully", Toast.LENGTH_SHORT).show()
        if (!p2) {
            p1?.cueVideo(argument.VideoID)
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
        TODO("Not yet implemented")
    }

    override fun onAdStarted() {
        TODO("Not yet implemented")
    }

    override fun onLoading() {
        TODO("Not yet implemented")
    }

    override fun onVideoStarted() {
        Log.e("onVideoStarted","video is successfully has been started")
    }

    override fun onLoaded(p0: String?) {
        TODO("Not yet implemented")
    }

    override fun onVideoEnded() {
        TODO("Not yet implemented")
    }

    override fun onError(p0: YouTubePlayer.ErrorReason?) {
        TODO("Not yet implemented")
    }
}
