package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Map;
import java.util.TreeMap;


public class SearchActivity extends AppCompatActivity implements View.OnClickListener{
    Map<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.find_music );

        map = new TreeMap<>();
        map.put( "hey jude", "Beatles" );
        map.put( "a day in the life", "Beatles" );
        map.put( "satisfaction", "The Rolling Stone" );
        map.put( "paint it black", "The Rolling Stone" );
        map.put( "gimme shelter", "The Rolling Stone" );
        map.put( "goldfinger", "Shirley Bassey" );
        map.put( "like a rolling stone", "Bob Dylan" );
        map.put( "All along the watchtower", "Jimi Hendrix" );
        map.put( "whole lotta love", "Led Zeppelin" );
        map.put( "stairway to heaven", "Led Zeppelin" );
        map.put( "bohemian rhapsody", "Queen" );
        map.put( "dancing queen", "Abba" );
        map.put( "hotel california", "Eagles" );
        map.put( "dream on", "Aerosmith" );
        map.put( "imagine", "john Lennon" );
        map.put( "barracuda", "Heart" );
        map.put( "wish you where here", "Pink Floyd" );
        map.put( "stayin' alive", "The Bee Gees" );
        map.put( "free bird", "Lynyrd Skynyrd" );
        map.put( "billie jean", "Michael Jackson" );
        map.put( "livin' on a prayer", "Bon Jovi" );
        map.put( "sweet child o'mine", "Guns N'Roses" );
        map.put( "beat it", "Michael Jackson" );
        map.put( "take on me", "A-ha" );
        map.put( "thriller", "Michael Jackson" );
        map.put( "jump", "Van Halen" );
        map.put( "eye of the tiger", "Survivor" );
        map.put( "every breath you take", "The Police" );
        map.put( "summer of 69", "Bryan Adams" );

        // Find the View that shows the search category
        TextView searching = findViewById( R.id.query );
        searching.setOnClickListener( this );
        // Find the Views and put onclicklisteners on them
        TextView sixties = findViewById( R.id.sixties );
        sixties.setOnClickListener( this );
        TextView seventies = findViewById( R.id.seventies );
        seventies.setOnClickListener( this );
        TextView eighties = findViewById( R.id.eighties );
        eighties.setOnClickListener( this );
        TextView main = findViewById( R.id.main );
        main.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sixties:
                // Create a new intent to open the {@link SixtiesActivity}
                Intent sixtiesIntent = new Intent( SearchActivity.this, SixtiesActivity.class );
                // Start the new activity
                startActivity( sixtiesIntent );
                break;
            case R.id.seventies:
                // Create a new intent to open the {@link SeventiesActivity}
                Intent seventiesIntent = new Intent( SearchActivity.this, SeventiesActivity.class );
                // Start the new activity
                startActivity( seventiesIntent );
                break;
            case R.id.eighties:
                // Create a new intent to open the {@link EightiesActivity}
                Intent eightiesIntent = new Intent( SearchActivity.this, EightiesActivity.class );
                // Start the new activity
                startActivity( eightiesIntent );
                break;
            case R.id.main:
                // Create a new intent to open the {@link SearchActivity}
                Intent mainIntent = new Intent( SearchActivity.this, MainActivity.class );
                // Start the new activity
                startActivity( mainIntent );
                break;
            case R.id.query:
                EditText artistName = findViewById( R.id.search_artist );
                String name = artistName.getText().toString().toLowerCase();
                //Key is in map? -show result
                if (map.containsKey( name )) {
                    TextView artistText = findViewById( R.id.result );
                    artistText.setText( name + " is in the records by " + map.get( name ) );
                } else {
                    TextView artistText = findViewById( R.id.result );
                    artistText.setText( name + " is not in the records" );
                }
                break;
        }
    }
}
