package edu.niu.cs.z1717009.bouncingball;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.frameLayout);
        BounceSurfaceView bounceSurfaceView = new BounceSurfaceView(this,null);
        frameLayout.addView(bounceSurfaceView);
    }
}
