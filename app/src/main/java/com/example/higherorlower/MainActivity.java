package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void guess(View view){
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        int guessvalue = Integer.parseInt(editTextNumber.getText().toString());
        String message;
        if(guessvalue > randomNumber){
            message= "Lower!";
        }
        else if(guessvalue < randomNumber){
            message= "Higher!";
        }
        else{
            message = "You got it!";
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Log.i("info",Integer.toString(randomNumber));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
}