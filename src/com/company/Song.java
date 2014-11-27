package com.company;

/**
 * Created by student14 on 2014-11-27.
 */
public class Song {
    private String artist;
    private String title;
    private int minutes;
    private int seconds;

                public String getArtist() {
        		return artist;
        	    }

            	public void setArtist(String artist) {
        	    this.artist = artist;
        	    }

            	public String getTitle() {
       		    return title;
        	    }

            	public void setTitle(String title) {
        		this.title = title;
        	    }

            	public int getMinutes() {
        		return minutes;
        	    }

            	public void setMinutes(int minutes) {
        		this.minutes = minutes;
        	    }

            	public int getSeconds() {
        		return seconds;
        	    }

            	public void setSeconds(int seconds) {
        		this.seconds = seconds;
        	    }

            	public Song(String title, String artist) {
        		this.title = title;
        		this.artist = artist;
        	    }

            	public Song(String title, String artist, int minutes, int seconds) {
       		    this.title = title;
        		this.artist = artist;
        		this.minutes = minutes;
        		this.seconds = seconds;
        	    }

            	public Song(Song s){
       		    this.title = s.title;
        		this.artist = s.artist;
        		this.minutes = s.minutes;
        		this.seconds = s.seconds;

                }

                public String toString() {
        		return ("{Song: title=" + title + " artist: " + artist + "}");
                }

}
