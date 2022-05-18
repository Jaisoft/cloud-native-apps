package com.example.jaime.databindingpoc;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.jaime.databindingpoc.databinding.ActivityMainBinding;
import com.example.jaime.databindingpoc.model.User;

// Data Binding POC

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Jaime");
        binding.setUser(user);
    }
}
