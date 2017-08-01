package helper;

import model.Fila;

public class Helper 
{
	// atributos da classe
	private Fila f1;
	private Fila f2;
	private Fila f3;
	
	public Helper() // construtor
	{
		this.ex();
	}
	
	private void ex() // metodo que constrói o exercicio proposto
	{
		this.f1 = new Fila();
		this.f2 = new Fila();
		this.f3 = new Fila();
		
		this.montarF1();
		
		System.out.println("\n ------------------------------------------------- \n");
		
		this.desenfileirarTudoF1();
		
		System.out.println("\n ------------------------------------------------- \n");
		
		this.reEnfileirarF1();
		
		this.mostrarFilas();
	}
	
	private void montarF1() //monta a fila 1 de acordo com o exercicio
	{
		this.f1.enfileirar(4, "f1");// string passada só para fim de identificação pra pintar na tela
		this.f1.enfileirar(1, "f1");
		this.f1.enfileirar(5, "f1");
		this.f1.enfileirar(3, "f1");
		this.f1.enfileirar(2, "f1");
		this.f1.enfileirar(7, "f1");
		this.f1.enfileirar(6, "f1");
	}
	
	private void desenfileirarTudoF1() // inicio do conjunto de funções de desenfileiramento e enfileiramento
	{
		while(!f1.filaVazia())
		{
			this.parOuImpar(f1.desenfileirar("f1"));
		}
	}

	private void parOuImpar(int valor) // verifica se o numero é par ou impar para saber em qual fila enfileirar
	{
		if(valor % 2 == 0)
		{
			f2.enfileirar(valor, "f2");
		}
		else
		{
			f3.enfileirar(valor, "f3");
		}
	}
	
	private void reEnfileirarF1() // após desenfileirar a f1, reenfileira passando os valores pares
	{
		while(!f3.filaVazia())
		{
			f1.enfileirar(f3.desenfileirar("f3"), "f1");
		}
	}
	
	private void mostrarFilas() // mostra todas as filas
	{
		System.out.println("fila 1 - ");
		this.mostrarF1();
		
		System.out.println("fila 2 - ");
		this.mostrarF2();
		
		System.out.println("fila 3 - ");
		this.mostrarF3();
	}

	private void mostrarF1() // mostra a fila 1
	{
		if(f1.getInicio() > f1.getFim())
		{
			for(int i = f1.getInicio(); i < f1.getMaxItens(); i++)
			{
				System.out.println(f1.getElementos()[i] + " na posição " + i);
			}
		
			for(int i = 0; i < f1.getFim(); i++)
			{
				System.out.println(f1.getElementos()[i] + " na posição " + i);
			}
		}
		else
		{
			for(int i = f1.getInicio(); i < f1.getFim(); i++)
			{
				System.out.println(f1.getElementos()[i] + " na posição " + i);
			}
		}
	}
	
	private void mostrarF2() // mostra a fila 
	{
		if(f2.getInicio() > f2.getFim())
		{
			for(int i = f2.getInicio(); i < f2.getMaxItens(); i++)
			{
				System.out.println(f2.getElementos()[i] + " na posição " + i);
			}
		
			for(int i = 0; i < f2.getFim(); i++)
			{
				System.out.println(f2.getElementos()[i] + " na posição " + i);
			}
		}
		else
		{
			for(int i = f2.getInicio(); i < f2.getFim(); i++)
			{
				System.out.println(f2.getElementos()[i] + " na posição " + i);
			}
		}
	}
	
	private void mostrarF3() // mostra a fila 3
	{
		if(f3.getInicio() > f3.getFim())
		{
			for(int i = f3.getInicio(); i < f3.getMaxItens(); i++)
			{
				System.out.println(f3.getElementos()[i] + " na posição " + i);
			}
		
			for(int i = 0; i < f3.getFim(); i++)
			{
				System.out.println(f3.getElementos()[i] + " na posição " + i);
			}
		}
		else
		{
			for(int i = f3.getInicio(); i < f3.getFim(); i++)
			{
				System.out.println(f3.getElementos()[i] + " na posição " + i);
			}
		}
	}
}
