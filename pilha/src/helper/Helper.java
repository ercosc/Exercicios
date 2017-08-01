package helper;

import model.Pilha;

public class Helper 
{
	private Pilha pilha1;
	private Pilha pilha2;
	private Pilha pilha3;
	
	
	public Helper()
	{
		this.pilha1 = new Pilha();
		this.pilha2 = new Pilha();
		this.pilha3 = new Pilha();
		this.montarPilha1();
		
		this.iniciar();
		System.out.println("------");
		
		this.pilha3Pilha1();

	}
	private void montarPilha1()
	{
		int[] array = {4,1,5,3,2,7,6};
		this.pilha1.setPilha(array);
		this.pilha1.setTopoPilha(7);
	}
	private void EvenOrOdd(int value)
	{
		if(value % 2 == 0)
		{
			this.pilha3.emplilha(value, "pilha3");
		}
		else
		{
			this.pilha2.emplilha(value, "pilha2");
		}
	}
	private void iniciar()
	{
		while(this.pilha1.pilhaNull())
		{
			this.EvenOrOdd(this.pilha1.desempilha("pilha1"));
			System.out.println("\n");
		}
	}
	private void pilha3Pilha1()
	{
		while(this.pilha3.pilhaNull())
		{
			this.pilha1.emplilha(this.pilha3.desempilha("pilha3"), "pilha1");
			System.out.println("\n");
		}
	}
}
