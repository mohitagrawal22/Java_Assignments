package com.masaiQ3;

import java.util.Comparator;
public class Song {
	
	 private String movieName;
	 private String songName;
	 
	 void play()
	 {
		 System.out.println(songName+" of "+movieName+" is playing...!");
	 }
	 
	 
	 
	 
	    public Song() {

	    }
	    public Song(String movieName, String songName ) {
	        super();
	        this.movieName=movieName;
	        this.songName=songName;
	        
	    }
	    
	   
	    public void setmovieName(String movieName) {
	        this.movieName = movieName;
	    }
	    public String getmovieName() {
	        return movieName;
	    }
	  
	    public void setsongName(String songName) {
	        this.songName = songName;
	    }
	    public String getsongName() {
	        return songName;
	    }

	

}
