package ep.com.gamedevengine.game;

import android.graphics.Bitmap;
import android.graphics.Point;
import ep.com.gamedevengine.common.AbstractLevel;
import ep.com.gamedevengine.common.LEVEL_STATE;


/**
 * Created by KLB on 17.04.2017.
 */

public class Level extends AbstractLevel {

    public Level(Point position, int width, int height, Bitmap bitmap, Long id, String name, LEVEL_STATE state) {
        super(position, width, height, bitmap, id, name, state);
    }

    @Override
    public String toString() {
        return "Level: " + id;
    }

    @Override
    public void update() {

    }
}
