package com.nicksjostrom.appportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    Context context;
    String[] toastText = {
            "This button will launch the Spotify App",
            "This button will launch the Scores App",
            "This button will launch the Library App",
            "This button will launch the Build It Bigger App",
            "This button will launch the XYZ Reader App",
            "This button will launch my Capstone App",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openSpotifyApp(View view) {
        Toast.makeText(context, toastText[0], Toast.LENGTH_SHORT).show();
    }

    public void openScoresApp(View view) {
        Toast.makeText(context, toastText[1], Toast.LENGTH_SHORT).show();
    }

    public void openLibraryApp(View view) {
        Toast.makeText(context, toastText[2], Toast.LENGTH_SHORT).show();
    }

    public void openBibApp(View view) {
        Toast.makeText(context, toastText[3], Toast.LENGTH_SHORT).show();
    }

    public void openXyzApp(View view) {
        Toast.makeText(context, toastText[4], Toast.LENGTH_SHORT).show();
    }

    public void openCapstoneApp(View view) {
        Toast.makeText(context, toastText[5], Toast.LENGTH_SHORT).show();
    }

}
