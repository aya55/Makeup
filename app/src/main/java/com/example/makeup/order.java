package com.example.makeup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class order extends AppCompatActivity {

private int quantity=0;
 TextView textquantity,textprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        textprice=findViewById(R.id.dolar);
        textquantity=findViewById(R.id.zero);

    }

    public void plus(View view) {
      quantity++;
      textquantity.setText(""+ quantity);
    }


    public void minus(View view) {
        quantity--;
        textquantity.setText(""+quantity);
    }

    public void order(View view) {
        textprice.setText(quantity*100 +" $");
    }
}
