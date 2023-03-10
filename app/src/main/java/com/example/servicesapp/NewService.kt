package com.example.servicesapp

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder


class NewService : Service() {

    private lateinit var player:MediaPlayer

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {


        player = MediaPlayer.create(this,R.raw.music)

        player.setLooping(true)

        player.start()

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()

        player.stop()
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}
