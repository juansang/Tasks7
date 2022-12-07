package com.example.tasks7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }

    public void displayToast(String message) { Toast.makeText(getApplicationContext(), message,
            Toast.LENGTH_SHORT).show();
    }
    public void showFoodOrder(String message) {
        displayToast(message);
    }

    public void showDonutOrder(View view) {
        showFoodOrder(getString(R.string.donut_order_message));
    }
    public void showIceCreamOrder(View view) {
        showFoodOrder(getString(R.string.ice_cream_order_message));
    }
    public void showFroyoOrder(View view) {
        showFoodOrder(getString(R.string.froyo_order_message));
    }

    public void goToOrderActivity(View view){
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }
}