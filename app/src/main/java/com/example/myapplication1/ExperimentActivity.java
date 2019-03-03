package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExperimentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);
        Button button1 = findViewById(R.id.btn_time);
        Button button2 = findViewById(R.id.btn_threshold);
        Button button3 = findViewById(R.id.btn_memory);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExperimentActivity.this, ReactionActivity.class);
                startActivity(intent);
            }
        });
    }
}
