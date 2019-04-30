package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        // Find the Views and put onclicklisteners on them
        TextView sixties = findViewById( R.id.sixties );
        sixties.setOnClickListener( this );
        TextView seventies = findViewById( R.id.seventies );
        seventies.setOnClickListener( this );
        TextView eighties = findViewById( R.id.eighties );
        eighties.setOnClickListener( this );
        TextView searching = findViewById( R.id.search );
        searching.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sixties:
                // Create a new intent to open the {@link SixtiesActivity}
                Intent sixtiesIntent = new Intent( MainActivity.this, SixtiesActivity.class );
                // Start the new activity
                startActivity( sixtiesIntent );
                break;
            case R.id.seventies:
                // Create a new intent to open the {@link SeventiesActivity}
                Intent seventiesIntent = new Intent( MainActivity.this, SeventiesActivity.class );
                // Start the new activity
                startActivity( seventiesIntent );
                break;
            case R.id.eighties:
                // Create a new intent to open the {@link EightiesActivity}
                Intent eightiesIntent = new Intent( MainActivity.this, EightiesActivity.class );
                // Start the new activity
                startActivity( eightiesIntent );
                break;
            case R.id.search:
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent( MainActivity.this, SearchActivity.class );
                // Start the new activity
                startActivity( searchIntent );
                break;
        }
    }
}
