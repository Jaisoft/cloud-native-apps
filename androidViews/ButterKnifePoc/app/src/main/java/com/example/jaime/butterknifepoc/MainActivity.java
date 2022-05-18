package com.example.jaime.butterknifepoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
//Jaime
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView_name)
    TextView textViewUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        textViewUserName.setText(getString(R.string.user_name));
    }
}
