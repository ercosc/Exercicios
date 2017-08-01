package model;

import java.util.ArrayList;

public class ONG 
{
	private String nome;
	private String responsavel;
	private String estado;
	private ArrayList<Posto> postos; 
	
	public ONG(String nome, String responsavel, String estado, ArrayList<Posto> postos) 
	{
		this.setNome(nome);
		this.setResponsavel(responsavel);
		this.setEstado(estado);
		this.setPostos(postos);
	}
	
	public ONG(String nome, String responsavel, String estado) 
	{
		this.setNome(nome);
		this.setResponsavel(responsavel);
		this.setEstado(estado);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<Posto> getPostos() {
		return postos;
	}

	public void setPostos(ArrayList<Posto> postos) {
		this.postos = postos;
	}

	
	
	
}
