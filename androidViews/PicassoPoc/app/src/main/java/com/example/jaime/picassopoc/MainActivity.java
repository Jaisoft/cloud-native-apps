package com.example.jaime.picassopoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewPicasso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewPicasso =  findViewById(R.id.imageView_picasso);

        Picasso.get()
                .load("https://www.slobidka.com/images/picasso/picasso-arlequin-pensativos.jpg")
                .placeholder(R.drawable.images)
                .into(imageViewPicasso);
    }
}
