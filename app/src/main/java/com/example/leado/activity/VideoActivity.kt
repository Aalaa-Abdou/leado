package com.example.leado.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.navigation.navArgs
import com.example.leado.BuildConfig
import com.example.leado.R
import com.example.leado.data.models.Lesson
import com.example.leado.data.models.Subject
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener {

    private val argument: VideoActivityArgs by navArgs()
    private var gson = Gson()
    private lateinit var subjectObject: Subject
    private lateinit var lessonObject: Lesson
    private var index: Int = 0
    private var isFinal: Boolean = false

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        Video_view.initialize(BuildConfig.APIKEY, this)

        index = argument.LessonIndex

        subjectObject = gson.fromJson(argument.SubjectObject, Subject::class.java)
        lessonObject = subjectObject.lessons[index]
        introduction_TV.text = lessonObject.lessonDescription
        lesson_number_TV.text = "lesson ${index + 1}"

        if((index + 1) == subjectObject.lessons.size){
            isFinal = true
        }
    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
        if (!p2) {
            p1?.setPlayerStateChangeListener(this)
            p1?.cueVideo(lessonObject.lessonVideoID)
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
    }

    override fun onAdStarted() {
    }

    override fun onLoading() {
    }

    override fun onVideoStarted() {
        segmented_bar.setCompletedSegments(index + 1)
        lesson_icon.setImageResource(subjectObject.subjectIcon[index].Icon)
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
