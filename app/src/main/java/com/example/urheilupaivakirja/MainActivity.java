package com.example.urheilupaivakirja;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "com.example.urheilupaivakirja.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonCreateAccount(View view) {
        Log.i(TAG, "sendMessage: ");
        Intent intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }


    public void buttonSelectAccount(View view) {
        Log.i(TAG, "sendMessage: ");
        Intent intent = new Intent(this, SelectAccount.class);
        startActivity(intent);
    }
}
