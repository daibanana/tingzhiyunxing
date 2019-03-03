package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ParameterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameter);
        Button okBtn = findViewById(R.id.btn_ok);

        //单击OK按钮，获取各个组件的输入值
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //获取各个组件内容
                String name = ((EditText)findViewById(R.id.name)).getText().toString();
                String age = ((EditText)findViewById(R.id.age)).getText().toString();
                String no = ((EditText)findViewById(R.id.no)).getText().toString();
                String number = ((EditText)findViewById(R.id.number)).getText().toString();
                //Integer number = ((Integer)findViewById(R.id.no)).getText().toInt();

                //判断是否有未输入的信息
                if (!"".equals(name) && !"".equals(age)){
                    Intent intent = getIntent();
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence("name",name);
                    bundle.putCharSequence("age",age);
                    bundle.putCharSequence("no",no);
                    bundle.putCharSequence("number",number);
                    intent.putExtras(bundle);
                    setResult(0x11,intent);
                    finish();



                }else{
                    Toast.makeText(ParameterActivity.this," 请输入完整信息",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    }


