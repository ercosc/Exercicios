package control;

import java.util.ArrayList;

import model.Posto;
import simulatedDatabase.SimulatedDatabase;

public class ControlePosto 
{
	private SimulatedDatabase sdb;
	
	public ControlePosto(SimulatedDatabase sdb)
	{
		this.sdb = sdb;
		
	}
	
	public ArrayList<Posto> postosByCapacity(int x)
	{
		ArrayList<Posto> postos = new ArrayList<Posto>();
		for(int i = 0; i < sdb.getPostos().size(); i++)
		{
			if( x > this.sdb.getPostos().get(i).getCapacidade())
			{
				postos.add(this.sdb.getPostos().get(i));
			}
		}
		
		return postos;

	}
	public ArrayList<Integer> vegetarianPostos()
	{
		ArrayList<Integer> veg = new ArrayList<Integer>();
		for(int i = 0; i < this.sdb.getPostos().size(); i++)
		{
			if(this.sdb.getPostos().get(i).isVegetarian())
			{
				veg.add(this.sdb.getPostos().get(i).getCodigo());
			}
		}
		return veg;
	}

}
