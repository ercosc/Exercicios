package control;

import java.util.ArrayList;

import simulatedDatabase.SimulatedDatabase;

public class ControleONG {

	private SimulatedDatabase sdb;
	

	public ControleONG(SimulatedDatabase sdb)
	{
		
		this.sdb = sdb;
			
	}
	
	
	public String getONGInformation(String nome)
	{
	String result = "";
		for(int index = 0 ; index < sdb.getOngs().size() ; index++)
		{
			if(nome == this.sdb.getOngs().get(index).getNome())
			{
				result = this.sdb.getOngs().get(index).getNome() +" "+
						this.sdb.getOngs().get(index).getEstado() +" "+
						this.sdb.getOngs().get(index).getResponsavel()+" ";
			}
			
		}
		return result;
	}
	
	public int ongByState(String estado)
	{
		int a = 0;
		for (int i = 0; i < sdb.getOngs().size(); i++)
		{
			if(estado == this.sdb.getOngs().get(i).getEstado())
			{
				a++;
			}
		}
		return a;
	}
	
	public String whitchONG(int quantidadedepessoas)
	{
		for(int i = 0; i < this.sdb.getPostos_com_ong().size(); i++)
		{
			if(quantidadedepessoas*0.5 <= this.sdb.getPostos_com_ong().get(i).getCapacidade())
			{
				return this.sdb.getPostos_com_ong().get(i).getOng().getNome();
			}
		}
		return "Não existe ongs.";
	
	}
	public ArrayList<String> whitchONGs(int homens, int mulheres, int criancas)
	{
		ArrayList<String> ongsNames = new ArrayList<String>();
		for(int i = 0; i < this.sdb.getPostos_com_ong().size(); i++)
		{
			if(homens*0.5+mulheres*0.3+criancas*0.15 <= this.sdb.getPostos_com_ong().get(i).getCapacidade())
			{
				ongsNames.add(this.sdb.getPostos_com_ong().get(i).getOng().getNome());
			}
		}
		
		return ongsNames;
	}
	
	public boolean helpsVegetarians(String nomeOng)
	{
		boolean result = false;
		for(int i = 0; i < this.sdb.getPostos_com_ong().size(); i++)
		{
			if(this.sdb.getPostos_com_ong().get(i).getOng().getNome() == nomeOng)
			{
				if(this.sdb.getPostos_com_ong().get(i).isVegetarian())
				{
					result = true;
				}
			}
		}
		return result;
	}
	public int hepsGlutenOrLac(String nomeOng)
	{
		int result = 0;
		for(int i=0; i < this.sdb.getPostos_com_ong().size(); i++)
		{
			if(nomeOng == this.sdb.getPostos_com_ong().get(i).getOng().getNome())
			{
				if(this.sdb.getPostos_com_ong().get(i).isSemGlutem() || this.sdb.getPostos_com_ong().get(i).isSemLactose())
				{
					result++;
				}
			}
		}
		
		return result;
	}
	
	
	
}
