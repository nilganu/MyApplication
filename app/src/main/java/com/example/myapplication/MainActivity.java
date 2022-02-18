package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=findViewById(R.id.imgView);

        Animation utils=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashanimation);
        img.startAnimation(utils);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(in);
                finish();

            }
        },3000);

    }
}