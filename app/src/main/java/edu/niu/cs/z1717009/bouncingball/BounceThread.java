package edu.niu.cs.z1717009.bouncingball;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

/**
 * Created by z1717009 on 4/19/2016.
 */
public class BounceThread extends Thread {
    private SurfaceHolder surfaceHolder;
    private AnimationArena animationArena;
    private boolean isRunning;

    public BounceThread(SurfaceHolder surfaceHolder){
        isRunning = true;
        this.surfaceHolder=surfaceHolder;
        animationArena = new AnimationArena();
    }

    @Override
    public void run() {
        try {
            while (isRunning) {
                Canvas canvas = surfaceHolder.lockCanvas();
                animationArena.update(canvas.getWidth(),canvas.getHeight());
                animationArena.draw(canvas);
                surfaceHolder.unlockCanvasAndPost(canvas);
            }//end of while
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }//end of catch
    }

    public void endBounce(){
        isRunning=false;
    }
}
