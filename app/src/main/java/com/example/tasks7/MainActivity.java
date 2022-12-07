package com.example.tasks7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToKeyboardSamples(View view){
        Intent intent = new Intent(this, KeyboardSamples.class);
        startActivity(intent);
    }

    public void goToAlertPicker(View view){
        Intent intent = new Intent(this, AlertPicker.class);
        startActivity(intent);
    }

    public void goToMainActivity(View view){
        Intent intent = new Intent(this, DessertsActivity.class);
        startActivity(intent);
    }
}