package com.example.xylophone

import android.content.pm.ActivityInfo
import android.media.SoundPool
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private val soundPool = SoundPool.Builder().setMaxStreams(8).build()
    private val sounds = listOf(
            Pair(R.id.do1, R.raw.do1),
            Pair(R.id.re, R.raw.re),
            Pair(R.id.mi, R.raw.mi),
            Pair(R.id.fa, R.raw.fa),
            Pair(R.id.sol, R.raw.sol),
            Pair(R.id.la, R.raw.la),
            Pair(R.id.si, R.raw.si),
            Pair(R.id.do2, R.raw.do2)
    )

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        // 화면이 가로 모드로 고정되게 하기
        // requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sounds.forEach { turn(it) }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun turn(pair: Pair<Int, Int>) {
        val soundId = soundPool.load(this, pair.second, 1)
        findViewById<TextView>(pair.first).setOnClickListener {
            soundPool.play(soundId, 1.0F, 1.0F, 0, 0, 1.0f )
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDestroy() {
        super.onDestroy()
        soundPool.release()
    }
}