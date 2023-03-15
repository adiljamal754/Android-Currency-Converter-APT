package com.example.currencyconversorapt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Convert(View view){

        //pegar o componente da tela
        EditText valueText = findViewById(R.id.valueET);
        TextView result = findViewById(R.id.currencyTV);

        // pegar e converter o valor do component da tela
        double value = Double.parseDouble(valueText.getText().toString());

        final double dollar = 63.10;

        result.setText("" + Math.round(value / dollar));

    }

}