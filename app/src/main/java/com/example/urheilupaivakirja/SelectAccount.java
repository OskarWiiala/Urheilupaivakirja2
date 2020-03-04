package com.example.urheilupaivakirja;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SelectAccount extends AppCompatActivity {

    static ArrayList<String> arrayList = new ArrayList<>();
    ListView list = findViewById(R.id.list);
    static ArrayAdapter<String> arrayAdapter;

    public static final String SHARED_PREFS = "sharedprefs";
    public static final String TEXT = "text";

    private String yeah;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_account);
        textView = (TextView) findViewById(R.id.text1);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);

        loadData();

    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        this.yeah = sharedPreferences.getString(TEXT, "");
    }
}