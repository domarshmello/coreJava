package com.marshmello.对象;
/**
 * 对象：万物皆对象  类：模板
 *
 * */
public class Song {
    private String title;
    private  String artist;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void play(){
        System.out.println(artist +" is playing " + title);
    }

     public static void main(String[] args) {
        Song s=new Song();
        s.setTitle("梦醒了");
        s.setArtist(" 王菲 ");
        s.play();

    }

}
