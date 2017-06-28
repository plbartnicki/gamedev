package ep.com.gamedevengine.common;

import android.graphics.Bitmap;
import android.graphics.Point;

/**
 * Created by KLB on 17.04.2017.
 */

public abstract class AbstractPlayer extends GameObject {
    protected String name;
    protected GAME_OBJECT_STATE state;

    public AbstractPlayer(Point position, int width, int height, Bitmap bitmap, String name) {
        super(position, width, height, bitmap);
        this.name = name;
        state = GAME_OBJECT_STATE.LIVING;

        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GAME_OBJECT_STATE getState() {
        return state;
    }

    public void setState(GAME_OBJECT_STATE state) {
        this.state = state;
    }

}
