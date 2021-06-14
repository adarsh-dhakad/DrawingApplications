package com.example.drawingapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnUndo = findViewById(R.id.btn_undo) ;
        btnUndo.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {


                                        DrawingView drawing_view = findViewById(R.id.drawingView);
                                                   drawing_view.onClickUndo();
                                       }
                                   }

        ) ;

    }
}