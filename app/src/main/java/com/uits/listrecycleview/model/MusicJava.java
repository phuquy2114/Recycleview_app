package com.uits.listrecycleview.model;

/**
 * Music Java
 * Copyright © 2019 UITS CO.,LTD
 * Created PHUQUY on 7/6/20.
 **/
class MusicJava {
    private String nameImage;
    private String nameSong;
    private String nameSinger;
    private String nameAudio;


    public MusicJava(String nameImage, String nameSong, String nameSinger, String nameAudio) {
        this.nameImage = nameImage;
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.nameAudio = nameAudio;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getNameAudio() {
        return nameAudio;
    }

    public void setNameAudio(String nameAudio) {
        this.nameAudio = nameAudio;
    }
}
