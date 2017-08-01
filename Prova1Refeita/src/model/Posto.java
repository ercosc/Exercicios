package model;

public class Posto 
{
	private int codigo;
	private double capacidade;
	private boolean vegetarian;
	private boolean semGlutem;
	private boolean semLactose;
	private ONG ong;
	
	public Posto(int codigo, double capacidade, boolean vegetarian, boolean semGlutem, boolean semLactose, ONG ong)
	{
		this.setCodigo(codigo);
		this.setCapacidade(capacidade);
		this.isVegetarian();
		this.isSemGlutem();
		this.isSemLactose();
		this.setOng(ong);
	}
	
	public Posto(int codigo, ONG ong)
	{
		this.setCodigo(codigo);
		this.setOng(ong);
	}
	
	public Posto(int codigo)
	{
		this.setCodigo(codigo);
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
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
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
