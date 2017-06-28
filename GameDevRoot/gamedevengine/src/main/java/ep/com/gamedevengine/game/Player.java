package ep.com.gamedevengine.game;

import android.graphics.Bitmap;
import android.graphics.Point;
import ep.com.gamedevengine.common.AbstractPlayer;


/**
 * Created by KLB on 17.04.2017.
 */

public class Player extends AbstractPlayer {

    public Player(Point position, int width, int height, Bitmap bitmap, String name) {
        super(position, width, height, bitmap, name);
    }

    @Override
    public String toString() {
        return "Player:" + name;
    }

    @Override
    public void update() {

    }
}
