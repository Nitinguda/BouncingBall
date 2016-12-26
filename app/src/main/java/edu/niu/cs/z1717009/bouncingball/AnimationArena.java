package edu.niu.cs.z1717009.bouncingball;

import android.graphics.Canvas;

/**
 * Created by z1717009 on 4/19/2016.
 */
public class AnimationArena
{
    private Ball myBall;

    public AnimationArena()
    {
        myBall = new Ball();
    }//end of constructor

    public void update( int width, int height )
    {
        myBall.move(0, 0, width, height);
    }//end of update

    public void draw( Canvas canvas )
    {
        canvas.drawRGB(156,174, 216);
        myBall.draw(canvas);
    }//end of draw
}//end of AnimationArena class
