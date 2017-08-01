package database;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Music;
public class SimulatedDatabase 
{
	public ArrayList<Music> songs;
	
	public SimulatedDatabase()
	{
		this.songs = new ArrayList<Music> ();
	}
	
	public void addMusic(Music m)
	{
		this.songs.add(m);
		
	}
	
	public void showMusic()
	{
		for(int i = 0 ; i<songs.size(); i++)
		{
			Music m = songs.get(i);
			String s = m.toString();
			JOptionPane.showMessageDialog(null, s);
		}
		
	}
	
	
}
