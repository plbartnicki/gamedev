package ep.com.gamedevengine.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import ep.com.gamedevengine.common.AbstractGame;

public abstract class AbstractMainGameView extends SurfaceView implements Runnable {

    protected final static int SLEEP_MS = 10;

    protected SurfaceHolder surfaceHolder;
    protected Canvas canvas;
    protected volatile boolean runningGame;
    protected Thread gameThread = null;
    protected AbstractGame game;

    public AbstractMainGameView(Context context) {
        super(context);
        surfaceHolder = getHolder();
    }

    @Override
    public void run() {
        while (runningGame) {
            update();
            draw();
            control();
        }
    }

    protected void update() {
        game.update();
    }

    protected void draw() {
        if (surfaceHolder.getSurface().isValid()) {
            canvas = surfaceHolder.lockCanvas();
            canvas.drawColor(Color.BLUE);
            game.draw(canvas);
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }

    protected void control() {
        try {
            gameThread.sleep(SLEEP_MS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        runningGame = false;
        try {
            gameThread.join();
        } catch (InterruptedException e) {
        }
    }

    public void resume() {
        runningGame = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public abstract boolean onTouchEvent(MotionEvent motionEvent);
}
