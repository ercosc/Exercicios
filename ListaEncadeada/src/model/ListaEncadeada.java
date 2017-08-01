package model;

public class ListaEncadeada 
{
	private No primeiro;
	private No ultimo;
	private int nNos;
	
	public ListaEncadeada()
	{
		this.setPrimeiro(null);
		this.setUltimo(null);
		this.setnNos(0);
	}
	
	
	public boolean isVazia()
	{
		if(this.primeiro == null && this.ultimo == null)
			return true;
		else
			return false;
	}
	
	public void criarInicioLista(Object elemento)
	{
		No novoNo = new No(elemento);
		this.nNos++;
		
		if(this.isVazia())
			this.setUltimo(novoNo);
		
		else
			novoNo.setProximo(primeiro);
		
		this.setPrimeiro(novoNo);;
	}
	
	public Object buscarNo(Object elemento)
	{
		Object retorno = null;
		No no = this.getPrimeiro();
		while(no != null)
		{
			if(no.getElemento() == elemento)
			{
				System.out.println("o numero " + elemento + " está na lista");
				retorno = elemento;
			}
			
			no = no.getProximo();
		}
		if(retorno == null)
		{
			System.out.println("o numero " + elemento + " não está na lista");
		}
		return retorno;
	}
	//public void removerNo(Object elemento)
	//{
	//	No no = this.getPrimeiro();
	//	if(no == this.getUltimo())
	//	{
	//		if(no.getElemento() == elemento)
	//		{
	//		this.setPrimeiro(null);
	//		this.setUltimo(null);
	//		}
	//		else
	//		{
	//			System.out.println("elemento não está na lista");
	//		}
	//	}
	//	else if(no.getProximo() == this.getUltimo())
	//	{
	//		if(no.getElemento() == elemento)
	//		no.setProximo(null);
	//		this.setUltimo(no);
	//	}	
	//}
	
	public void removerNo()
	{
		No no = this.getPrimeiro();
		
		if(no == this.getUltimo())
		{
			this.setPrimeiro(null);
			this.setUltimo(null);
		}else
		{
			while(no != null)
			{
				if(no.getProximo() == this.getUltimo())
				{
					no.setProximo(null);
					this.setUltimo(no);
				}
				no = no.getProximo();
			}
		}
	}
	public void mostrarLista()
	{
		No no = this.getPrimeiro();
		String concat = "";
		
		while(no != null)
		{
			concat += no.getElemento() + " - ";
			no = no.getProximo();
		}
		System.out.println(concat);
	}

	public No getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}
	public No getUltimo() {
		return ultimo;
	}
	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}
	public int getnNos() {
		return nNos;
	}
	public void setnNos(int nNos) {
		this.nNos = nNos;
	}
}
