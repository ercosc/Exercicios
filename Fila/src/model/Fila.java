package model;

public class Fila 
{
	// Atributos da classe
	private int[] elementos;
	private int inicio;
	private int fim;
	private int nItens;
	private int maxItens;
	
	//construtor
	public Fila()
	{
		this.maxItens = 9;
		this.elementos = new int[this.maxItens];
		this.inicio = 0;
		this.fim = 0;
	}
	
	public boolean filaVazia()
	{
		if(this.getNItens() == 0)
			return true;
		else
			return false;
	}
	
	public boolean filaCheia() //metodo para saber se a fila está cheia
	{
		if(this.getNItens() == this.getMaxItens())
			return true;
		else
			return false;
	}
	
	public int desenfileirar(String fila) //metodo para remover o da fila na posição inicial
	{
		int retorno =  0;
		if(filaVazia())
		{
			System.out.println("A fila está vazia");
			return retorno ;
		}
		else
		{
			retorno = this.elementos[this.inicio];
			System.out.println(retorno + " removido com sucesso da posição " + this.inicio + " da " + fila); 
			this.inicio++;
			this.nItens--;
			return retorno;
		}
	}
	
	public void enfileirar(int valor, String fila) // metodo para enfileirar recebendo como parametro o numero para adicionar na fila
	{
		if(this.filaCheia())
			System.out.println("a fila está cheia");
		else if(this.fim == this.maxItens-1)
		{
			this.elementos[fim] = valor;
			System.out.println(valor +" inserido com sucesso na posição " + fim + " na " + fila);
			this.fim = 0;
			this.nItens++;
		}
		else 
		{
			this.elementos[fim] = valor;
			System.out.println(valor +" inserido com sucesso na posição " + fim + " na " + fila);
			this.fim++;
			this.nItens++;
			
		}
	}
	
	// Getters and Setters
	public int[] getElementos()
	{
		return this.elementos;
	}
	
	public int getInicio()
	{
		return this.inicio;
	}
	
	public int getFim()
	{
		return this.fim;
	}
	
	public int getNItens()
	{
		return this.nItens;
	}
	
	public int getMaxItens()
	{
		return this.maxItens;
	}
	

	public void setElementos(int[] elementos) {
		this.elementos = elementos;
	}
	

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	

	public void setFim(int fim) {
		this.fim = fim;
	}
	

	public void setnItens(int nItens) {
		this.nItens = nItens;
	}
	

	public void setMaxItens(int maxItens) {
		this.maxItens = maxItens;
	}
	
}
