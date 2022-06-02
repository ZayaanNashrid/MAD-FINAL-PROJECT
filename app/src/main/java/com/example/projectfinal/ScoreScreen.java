package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreScreen extends AppCompatActivity {
    String name;
    int score;
    TextView textView;
    RecyclerView RV;
    Button Leave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen);

        RV = findViewById(R.id.ScoreScreenRecyclerView);

        LinearLayoutManager LLM = new LinearLayoutManager(this);
        LLM.setOrientation(RecyclerView.VERTICAL);

        RV.setLayoutManager(LLM);


        Leave = (Button) findViewById(R.id.ScoreScreenLeaveButton);
        Leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}