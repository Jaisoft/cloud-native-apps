package com.example.jaime.glidepoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewGlide =  findViewById(R.id.imageView_glide);
        Glide.with(this)
                .load("https://www.slobidka.com/images/picasso/picasso-arlequin-pensativos.jpg")
                .into(imageViewGlide);

    }
}
