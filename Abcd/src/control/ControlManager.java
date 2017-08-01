package control;

import dataBase.SimulatedDatabase;
import view.MainWindow;

public class ControlManager 
{
	private SimulatedDatabase sdb;
	private PublisherController pc;
	private MainWindow mw;
	
	
	public ControlManager()
	{
		this.sdb = new SimulatedDatabase();
		this.pc = new PublisherController(this.sdb);
		this.mw = new MainWindow(this);
	}


	public void showRegisterPublisher() 
	{
		this.pc.RegisterPublisher();
		
	}
	
	
}
