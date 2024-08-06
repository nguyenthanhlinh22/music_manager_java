package com.example.music_manager.entity;


import java.util.Date;

public class Music {
    private int Musicid;
    private String MusicName;
    private String description;
    private int Musiclist_id;
    private int category_id;
    private Date publication_date;
    private int composer_id;
    private int singer_id;


    public Music(String MusicName, String description,int Musiclist_id, int category_id, Date publication_date, int composer_id, int singer_id) {
        this.MusicName = MusicName;
        this.description = description;
        this.Musiclist_id = Musiclist_id;
        this.category_id = category_id;
        this.publication_date = publication_date;
        this.composer_id = composer_id;
        this.singer_id = singer_id;

    }

    public int getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(int singer_id) {
        this.singer_id = singer_id;
    }

    public int getComposer_id() {
        return composer_id;
    }

    public void setComposer_id(int composer_id) {
        this.composer_id = composer_id;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publication_date) {
        this.publication_date = publication_date;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getMusiclist_id() {
        return Musiclist_id;
    }

    public void setMusiclist_id(int musiclist_id) {
        Musiclist_id = musiclist_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMusicName() {
        return MusicName;
    }

    public void setMusicName(String musicName) {
        MusicName = musicName;
    }

    public int getMusicid() {
        return Musicid;
    }

    public void setMusicid(int musicid) {
        Musicid = musicid;
    }



}

