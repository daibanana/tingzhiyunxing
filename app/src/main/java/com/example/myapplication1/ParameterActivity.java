package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ParameterActivity extends AppCompatActivity {
    int resultCode;
    private EditText name;
    private Button btn_ok;
    private RadioGroup age;

    private RadioGroup sex;
    private RadioButton male;
    private RadioButton female;

    private RadioGroup hand;
    private RadioButton left;
    private RadioButton right;

    private RadioGroup number;
    //缺少下拉选择年龄及组数的选项


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameter);
        name = findViewById(R.id.name);
        btn_ok = findViewById(R.id.btn_ok);
        age = findViewById(R.id.age);
        sex = findViewById(R.id.sex);
        hand = findViewById(R.id.hand);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        btn_ok = findViewById(R.id.btn_ok);



        setResult(resultCode);
    }
}
