package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResultsScreen extends AppCompatActivity {

    int score = 0;
    TextView textView;
    Button SubmitButton;
    EditText editText;
    boolean success;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_screen);

        textView = findViewById(R.id.ResultScreenText);

        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("score");

        textView.setText("SCORE: "+ score);

        SubmitButton = (Button) findViewById(R.id.ResultScreenSubmitButton);
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText = (EditText) findViewById(R.id.ResultsScreenEditText);
                String name = editText.getText().toString();

                DataBaseHelper dbhelp = new DataBaseHelper(ResultsScreen.this, "score.db", null, 1);
                success = dbhelp.addNewScore(name, score);

                if(success){
                    Toast.makeText(getApplicationContext(), name + " Added to the List and the Database", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), name + " Score entry failed.", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(ResultsScreen.this, ScoreScreen.class);
                startActivity(intent);
            }
        });

    }
}