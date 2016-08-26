package com.kapitanov.model;

import java.util.ArrayList;
import java.util.List;

public class SongBook {
    private List<Song> mSongs;

    public SongBook() {
        mSongs = new ArrayList<>();
    }

    public void addSong(Song song) {
        mSongs.add(song);
    }

    public int songCount() {
        return mSongs.size();
    }
}
