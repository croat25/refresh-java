package linkedlist;

import java.util.ArrayList;

public class Album {

	
	 private String name;
	 
	 private String artist;
	 
	 private ArrayList<Song> songs;

	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	 
	 public boolean addSong(String title, double duration){
		 if(findsong(title)==null){
			 this.songs.add(new Song(title,duration));
			 return true;
			 
		 }
		 return false;
	 }
	 
	 private Song findsong(String title){
		 for(Song checkedSong: this.songs){
			 if(checkedSong.getTitle().equals(title)){
				 return checkedSong;
			 }
		 }
		 return null;
	 }
	 
	 public boolean addto(int tracknumber, LinkedList<Song> playlist){
		 int index = tracknnumber-1;
		 
	 }
}
