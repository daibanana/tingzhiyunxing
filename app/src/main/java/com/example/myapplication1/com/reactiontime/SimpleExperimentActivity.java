package com.example.myapplication1.com.reactiontime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.myapplication1.R;

public class SimpleExperimentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_experiment);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

    }
}
