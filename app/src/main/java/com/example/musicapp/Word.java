package com.example.musicapp;

import android.content.Context;

public class Word {


    // String value
    private String song_Name;


    private String author_Name;


    public Word(String song,String author) {
        song_Name = song;
        author_Name = author;            ;
    }


    public void setSong_Name(String text) {
        song_Name = text;
    }


    public void setAuthor_Name(String author_text) {
        author_Name = author_text;
    }



    public String getSong_Name() {
        return song_Name;
    }


    public String getAuthor_Name() {
        return author_Name;
    }
}
