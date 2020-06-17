package com.example.leado.activity

import android.os.Bundle
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
        introduction_TV.text = argument.videoDescription
    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {

        Toast.makeText(this, "Initialized Youtube Player successfully", Toast.LENGTH_SHORT).show()
        if (!p2) {
            p1?.setPlayerStateChangeListener(this)
            p1?.cueVideo(argument.VideoID)
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
    }

    override fun onAdStarted() {
    }

    override fun onLoading() {
    }

    override fun onVideoStarted() {
        Toast.makeText(this.baseContext,"tmam",Toast.LENGTH_LONG).show()
    }

    override fun onLoaded(p0: String?) {
    }

    override fun onVideoEnded() {
    }

    override fun onError(p0: YouTubePlayer.ErrorReason?) {
    }
}
