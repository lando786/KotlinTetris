package com.example.lando.tetris

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnExit: Button = findViewById(R.id.btn_exit)
        val btnReset: Button = findViewById(R.id.btn_reset_score)
        val btnNewGame: Button = findViewById(R.id.btn_new_game)
        btnExit.setOnClickListener(this::handleExitEvent)
        btnNewGame.setOnClickListener(this::handleNewGameEvent)
    }
    fun handleExitEvent(view: View){
        finish()
    }
    fun handleNewGameEvent(view: View){
        startActivity(Intent(this, GameActivity::class.java))
    }
}
