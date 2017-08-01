package model;

import java.util.ArrayList;

public class Publisher 
{
	private String name;
	private ArrayList<Game> games;
	
	public Publisher(String name)
	{
		this.setName(name);
		this.games = new ArrayList<Game>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}

	
}
