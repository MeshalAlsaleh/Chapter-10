package com.example.chapter10;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.text.Annotation;

public class Tween extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        ImageView imRotate = (ImageView)findViewById(R.id.imgTween);
        imRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));
    }
}