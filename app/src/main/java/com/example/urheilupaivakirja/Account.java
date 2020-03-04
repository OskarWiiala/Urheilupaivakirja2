package com.example.urheilupaivakirja;

import android.content.SharedPreferences;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Account extends AppCompatActivity {
    public static final String TAG = "Account";
    static String name;
    private ArrayList<AccountReal> realAcc = new ArrayList<>();

    public void addAccount(String name) {
        this.name = name;
        AccountReal henkilo = new AccountReal(name);
        this.realAcc.add(henkilo);
        SelectAccount.arrayList.add(name);

        saveData();

        System.out.println(henkilo.getAccountName());
    }

    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SelectAccount.SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //SelectAccount newAccount = new SelectAccount();
        editor.putString(SelectAccount.TEXT, name); //I need to reference the place the name of the account goes, so listview? or?

        editor.apply();

        Toast.makeText(this, "This data has been saved", Toast.LENGTH_SHORT).show();
    }

    static public String getNameAccount() {
        return name;
    }
}
