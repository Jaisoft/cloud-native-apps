package com.example.jaime.daggerpoc.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.jaime.daggerpoc.R;
import com.example.jaime.daggerpoc.model.User;
import com.example.jaime.daggerpoc.model.di.UserApp;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;
    private TextView textViewUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((UserApp)getApplication()).getUserComponent().inject(this);
        textViewUserName =  findViewById(R.id.textView_name);
        textViewUserName.setText(user.getUserName());
    }
}




