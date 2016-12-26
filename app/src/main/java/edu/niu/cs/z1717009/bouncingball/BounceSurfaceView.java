package edu.niu.cs.z1717009.bouncingball;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by z1717009 on 4/19/2016.
 */
public class BounceSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private BounceThread bounceThread;

    public BounceSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);

        bounceThread = new BounceThread(holder);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        bounceThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        bounceThread.endBounce();
        Thread dummy = bounceThread;
        bounceThread = null;
        dummy.interrupt();
    }
}
