package control;

import javax.swing.JOptionPane;

import database.SimulatedDatabase;
import view.MainWindow;

public class ControlManager 
{
	private MusicControl mc;
	private SimulatedDatabase sdb;
	private MainWindow mainWindow;
	
	public ControlManager()
	{
		this.sdb = new SimulatedDatabase();
		this.mc  = new MusicControl(this.sdb);
		this.mainWindow = new MainWindow();
		treatOption(this.mainWindow.getOption());
	}
	
	
	
	public void registerMusic()
	{
		mc.registerMusic();
	}

	public void treatOption(String option)
	{
		while(true)
		{
			switch(option)
			{
			case "1": registerMusic();
			break;
			
			case "2": this.sdb.showMusic();
			break;
			
			case "3": JOptionPane.showMessageDialog(null, "até logo!");
			return;
			
			default: JOptionPane.showMessageDialog(null, "Digite um numero válido, seu ANIMAL!!");
			}
			option = mainWindow.getOption();
		}
	}
}

