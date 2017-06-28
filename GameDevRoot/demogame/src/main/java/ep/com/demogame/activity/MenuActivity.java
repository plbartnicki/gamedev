package ep.com.demogame.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import ep.com.demogame.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void startButtonClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        //  Toast.makeText(getApplicationContext(), "Under construction", Toast.LENGTH_SHORT).show();

    }
}
