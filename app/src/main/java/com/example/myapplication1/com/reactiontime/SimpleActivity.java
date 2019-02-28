package com.example.myapplication1.com.reactiontime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.myapplication1.ParameterActivity;
import com.example.myapplication1.R;


public class SimpleActivity extends AppCompatActivity {
    private int requestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        Button button1 = findViewById(R.id.set);
        Button button2 = findViewById(R.id.experiment);
        button1.setOnClickListener(new setParameterListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SimpleActivity.this, ParameterActivity.class);
                startActivityForResult(intent,requestCode);
            }
        });
    }
    class setParameterListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SimpleActivity.this, ParameterActivity.class);
            SimpleActivity.this.startActivityForResult(intent,requestCode);
        }
    }
}
