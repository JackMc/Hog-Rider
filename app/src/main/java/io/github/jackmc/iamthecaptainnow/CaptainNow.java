package io.github.jackmc.iamthecaptainnow;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;


public class CaptainNow extends Activity {

    ImageButton lookAtMe;
    MediaPlayer lookPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captain);

        lookAtMe = (ImageButton)findViewById(R.id.look);

        lookPlayer = MediaPlayer.create(this, R.raw.look);

        lookAtMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    lookPlayer.stop();
                    lookPlayer.prepare();
                    lookPlayer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
