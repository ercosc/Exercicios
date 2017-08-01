package helper;

import model.ListaEncadeada;

public class Helper 
{
	private ListaEncadeada lista;
	
	public Helper()
	{
		this.lista = new ListaEncadeada();
		
		this.lista.criarInicioLista(10);
		this.lista.criarInicioLista(5);
		this.lista.criarInicioLista(9);
		this.lista.removerNo();
		this.lista.mostrarLista();
		
	}
}
