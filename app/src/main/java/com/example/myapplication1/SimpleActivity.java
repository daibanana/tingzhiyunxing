package com.example.myapplication1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //在进入实验之前显示参数
        if (requestCode == 0x11 && resultCode == 0x11){
            Bundle bundle = data.getExtras();
            String name = bundle.getString("name");
            String age = bundle.getString("age");
            String no = bundle.getString("no");
            String number = bundle.getString("number");
            TextView textViewName = findViewById(R.id.simple_para_name);
            textViewName.setText(name);
            TextView textViewAge = findViewById(R.id.simple_para_age);
            textViewAge.setText(age);
            TextView textViewNo = findViewById(R.id.simple_para_no);
            textViewNo.setText(no);
            TextView textViewNumber = findViewById(R.id.simple_para_number);
            textViewNumber.setText(number);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        Button button1 = findViewById(R.id.set);
        Button button2 = findViewById(R.id.experiment);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SimpleActivity.this, ParameterActivity.class);
                SimpleActivity.this.startActivityForResult(intent,0x11);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SimpleActivity.this,SimpleExperimentActivity.class);
                SimpleActivity.this.startActivity(intent);
            }
        });


    }
}
