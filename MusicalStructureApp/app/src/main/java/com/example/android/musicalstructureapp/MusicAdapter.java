package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Activity context, ArrayList<Music> music) {
        super( context, 0, music );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.list_item, parent, false );
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Music musicItem = getItem( position );

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistTextView = listItemView.findViewById( R.id.artist_text_view );
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        artistTextView.setText( musicItem.getArtist() );

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = listItemView.findViewById( R.id.song_text_view );
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songTextView.setText( musicItem.getSong() );

        return listItemView;
    }
}
