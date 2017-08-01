package model;

import java.util.ArrayList;

public class Game 
{
	private String name;
	private Publisher publisher;
	private ArrayList<String> genres;
	
	public Game(String name, Publisher publisher, ArrayList<String> genres)
	{
		this.setName(name);
		this.setPublisher(publisher);
		this.setGenres(genres);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public ArrayList<String> getGenres() {
		return genres;
	}
	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}
	
	
}
