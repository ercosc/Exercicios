package control;

import java.util.ArrayList;

import database.SimulatedDatabase;
import model.Posto;

public class ControlePosto
{
	private SimulatedDatabase sdb;
	
	public ControlePosto(SimulatedDatabase sdb)
	{
		this.sdb = sdb;
	}
	
	//public Posto posto;
	
	//public ArrayList<Posto> postosByCapacity(int x)
	//{
	//	ArrayList<Posto> postos = new ArrayList<Posto>();
	//	
	//	if (x > posto.getCapacidade())
	//	{
	//		postos.add(posto);
	//	}
	//	return postos;
	//}
	
//	public ArrayList<Integer> vegetarianPostos()
//	{
//		ArrayList<Integer> a = new ArrayList<Integer>();

//		if (posto.isVegetariano())
//		{
//			a.add(posto.getCodigo());
//		}
//		return a;
//	}
}
