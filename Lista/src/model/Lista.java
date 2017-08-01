package model;

public class Lista 
{
	private No primeiro;
	private No ultimo;
	private int qtdNos;
	
	public Lista()
	{
		this.setPrimeiro(null);
		this.setUltimo(null);
		this.setQtdNos(0);
	}
	
	private boolean listaVazia()
	{
		return (this.getPrimeiro() == null && this.getUltimo() == null);
	}
	
	public void addElementoLista(Object elemento)
	{
		No no = new No(elemento);
		this.setQtdNos((this.getQtdNos() + 1));
		
		if(listaVazia())
			this.setUltimo(no);
		else
			no.setProximo(this.getPrimeiro());
		this.setPrimeiro(no);
	}
	
	public void popElementoLista()
	{
		if(this.listaVazia())
			System.out.println("A lista já está vazia");
		else 
		{
			this.setPrimeiro(this.getPrimeiro().getProximo());
			this.setQtdNos(this.getQtdNos()-1);
		}
	}
	public void mostrarLista()
	{
	
			No no = this.getPrimeiro();
			String concat = "A lista está vazia";
			
			if(!this.listaVazia())
			{
				concat = "";	
			
				while(no != null)
				{
					concat += no.getElemento() + " - ";
					no = no.getProximo();
				}
				System.out.println(concat);
			}
	}
	
	public void removerUltimoLista()
	{
		No no = this.getPrimeiro();
		if(no == this.getUltimo())
		{
			this.setPrimeiro(null);
			this.setUltimo(null);
		}
		
		if(!this.listaVazia())
		{
			if( no == this.getUltimo())
			{
				this.setPrimeiro(null);
				this.setUltimo(null);
			}
			while(no.getProximo() != null)
			{
				if(no.getProximo().getElemento() == this.getUltimo().getElemento())
				{
					this.setUltimo(no);
					no.setProximo(null);
					this.setQtdNos(this.getQtdNos()-1);
					break;
				}
				no = no.getProximo();
			}
			
		}
		else 
			System.out.println("A lista está vazia");
	}
	
	public void removerListaByElemento(Object Elemento)
	{
		
	}
	
	public No getPrimeiro()
	{
		return this.primeiro;
	}
	public void setPrimeiro(No no)
	{
		this.primeiro = no;
	}
	public int getQtdNos()
	{
		return this.qtdNos;
	}
	public void setQtdNos(int qtd)
	{
		this.qtdNos = qtd;
	}
	public No getUltimo()
	{
		return this.ultimo;
	}
	public void setUltimo(No ultimo)
	{
		this.ultimo = ultimo;
	}
}
