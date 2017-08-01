package model;

import java.util.ArrayList;

public class Ranking 
{
	private Game game;
	private ArrayList<Score> scores;
	
	public Ranking(Game game)
	{
		this.setGame(game);
	}
	
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public ArrayList<Score> getScores() {
		return scores;
	}
	public void setScores(ArrayList<Score> scores) {
		this.scores = scores;
	}
	
}
