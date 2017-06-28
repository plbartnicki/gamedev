package ep.com.gamedevengine.common;


import android.graphics.Bitmap;
import android.graphics.Point;

public abstract class AbstractLevel extends GameObject {

    protected Long id;
    protected String name;
    protected LEVEL_STATE state;

    public AbstractLevel(Point position, int width, int height, Bitmap bitmap, Long id, String name, LEVEL_STATE state) {
        super(position, width, height, bitmap);
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void update();

}
