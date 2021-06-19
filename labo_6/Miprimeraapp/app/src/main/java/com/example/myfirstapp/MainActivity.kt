package com.example.myfirstapp

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity(){
    private var mMediaPlayer0: MediaPlayer? = null
    private var mMediaPlayer1: MediaPlayer? = null
    private var mMediaPlayer2: MediaPlayer? = null
    private var mMediaPlayer3: MediaPlayer? = null
    private var mMediaPlayer4: MediaPlayer? = null
    private var mMediaPlayer5: MediaPlayer? = null
    private lateinit var button0 : ImageButton
    private lateinit var button1 : ImageButton
    private lateinit var button2 : ImageButton
    private lateinit var button3 : ImageButton
    private lateinit var button4 : ImageButton
    private lateinit var button5 : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playSound0(view: View) {
        button0 = findViewById(R.id.imageButton0)

        if (mMediaPlayer0 == null) {
            mMediaPlayer0 = MediaPlayer.create(this, R.raw.dog)
            mMediaPlayer0!!.start()
            button0.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button0.setBackgroundResource(R.color.default0)
            }, 1500)

        } else
            mMediaPlayer0!!.start()
        button0.setBackgroundResource(R.color.green)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            button0.setBackgroundResource(R.color.default0)
        }, 1500)

    }

    fun playSound1(view: View) {
        button1 = findViewById(R.id.imageButton1)
        if (mMediaPlayer1 == null) {
            mMediaPlayer1 = MediaPlayer.create(this, R.raw.game)
            mMediaPlayer1!!.start()
            button1.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button1.setBackgroundResource(R.color.default1)
            }, 700)

        } else
            mMediaPlayer1!!.start()
        button1.setBackgroundResource(R.color.green)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            button1.setBackgroundResource(R.color.default1)
        }, 700)
    }

    fun playSound2(view: View) {
        button2 = findViewById(R.id.imageButton2)
        if (mMediaPlayer2 == null) {
            mMediaPlayer2 = MediaPlayer.create(this, R.raw.geese)
            mMediaPlayer2!!.start()
            button2.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button2.setBackgroundResource(R.color.default2)
            }, 5000)

        } else
            mMediaPlayer2!!.start()
        button2.setBackgroundResource(R.color.green)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            button2.setBackgroundResource(R.color.default2)
        }, 5000)
    }

    fun playSound3(view: View) {
        button3 = findViewById(R.id.imageButton3)
        if (mMediaPlayer3 == null) {
            mMediaPlayer3 = MediaPlayer.create(this, R.raw.horn)
            mMediaPlayer3!!.start()
            button3.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button3.setBackgroundResource(R.color.default3)
            }, 1500)

        } else
            mMediaPlayer3!!.start()
        button3.setBackgroundResource(R.color.green)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            button3.setBackgroundResource(R.color.default3)
        }, 1500)
    }

    fun playSound4(view: View) {
        button4 = findViewById(R.id.imageButton4)
        if (mMediaPlayer4 == null) {
            mMediaPlayer4 = MediaPlayer.create(this, R.raw.rocket)
            mMediaPlayer4!!.start()
            button4.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button4.setBackgroundResource(R.color.default4)
            }, 2200)

        } else
            mMediaPlayer4!!.start()
        button4.setBackgroundResource(R.color.green)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            button4.setBackgroundResource(R.color.default4)
        }, 2200)
    }

    fun playSound5(view: View) {
        button5 = findViewById(R.id.imageButton5)
        if (mMediaPlayer5 == null) {
            mMediaPlayer5 = MediaPlayer.create(this, R.raw.transition)
            mMediaPlayer5!!.start()
            button5.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button5.setBackgroundResource(R.color.default5)
            }, 1500)

        } else
            mMediaPlayer5!!.start()
        button5.setBackgroundResource(R.color.green)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            button5.setBackgroundResource(R.color.default5)
        }, 1500)
    }
}
