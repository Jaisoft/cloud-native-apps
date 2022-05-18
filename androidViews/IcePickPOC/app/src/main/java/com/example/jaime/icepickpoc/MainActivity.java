package com.example.jaime.icepickpoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import icepick.Icepick;
import icepick.State;

public class MainActivity extends AppCompatActivity {
    @State
    String username; // This will be automatically saved and restored
    TextView textViewUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewUserName = findViewById(R.id.textView_name);
        username = "Jaime";
        textViewUserName.setText(username);
        Icepick.restoreInstanceState(this, savedInstanceState);
    }


    @Override public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Icepick.saveInstanceState(this, outState);
    }

}
