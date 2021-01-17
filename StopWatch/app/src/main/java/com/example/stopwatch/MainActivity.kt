package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    private var time = 0
    private var timerTask : Timer? = null
    private var isRunning = false
    private var lap = 1

    lateinit var fab : FloatingActionButton
    lateinit var secTextView : TextView
    lateinit var milliTextView : TextView
    lateinit var labLayout : LinearLayout
    lateinit var labButton: Button
    lateinit var resetFab : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab = findViewById<FloatingActionButton>(R.id.fab)
        secTextView = findViewById<TextView>(R.id.secTextView)
        milliTextView = findViewById<TextView>(R.id.milliTextView)
        labLayout = findViewById<LinearLayout>(R.id.labLayout)
        labButton = findViewById<Button>(R.id.labButton)
        resetFab = findViewById<FloatingActionButton>(R.id.resetFab)

        fab.setOnClickListener {
            isRunning = !isRunning
            if(isRunning){
                start()
            } else{
                pause()
            }
        }

        labButton.setOnClickListener {
            recordLapTime()
        }

        resetFab.setOnClickListener {
            reset()
        }
    }

    private fun pause() {
        fab.setImageResource(R.drawable.ic_baseline_play_arrow_24)
        timerTask?.cancel()
    }

    private fun start() {
        fab.setImageResource(R.drawable.ic_baseline_pause_24)

        timerTask = timer(period = 10){
            time++
            val sec = time / 100
            val milli = time % 100
            runOnUiThread{
                secTextView.text = "$sec"
                milliTextView.text = "$milli"
            }
        }
    }

    private fun recordLapTime() {
        val lapTime = this.time
        val textView = TextView(this)
        textView.text = "$lap LAB : ${lapTime/100}.${lapTime%100}"
        
        // 값 추가시 위에 부터 (cf lap 값을 넣으면 밑에서 부터)
        labLayout.addView(textView, 0)
        lap++
    }

    private fun reset() {
        timerTask?.cancel()

        time = 0
        isRunning = false
        fab.setImageResource(R.drawable.ic_baseline_play_arrow_24)
        secTextView.text = "0"
        milliTextView.text = "00"

        labLayout.removeAllViews()
        lap = 1
    }
}