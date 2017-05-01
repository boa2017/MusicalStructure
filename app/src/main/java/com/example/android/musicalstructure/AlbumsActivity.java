package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

    //Find the View that shows the Songs category
    ImageView Disc1 = (ImageView) findViewById(R.id.disc1);

// Set a click listener on that View
        Disc1.setOnClickListener(new View.OnClickListener() {
// The code in this method will be executed when the songs category is clicked on.
@Override
public void onClick(View view) {
        // Create a new intent to open the {@link SongsActivity}
        Intent Disc1Intent = new Intent(AlbumsActivity.this, SongsActivity.class);

        // Start the new activity
        startActivity(Disc1Intent);
        }
        });
    }
        }

