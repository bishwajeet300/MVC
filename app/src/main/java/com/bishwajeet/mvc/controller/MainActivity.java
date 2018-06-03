package com.bishwajeet.mvc.controller;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bishwajeet.mvc.R;
import com.bishwajeet.mvc.model.ImageData;

public class MainActivity extends AppCompatActivity {

    private ImageData image;
    private ImageView ivImage;
    private ImageView ivStar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivStar = (ImageView) findViewById(R.id.imageView4);

        image = new ImageData();
        image.setImageId(1234);
    }


    public void onUploadClick(View view) {
        Toast.makeText(this, "Uploading Image...", Toast.LENGTH_SHORT).show();
    }

    public void onDiscardClick(View view) {
        Toast.makeText(this, "Deleting Image...", Toast.LENGTH_SHORT).show();
    }

    public void onStarClick(View view) {
        if (image.isStarred()) {
            ivStar.setImageDrawable(ContextCompat.getDrawable(this, android.R.drawable.btn_star_big_off));
            image.setStarred(false);
        } else {
            ivStar.setImageDrawable(ContextCompat.getDrawable(this, android.R.drawable.btn_star_big_on));
            image.setStarred(true);
        }
    }
}
