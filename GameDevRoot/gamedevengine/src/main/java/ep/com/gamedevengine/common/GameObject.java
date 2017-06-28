package ep.com.gamedevengine.common;


import android.graphics.Bitmap;
import android.graphics.Point;

public abstract class GameObject {
    protected Point position;
    protected int width, height;
    protected Bitmap bitmap;

    public GameObject(Point position, int width, int height, Bitmap bitmap) {
        this.position = position;
        this.width = width;
        this.height = height;
        this.bitmap = bitmap;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void moveX(int val) {
        position.x += val;
    }

    public void moveY(int val) {
        position.y += val;
    }


    //TODO: add implementation
    public RECTANGLE_COLLISION detectRectangleCollision(GameObject secondObject) {
        return null;
    }

    @Override
    public abstract String toString();

    public abstract void update();
}
