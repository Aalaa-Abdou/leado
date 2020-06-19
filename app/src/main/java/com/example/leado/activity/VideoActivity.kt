package com.example.leado.activity

import android.os.Bundle
import android.view.View
import androidx.lifecycle.LiveData
import androidx.navigation.navArgs
import com.example.leado.BuildConfig
import com.example.leado.R
import com.example.leado.SharedViewModel
import com.example.leado.data.models.Lesson
import com.example.leado.data.models.Subject
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener {

    private val argument: VideoActivityArgs by navArgs()
    private lateinit var subjectObj: LiveData<Subject>
    private lateinit var lessonObj: LiveData<Lesson>
    private var index: Int? = null
    private var isFinal: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        Video_view.initialize(BuildConfig.APIKEY, this)

        subjectObj = SharedViewModel().receivingValue()
        lessonObj = SharedViewModel().getLesson()
        index = lessonObj.value!!.index

        introduction_TV.text = lessonObj.value!!.lessonDescription

        if(index == subjectObj.value!!.lessons.size){
            isFinal = true
        }
    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
        if (!p2) {
            p1?.setPlayerStateChangeListener(this)
            p1?.cueVideo(lessonObj.value!!.lessonVideoID)
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
    }

    override fun onAdStarted() {
    }

    override fun onLoading() {
    }

    override fun onVideoStarted() {
        segmented_bar.setCompletedSegments(index!!)
        lesson_icon.setImageResource(subjectObj.value!!.subjectIcon[index!!].Icon)
    }

    override fun onLoaded(p0: String?) {
    }

    override fun onVideoEnded() {
        if (isFinal){
            ic_checked.visibility = View.VISIBLE
        }
    }

    override fun onError(p0: YouTubePlayer.ErrorReason?) {
    }
}
