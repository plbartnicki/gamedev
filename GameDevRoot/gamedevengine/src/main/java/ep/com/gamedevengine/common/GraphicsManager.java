package ep.com.gamedevengine.common;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by KLB on 17.04.2017.
 */

public class GraphicsManager {

    private class Graphics {
        public Bitmap bitmap;
        public double scaleX, scaleY;

        public Graphics(Bitmap bitmap, double scaleX, double scaleY) {
            this.bitmap = bitmap;
            this.scaleX = scaleX;
            this.scaleY = scaleY;
        }
    }

    private Map<Integer, Graphics> graphics;
    private Resources resources;
    private Point deviceSize;

    public GraphicsManager(Resources resources, Point deviceSize) {
        graphics = new HashMap<>();
        this.resources = resources;
        this.deviceSize = deviceSize;
    }

    public Bitmap getGraphic(Integer id, double scaleX, double scaleY) {
        Graphics graph = graphics.get(id);

        if(graph != null && graph.scaleX == scaleX && graph.scaleY == scaleY) {
            return graph.bitmap;
        }

        Bitmap bitmap = BitmapFactory.decodeResource(resources, id);
        bitmap = Bitmap.createScaledBitmap(bitmap,
                (int)(deviceSize.x * scaleX), (int)(deviceSize.y * scaleY), true);

        Graphics newGraph = new Graphics(bitmap, scaleX, scaleY);

        graphics.put(id, newGraph);

        return newGraph.bitmap;
    }

    public int numberOfGraphics() {
        return graphics.size();
    }

}
