package com.example.currencyconversorapt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.currencyconversorapt.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    initialize();

    }


    private void initialize(){
        Integer[] images = {
                R.drawable.usd,  R.drawable.euro,  R.drawable.gbp,  R.drawable.rub

        };
        ImageArrayAdapter adapter = new ImageArrayAdapter(this, images);
        binding.currencySpinner.setAdapter(adapter);
        binding.currencySpinner2.setAdapter(adapter);
    }

}