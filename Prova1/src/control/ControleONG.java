package control;

import java.util.ArrayList;

import database.SimulatedDatabase;
import model.ONG;


public class ControleONG 
{
	private ONG ong;
	private SimulatedDatabase sdb;
	
	public ControleONG(SimulatedDatabase sdb)
	{
		this.sdb = sdb;
	}
	
	
	public String getONGInformation(String nome)
	{
		return "Nome: " + ong.getNome()
				+"\nResponsavel: " + ong.getResponsavel()
				+"\nEstado: " + ong.getEstado()
				+"\nPostos: " + ong.getPostos();
	}
	
	////public int ongByState(String estado)
	//{
		//int a = 0;
		//if(estado == ong.getEstado())
		//{
		//a++;
		//}
	//	return a;
//	}
	
	
	
	//não sei se funciona.
	//public String witchONG(int quantidadedePessoas)
	//{
	//	String b = "";
	//	double result = 0;
	//	for (int i = 0; i < sdb.getOngs().size(); i++)
	//	{
	//	result = ong.getPostos().get(i).getCapacidade();
		
	//	int a = quantidadedePessoas*500;
	//	if(result > a )
		
	//	 b = ong.getNome();
	//	}
		
	//	return b;
	//}	
	
	
	//acho que estou no caminho certo, mas nao consigo descobrir mais.
	//public ArrayList<String> whichONGs(int homens, int mulheres, int criancas)
	//{
	//	ArrayList<String> ongs = new ArrayList<String>();
	//	int a = homens + mulheres + criancas;
	//	double result = 0;
	//	
	//	for (int i = 0; i < sdb.getOngs().size(); i++)
	//	{
	//	result = ong.getPostos().get(i).getCapacidade();	
	//	}
	//	if (result > a)
	//	{
	//		ongs.add();
	//	}
	//}	
	
	//public boolean helpsVeg(String nomeOng)
	//{
	//	boolean result = false;
	//	for (int i = 0; i < sdb.getOngs().size(); i++)
	//	{
	//		if( ong.getPostos().get(i).isVegetariano())
	//		{
	//			result = true;
	//		}
	//		else
	//		{
	//			result = false;
	//		}
	//	}
	//return result;
	//}	
	//public int helpsGlutenOrLac(String nomeOng)
	//{
	
	//}
	
}

