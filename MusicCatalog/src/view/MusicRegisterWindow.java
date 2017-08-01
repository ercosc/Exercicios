package view;

import javax.swing.JOptionPane;

public class MusicRegisterWindow 
{
	private String name;
	private String artist;
	private String length;
	private String year;
	private String genres;
	private String album;
	
	public MusicRegisterWindow()
	{
		this.name = JOptionPane.showInputDialog("nome: ");
		this.artist = JOptionPane.showInputDialog("Artista: ");
		this.length = JOptionPane.showInputDialog("Duração: ");	
		this.year = JOptionPane.showInputDialog("Ano: ");
		this.genres = JOptionPane.showInputDialog("Generos (separados por ';'): ");
		this.album = JOptionPane.showInputDialog("Album: ");
		
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

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
}
