package com.kapitanov.model;

public class Song {
    private String mArtist;
    private String mTitle;
    private String mVideoUrl;

    public String getArtist() {
        return mArtist;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getVideoUrl() {
        return mVideoUrl;
    }

    @Override
    public String toString() {
        return String.format("Song %s by %s. URL %s", mArtist, mTitle, mVideoUrl);
    }

    public Song(String artist, String title, String videoUrl) {
        this.mArtist = artist;
        this.mTitle = title;
        this.mVideoUrl = videoUrl;
    }
}
