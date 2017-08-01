package model;

public class ListaTelefonica 
{
	private Telefone[] telefones;
	private int ultimoPos;
	
	public ListaTelefonica()
	{
		this.telefones = new Telefone[10];
	}
	
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	public int getUltimoPos() {
		return ultimoPos;
	}
	public void setUltimoPos(int ultimoPos) {
		this.ultimoPos = ultimoPos;
	}
}
