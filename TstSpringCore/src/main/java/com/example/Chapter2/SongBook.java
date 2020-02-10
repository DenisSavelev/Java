package com.example.Chapter2;

public class SongBook {
    private String[] songTitles;

    // <start id="songbook_constructor" />
    public SongBook(String[] songTitles) {
        this.songTitles = songTitles;
    }

    // <end id="songbook_constructor" />

    public String pickASong() {
        return songTitles[0];
    }
}