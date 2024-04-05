package com.ohgiraffers.test;

public class MusicDTO {

    private static int nextId = 1;

    private int id;
    private String artist;

    private String title;

    public MusicDTO(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public MusicDTO(int id, String artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
    }



}
