package ep.com.demogame.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import ep.com.demogame.R;
import ep.com.gamedevengine.common.AbstractGame;
import ep.com.gamedevengine.game.Player;


/**
 * Created by KLB on 17.04.2017.
 */

public class Game extends AbstractGame {

    public Game(Context context) {
        super(context);
        Bitmap bplayer = getGraphicsManager().getGraphic(R.drawable.wolf, 0.2, 0.2);
        player = new Player(new Point(10, 10), bplayer.getWidth(), bplayer.getHeight(), bplayer, "Player");
    }

    @Override
    public void update() {
        super.update();
        player.update();
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap( player.getBitmap(), player.getPosition().x, player.getPosition().y, new Paint());
    }
}
