package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class PlayList {

                private String name;
                private ArrayList<Song> songList;

                public String getName() {
                return name;
        	}
 	            public void setName(String name) {
   		        this.name = name;
        	}

            	public ArrayList<Song> getSongList() {
        		return songList;
        	}

            	public void setSongList(ArrayList<Song> songList) {
        		this.songList = songList;
        	}

            	public PlayList() {
        		name = "Untitled";
        		songList = new ArrayList<Song>();
        	}

            	public PlayList(String name) {
        		this.name = name;
        		songList = new ArrayList<Song>();
        	}
                public boolean clear() {
        		songList.clear();
        		return true;
        	}

    	        public boolean addSong(Song s) {
        		songList.add(s);
        		return true;
        	}

                public Song removeSong(Song s) {
                songList.trimToSize();
                if (songList.contains(s)) {
                songList.remove(s);
                return s;
            }
                return null;

            }

            	public Song getSong(Song s){
        	    songList.trimToSize();
        	    if(songList.contains(s)){
            	return songList.get(s);
                }else
            	return null;
        	}
    public static void main(String[] args) {
	// write your code here
    }
}
