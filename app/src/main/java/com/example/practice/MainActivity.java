package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener , View.OnClickListener{



    RadioGroup rg1 ,rg2,rd3, rd4,rd5,rd6;
    EditText tv;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    int value[] = {20, 30};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg1);

        tv = findViewById(R.id.tv);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);


        rg1.setOnCheckedChangeListener(this);
        checkBox1.setOnClickListener(this);

    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i)
    {
        System.out.println("helloworld");


        if (i == R.id.rd1){

            int c = value[0];


            Integer q = new Integer(c);

            tv.setText(q.toString());
        }
        else if (i == R.id.rd2){

            int c = value[1];


            Integer q = new Integer(c);

            tv.setText(q.toString());


    }
        public void onClick(View v) {

    }
}
