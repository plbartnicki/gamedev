package ep.com.demogame.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import ep.com.demogame.view.MainGameView;

public class MainActivity extends AppCompatActivity {

    private MainGameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new MainGameView(this);
        setContentView(gameView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }
}
