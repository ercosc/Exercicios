package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Music 
	{
		private String name;
		private String artist;
		
		//este atributo representa a duração em segundos.
		private int length;
		private int year;
		private ArrayList<String> genres;
		private String album;
		
		public Music(String name,
					 String artist,
					 int length,
					 int year,
					 ArrayList<String> genres,
					 String album)
		{
			this.setName(name);
			this.setArtist(artist);
			this.setLength(length);
			this.setYear(year);
			this.setGenres(genres);
			this.setAlbum(album);
			
		}
	public Music(String name, String artist, String album)
	{
		this.setName(name);
		this.setArtist(artist);
		this.setAlbum(album);
		
	}
		
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public ArrayList<String> getGenres() {
			return genres;
		}
		public void setGenres(ArrayList<String> genres) {
			this.genres = genres;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}	
		public String toString()
		{
			return "Name: " + this.getName() +'\n'+
					"Artist: " + this.getArtist() + '\n'+
					"Length: " + this.getLength() + '\n'+
					"Year: " + this.getYear() + '\n'+
					"Genres: " + this.getGenres() + '\n'+
					"Album: " + this.getAlbum();
		}
		
	}
