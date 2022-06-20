package com.tuki.android_music.Model;

public class ListSinger {
    private String name;
    private int song;
    private int albumn;

    public ListSinger() {
    }

    public ListSinger(String name, int song, int albumn) {
        this.name = name;
        this.song = song;
        this.albumn = albumn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public int getAlbumn() {
        return albumn;
    }

    public void setAlbumn(int albumn) {
        this.albumn = albumn;
    }
}
