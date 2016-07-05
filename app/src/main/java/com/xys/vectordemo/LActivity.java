package com.xys.vectordemo;

import android.annotation.TargetApi;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class LActivity extends AppCompatActivity {

    private boolean isTick1;
    private boolean isTick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void anim1(View view) {
        ImageView imageView = (ImageView) view;

        AnimatedVectorDrawable tickToCross = (AnimatedVectorDrawable) getDrawable(R.drawable.path_tick2cross_anim);
        AnimatedVectorDrawable crossToTick = (AnimatedVectorDrawable) getDrawable(R.drawable.path_cross2tick_anim);

        AnimatedVectorDrawable animDrawable = isTick1 ? crossToTick: tickToCross;
        imageView.setImageDrawable(animDrawable);
        if (animDrawable != null) {
            animDrawable.start();
        }
        isTick1 = !isTick1;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void anim2(View view) {
        ImageView imageView = (ImageView) view;

        AnimatedVectorDrawable tickToCross = (AnimatedVectorDrawable) getDrawable(R.drawable.heart_full_anim);
        AnimatedVectorDrawable crossToTick = (AnimatedVectorDrawable) getDrawable(R.drawable.heart_empty_anim);

        AnimatedVectorDrawable animDrawable = isTick2 ? crossToTick: tickToCross;
        imageView.setImageDrawable(animDrawable);
        if (animDrawable != null) {
            animDrawable.start();
        }
        isTick2 = !isTick2;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void anim3(View view) {
        ImageView imageView = (ImageView) view;
        AnimatedVectorDrawable tickToCross = (AnimatedVectorDrawable) getDrawable(R.drawable.fivestat_anim);
        imageView.setImageDrawable(tickToCross);
        if (tickToCross != null) {
            tickToCross.start();
        }
    }
}
