package com.azurgames.white

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.azurgames.R
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class Game : AppCompatActivity() {

        val random = Random()
        fun getRandom(min: Float, max: Float): Float {
            require(min < max) { "Invalid range [$min, $max]" }
            return min + random.nextFloat() * (max - min)
        }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_game)
        }

        override fun onStart() {
            super.onStart()
            ball.setOnClickListener{
                translater()
            }
        }

        private fun translater() {
            val min = 0.0f
            val max = 1.0f
            val randomTwo = getRandom(min, max)
            val animation = ball.animate()
                .x(randomTwo * (ll_wasp.width-ball.width))
                .y(randomTwo * (ll_wasp.height-ball.height))

            animation.duration = 300
            animation.start()

        }
    }
