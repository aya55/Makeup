package com.example.makeup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        Intent intent=getIntent();
        int num1=intent.getIntExtra(order.exra_text,0);
        int num2=intent.getIntExtra(order.exra_num,0);
        TextView textView1=(TextView) findViewById(R.id.text1);
        TextView textView2=(TextView) findViewById(R.id.text2);
        textView1.setText(""+num1);
        textView2.setText(""+num2+"$");

    }
}
