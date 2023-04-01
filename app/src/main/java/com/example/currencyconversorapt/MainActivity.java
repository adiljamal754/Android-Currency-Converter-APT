package com.example.currencyconversorapt;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.currencyconversorapt.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initialize();



        binding.button.setOnClickListener(
                v -> {
                    Spinner s1 = binding.currencySpinner;
                    Spinner s2 = binding.currencySpinner2;
                    EditText et1 = binding.convertET;
                    TextView et2 = binding.convertedET;
                    float val;
                    //possibility to change para switch the  first spinner
                    if(s1.getSelectedItemId() == s2.getSelectedItemId()){
                        et2.setText(et1.getText().toString());
                    } else if (s1.getSelectedItemId() == 0 && s2.getSelectedItemId()==1) {//from metical
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val/63.10));

                    }else if (s1.getSelectedItemId() == 0 && s2.getSelectedItemId()==2) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val/68.65));

                    }else if (s1.getSelectedItemId() == 0 && s2.getSelectedItemId()==3) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val/78.09));

                    }else if (s1.getSelectedItemId() == 0 && s2.getSelectedItemId()==4) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val/0.81));

                    }else if (s1.getSelectedItemId() == 1 && s2.getSelectedItemId()==0) {//from dollar
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*63.10));
                    }else if (s1.getSelectedItemId() == 1 && s2.getSelectedItemId()==2) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val/0.92));

                    }else if (s1.getSelectedItemId() == 1 && s2.getSelectedItemId()==3) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val/0.81));

                    }else if (s1.getSelectedItemId() == 1 && s2.getSelectedItemId()==4) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*77.52));

                    }else if (s1.getSelectedItemId() == 2 && s2.getSelectedItemId()==0) {//from euro
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*68.69));

                    }else if (s1.getSelectedItemId() == 2 && s2.getSelectedItemId()==1) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*1.09));
                    }else if (s1.getSelectedItemId() == 2 && s2.getSelectedItemId()==3) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val/0.88));

                    }else if (s1.getSelectedItemId() == 2 && s2.getSelectedItemId()==4) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*84.29));

                    }else if (s1.getSelectedItemId() == 3 && s2.getSelectedItemId()==0) {//from libra
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*78.07));

                    }else if (s1.getSelectedItemId() == 3 && s2.getSelectedItemId()==1) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*1.24));

                    }else if (s1.getSelectedItemId() == 3 && s2.getSelectedItemId()==2) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*1.14));
                    }else if (s1.getSelectedItemId() == 3 && s2.getSelectedItemId()==4) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*96.01));

                    }else if (s1.getSelectedItemId() == 4 && s2.getSelectedItemId()==0) {//from ruble russo
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*0.81));

                    }else if (s1.getSelectedItemId() == 4 && s2.getSelectedItemId()==1) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*0.013));

                    }else if (s1.getSelectedItemId() == 4 && s2.getSelectedItemId()==2) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val * 0.012));

                    }else if (s1.getSelectedItemId() == 4 && s2.getSelectedItemId()==3) {
                        val = Float.parseFloat(et1.getText().toString());
                        et2.setText(String.valueOf(val*0.010));
                    }

                });

    }


    private void initialize(){
        Integer[] images = {
                R.drawable.mt,R.drawable.usd,  R.drawable.euro,  R.drawable.gbp,  R.drawable.rub

        };
        ImageArrayAdapter adapter = new ImageArrayAdapter(this, images);
        binding.currencySpinner.setAdapter(adapter);
        binding.currencySpinner2.setAdapter(adapter);
    }

}