package ep.com.gamedevengine.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import ep.com.gamedevengine.game.Player;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by KLB on 17.04.2017.
 */

public abstract class AbstractGame {
    protected Map<Long, AbstractLevel> levels;
    protected Long currentLevel;
    protected Player player;
    protected  static GraphicsManager graphicsManager;

    public AbstractGame(Context context) {
        Point size = new Point();
        Display display = ((WindowManager)context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        display.getSize(size);
        graphicsManager = new GraphicsManager(context.getResources(), size);
        levels = new HashMap<>();
        currentLevel = 1L;
    }

    public void addLevel(AbstractLevel level) {
        levels.put(level.getId(), level);
    }

    public AbstractLevel getLevel(Long id) {
        return levels.get(id);
    }

    public int numOfLevels() {
        return levels.size();
    }

    public void update() {
        for(AbstractLevel level : levels.values()) {
            level.update();
        }
    }
    public Player getPlayer() {
        return player;
    }

    public abstract void draw(Canvas canvas);

    public static GraphicsManager getGraphicsManager() {
        return graphicsManager;
    }

}
