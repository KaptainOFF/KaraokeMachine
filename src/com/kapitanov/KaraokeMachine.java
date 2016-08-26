package com.kapitanov;

import com.kapitanov.model.SongBook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KaraokeMachine {
    private SongBook mSongBook;
    private BufferedReader mReader;

    public KaraokeMachine(SongBook songBook) {
        mSongBook = songBook;
        mReader = new BufferedReader(new InputStreamReader(System.in));
    }
}
