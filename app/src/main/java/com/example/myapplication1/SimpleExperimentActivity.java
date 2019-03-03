package com.example.myapplication1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myapplication1.R;

public class SimpleExperimentActivity extends AppCompatActivity {

    private int i = 0;
    private final long SPLASH_LENGTH = 1000;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_simple_experiment);
        Button button = findViewById(R.id.next_s_t);
        final ImageView imageView = findViewById(R.id.image_s_t);
        //延迟显示


        //单击确认按钮，进入下一张图片
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (i=0;i<5;i++){
                    imageView.setImageResource(R.mipmap.yubei);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(R.mipmap.ciji);

                        }
                    },SPLASH_LENGTH);
                }
            }

        });

    }
}
