package com.company;

/**
 * Created by student14 on 2014-11-27.
 */
public class Artist {
    private String name;
    private String genre;
    private String country;

                public Artist(String name, String genre, String country) {
                this.name = name;
                this.genre = genre;
                this.country = country;
                }


                public String getArtist() {
                return artist;
                }

                public void setArtist(String artist) {
                this.artist = artist;
                }
                public String getName() {
                return name;
                }

                public void setName(String name) {
                this.name = name;
                }

                public String getGenre() {
                return genre;
                }

                public void setGenre(String genre) {
                this.genre = genre;
                }

                public String getCountry() {
                return country;
                }

                public void setCountry(String country) {
                this.country = country;
                }

    public static void main(String[] args) {
        Artist asap = new PlayList();
        p.loadSongs("sample.txt");
        System.out.println(p.getSongList());
        p.sortByArtist();
        System.out.println(p.totalPlayTime());
        p.clear();
        System.out.println(p.getSongList());
    }
}

