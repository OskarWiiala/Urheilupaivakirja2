package com.example.urheilupaivakirja;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {

    EditText addAccText;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createaccountdisplay);
    }

    public void buttonAddAcc(View v) {
        addAccText = findViewById(R.id.editText2);
        name = addAccText.getText().toString();
        Account account = new Account();
        account.addAccount(name);
    }

}


