package com.example.myapplication1.com.reactiontime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.myapplication1.R;

public class ReactionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction);
        Button button1 = findViewById(R.id.btn_simple);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReactionActivity.this,SimpleActivity.class);
                startActivity(intent);
            }
        });

    }
}
