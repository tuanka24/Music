package com.tuki.android_music.Model;

public class ListSong {
    private int songId;
    private String name;
    private String vocal;

    public ListSong() {
    }

    public ListSong(int songId, String name, String vocal) {
        this.songId = songId;
        this.name = name;
        this.vocal = vocal;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVocal() {
        return vocal;
    }

    public void setVocal(String vocal) {
        this.vocal = vocal;
    }
}
