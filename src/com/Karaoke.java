package com;

import com.kapitanov.model.Song;
import com.kapitanov.model.SongBook;

public class Karaoke {
    public static void main(String[] args) {
        Song song = new Song("Michael Jackson","Beat It","URL");
        SongBook songBook = new SongBook();
        System.out.printf("Adding %s by %s%n",song.getTitle(),song.getArtist());
        songBook.addSong(song);
        System.out.printf("There are %d songs",songBook.songCount());
    }
}
