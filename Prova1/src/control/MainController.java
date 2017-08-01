package control;

import database.SimulatedDatabase;
import view.MainView;

public class MainController 
{
	private SimulatedDatabase sdb;
	private ControleONG cONG;
	private ControlePosto cp;
	private MainView mv;
	
	public MainController()
	{
		this.sdb = new SimulatedDatabase();
		this.cONG = new ControleONG(this.sdb);
		this.cp = new ControlePosto(this.sdb);
		this.mv = new MainView(this);
		
	}
	

}
