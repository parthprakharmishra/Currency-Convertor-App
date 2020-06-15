package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Currency(View v)
    {
        EditText et1 = (EditText) findViewById(R.id.editText1);
        String st1=et1.getText().toString();
        double d1= Double.parseDouble(st1);
        double d2= d1*76.16;
        String st2= String.format("%.2f",d2);
        Toast.makeText(this,"$ "+st1+" is "+st2, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
