package com.example.drawingapplications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_undo)
        btn.setOnClickListener {
            val drawing_view = findViewById<DrawingView>(R.id.drawingView)
            drawing_view.onClickUndo()
        }
        val btnr = findViewById<Button>(R.id.btn_redo)
        btnr.setOnClickListener {
            val drawing_view = findViewById<DrawingView>(R.id.drawingView)
            drawing_view.onClickRedo()
        }


    }
}