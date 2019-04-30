package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EightiesActivity extends AppCompatActivity implements View.OnClickListener {
    static ArrayList<Music> music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.music_list );

        //populating datastructure with hardcoded hits of the 80's
        music = new ArrayList<>();
        music.add( new Music( "Michael Jackson", "Billie Jean" ) );
        music.add( new Music( "Bon Jovi", "Livin' on a prayer" ) );
        music.add( new Music( "Guns N'Roses", "Sweet child o'mine" ) );
        music.add( new Music( "Michael Jackson", "Beat it" ) );
        music.add( new Music( "A-ha", "Take on me" ) );
        music.add( new Music( "Van Halen", "Jump" ) );
        music.add( new Music( "Michael Jackson", "Thriller" ) );
        music.add( new Music( "Survivor", "Eye of the Tiger" ) );
        music.add( new Music( "Bryan Adams", "Summer of 69" ) );
        music.add( new Music( "The Police", "Every breath you take" ) );

        // Find the View and put onclicklisteners on it
        TextView main = findViewById( R.id.back );
        main.setOnClickListener( this );

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple list_item.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single song.
        MusicAdapter musicAdapter =
                new MusicAdapter( this, music );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // music_list.xml layout file.
        ListView listView = findViewById( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter( musicAdapter );
    }

    @Override
    public void onClick(View view) {
        Intent mainIntent = new Intent( EightiesActivity.this, MainActivity.class );
        // Start the new activity
        startActivity( mainIntent );
    }
}
