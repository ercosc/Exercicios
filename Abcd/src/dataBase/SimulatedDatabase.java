package dataBase;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Game;
import model.Player;
import model.Publisher;
import model.Ranking;
import model.Score;

public class SimulatedDatabase 
{
	private ArrayList<Publisher> publishers;
	private ArrayList<Ranking> rankings;
	private ArrayList<Player> players;
	private ArrayList<Score> scores;
	private ArrayList<Game> games;
	
	
	public SimulatedDatabase()
	{
		this.publishers = new ArrayList<Publisher>();
		this.rankings = new ArrayList<Ranking>();
		this.players = new ArrayList<Player>();
		this.scores = new ArrayList<Score>();
		this.games = new ArrayList<Game>();
		
	}
	
	public void addPublisher(Publisher p)
	{
		this.publishers.add(p);
		//JOptionPane.showMessageDialog(null, "Salvo com sucesso");
	}
}
