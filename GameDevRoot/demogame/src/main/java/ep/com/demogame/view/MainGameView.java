package ep.com.demogame.view;

import android.content.Context;
import android.view.MotionEvent;
import ep.com.demogame.game.Game;
import ep.com.gamedevengine.view.AbstractMainGameView;

public class MainGameView extends AbstractMainGameView {

    public MainGameView(Context context) {
        super(context);
        game = new Game(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_UP:
          //      Toast.makeText(getContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
                game.getPlayer().getPosition().x = (int)motionEvent.getX();
                game.getPlayer().getPosition().y = (int)motionEvent.getY();
                break;
            case MotionEvent.ACTION_DOWN:
             //   Toast.makeText(getContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
