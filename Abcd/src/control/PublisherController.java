package control;

import dataBase.SimulatedDatabase;
import helper.Writer;
import model.Publisher;
import view.PublisherRegisterWindow;

public class PublisherController 
{
	private SimulatedDatabase sdb;
	private PublisherRegisterWindow prw;
	private Writer writer;
	
	public PublisherController(SimulatedDatabase sdb)
	{
		this.sdb = sdb;
		
	}
	
	public void RegisterPublisher()
	{
		this.prw = new PublisherRegisterWindow();
		this.registerPublisher(this.prw.getName());
		this.writer = new Writer("Publishers.txt");
	}
	
	private void registerPublisher(String name)
	{
		Publisher p = new Publisher(name);
		
		this.sdb.addPublisher(p);
		
		writePublisher(p);
	}
	
	public void writePublisher(Publisher p)
	{
		if(p.getGames().size() == 0)
			this.writer.write(p.getName() + ";");
		else
		{
			for(int i = 0; i < p.getGames().size(); i++)
			{
				this.writer.write(p.getName() + ";" + p.getGames().get(i).getName());
			}
		}
	this.writer.close();	
	}
}
