package com.example.android.musicalstructureapp;

public class Music {

    private String artist;
    private String song;

    public Music(String artist, String song) {
        this.artist = artist;
        this.song = song;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getSong() {
        return this.song;
    }
}
