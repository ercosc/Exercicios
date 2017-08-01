package model;

public class Posto 
{
	private int codigo;
	private double capacidade;
	private boolean vegetariano;
	private boolean semGlutem;
	private boolean semLactose;
	private ONG ong;
	
	public Posto(int codigo, double capacidade, boolean vegetariano, boolean semGlutem, boolean semLactose, ONG ong)
	{
		this.setCodigo(codigo);
		this.setCapacidade(capacidade);
		this.setVegetariano(vegetariano);
		this.setSemGlutem(semGlutem);
		this.setSemLactose(semLactose);
		this.setOng(ong);
		
	}

	public Posto(int codigo, ONG ong)
	{
		this.setCodigo(codigo);
		this.setOng(ong);
	}
	
	public Posto(int codigo, double capacidade)
	{
		this.setCodigo(codigo);
		this.setCapacidade(capacidade);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public boolean isVegetariano() {
		return vegetariano;
	}
	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
	public boolean isSemGlutem() {
		return semGlutem;
	}
	public void setSemGlutem(boolean semGlutem) {
		this.semGlutem = semGlutem;
	}
	public boolean isSemLactose() {
		return semLactose;
	}
	public void setSemLactose(boolean semLactose) {
		this.semLactose = semLactose;
	}
	public ONG getOng() {
		return ong;
	}

	public void setOng(ONG ong) {
		this.ong = ong;
	}
	
	
}
