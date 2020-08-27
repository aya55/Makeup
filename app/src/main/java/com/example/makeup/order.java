package com.example.makeup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class order extends AppCompatActivity {
public static final  String exra_text="com.example.makeup.example.exra_text";
    public static final  String exra_num="com.example.makeup.example.exra_num";
private int quantity=0;
 TextView textquantity,textprice;
Button orderrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        textprice=findViewById(R.id.dolar);
        textquantity=findViewById(R.id.zero);
        orderrr=findViewById(R.id.order);
        orderrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textprice.setText(quantity*100 +" $");
                open();
            }
        });

    }

    public void plus(View view) {
      quantity++;
      textquantity.setText(""+ quantity);
    }


    public void minus(View view) {
        quantity--;
        if(quantity==-1){

            quantity=0;
        }
        textquantity.setText(""+quantity);
    }

    public void open( ) {
        int num1= Integer.parseInt(textquantity.getText().toString());
        int num2= Integer.parseInt(textprice.getText().toString());
        Intent intent=new Intent(this,activity2.class);
        intent.putExtra(exra_text,num1);
        intent.putExtra(exra_num,num2);
        startActivity(intent);

    }
}
