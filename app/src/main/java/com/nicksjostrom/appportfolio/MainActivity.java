package com.nicksjostrom.appportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * commit
 */

public class MainActivity extends Activity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
    }

    public void openSpotifyApp(View view) {
        Toast.makeText(context, getString(R.string.app_spotify_toast), Toast.LENGTH_SHORT).show();
    }

    public void openScoresApp(View view) {
        Toast.makeText(context, getString(R.string.app_football_toast), Toast.LENGTH_SHORT).show();
    }

    public void openLibraryApp(View view) {
        Toast.makeText(context, getString(R.string.app_library_toast), Toast.LENGTH_SHORT).show();
    }

    public void openBibApp(View view) {
        Toast.makeText(context, getString(R.string.app_build_it_toast), Toast.LENGTH_SHORT).show();
    }

    public void openXyzApp(View view) {
        Toast.makeText(context, getString(R.string.app_xyz_reader_toast), Toast.LENGTH_SHORT).show();
    }

    public void openCapstoneApp(View view) {
        Toast.makeText(context, getString(R.string.app_capstone_toast), Toast.LENGTH_SHORT).show();
    }

}
