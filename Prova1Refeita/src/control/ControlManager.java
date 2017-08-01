package control;

import simulatedDatabase.SimulatedDatabase;
import view.MainView;

public class ControlManager 
{
	private SimulatedDatabase sdb;
	private ControleONG ong;
	private ControlePosto posto;
	private MainView mv;
	
	public ControlManager()
	{
	this.sdb = new SimulatedDatabase();
	this.posto = new ControlePosto(this.sdb);
	this.ong = new ControleONG(this.sdb);
	this.mv = new MainView(this);
	}
	
	public SimulatedDatabase getSdb() {
		return sdb;
	}
	public void setSdb(SimulatedDatabase sdb) {
		this.sdb = sdb;
	}
	public ControleONG getOng() {
		return ong;
	}
	public void setOng(ControleONG ong) {
		this.ong = ong;
	}
	public ControlePosto getPosto() {
		return posto;
	}
	public void setPosto(ControlePosto posto) {
		this.posto = posto;
	}
	
	//public void registerOng()
	//{
	//	
	//}
}
