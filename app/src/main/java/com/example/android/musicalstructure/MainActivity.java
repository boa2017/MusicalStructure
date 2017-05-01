package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the artists category
        TextView Artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        Artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent ArtistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(ArtistsIntent);
            }
        });

        // Find the View that shows the Albums category
        TextView Albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        Albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent AlbumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(AlbumsIntent);
            }
        });

        //Find the View that shows the Songs category
        TextView Songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        Songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent SongsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(SongsIntent);
            }
        });

    }

}
