package com.medipol;

/**
 * Created by mustafacan on 29.05.2017.
 */
public class Singer {
    private Long id;
    private String singerName;
    private String songName;
    private String singerAlbum;

    public Singer(Long id, String singerName, String songName, String singerAlbum) {
        this.id = id;
        this.singerName = singerName;
        this.songName = songName;
        this.singerAlbum = singerAlbum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerAlbum() {
        return singerAlbum;
    }

    public void setSingerAlbum(String singerAlbum) {
        this.singerAlbum = singerAlbum;
    }
}


