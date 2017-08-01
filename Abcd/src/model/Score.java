package model;

public class Score 
{
	private int score;
	private Player player;
	
	public Score(int Score, Player player)
	{
		this.setScore(Score);
		this.setPlayer(player);
	}
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
}
