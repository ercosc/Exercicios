package control;

import java.util.ArrayList;

import database.SimulatedDatabase;
import model.Music;
import view.MusicRegisterWindow;

public class MusicControl
{
	private MusicRegisterWindow mrw;
	private SimulatedDatabase sdb;
	
	
	public MusicControl(SimulatedDatabase sdb)
	{
		this.sdb = sdb;
	}
	
	public void registerMusic(String name,
			 String artist,
			 int length,
			 int year,
			 ArrayList<String> genres,
			 String album)
	{
		Music m = new Music(name, artist, length, year, genres, album);
		sdb.addMusic(m);		
	}
	
	
	public void registerMusic()
	{
		this.mrw = new MusicRegisterWindow();
		this.registerMusic(this.mrw.getName(),
						   this.mrw.getArtist(),
						   Integer.parseInt(this.mrw.getLength()),
						   Integer.parseInt(this.mrw.getYear()),
						   parseGenres(this.mrw.getGenres()),
						   this.mrw.getAlbum());
	}
	private ArrayList<String> parseGenres(String genres)
	{
		String [] arrayGenres = genres.split(";");
		ArrayList<String> genre = new ArrayList<String>();
		
		for (int i = 0; i < arrayGenres.length; i++)
		{
			genre.add(arrayGenres[i]);
		}
		return genre;
	}
}
