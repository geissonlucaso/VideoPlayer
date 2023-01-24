package com.geisson.videoplayerapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia ao videoView.
        val videoView = findViewById<VideoView>(R.id.videoView)

        // Criação do mediaController.
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        // Local do arquivo.
        val uri: Uri = Uri.parse(
            "android.resource://" + packageName
                    + "/raw/video"
        )

        // Execução.
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}