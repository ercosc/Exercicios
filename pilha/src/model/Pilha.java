package model;

public class Pilha 
{
	private int[] pilha;
	private int topoPilha;
	
	public Pilha()
	{
		this.pilha = new int[10];
		this.topoPilha = 0;
	}
	
	public void emplilha(int value, String p)
	{
		if(this.topoPilha < 10)
		{
		System.out.println("emplihado na " + p + ": " +  value);
		this.pilha[this.topoPilha] = value;
		this.topoPilha++;
		}
		else
			System.out.println("a pilha está cheia");
	}
	
	public int desempilha(String p)
	{
		int aux = -1;
		if(this.topoPilha > 0)
		{
			aux = this.pilha[this.topoPilha-1];
			System.out.println("removido da " + p + ": " + aux);
			this.topoPilha--;
		}else{
			System.out.println("a " + p + " está vazia");
		}
		return  aux;
		
	}

	public int[] getPilha() {
		return pilha;
	}

	public void setPilha(int[] pilha) {
		this.pilha = pilha;
	}

	public int getTopoPilha() {
		return topoPilha;
	}

	public void setTopoPilha(int topoPilha) {
		this.topoPilha = topoPilha;
	}
	
	public boolean pilhaNull()
	{
		if(this.topoPilha != 0)
		{
			return true;
		}
		else 
			return false;
	}
}
