package main;

import javax.swing.JOptionPane;

import control.ControlManager;
import control.ControleONG;
import control.ControlePosto;
import simulatedDatabase.SimulatedDatabase;

public class Main 
{
	
	public static void main(String[] args) 
	{
		
		ControlManager cm = new ControlManager();
		
		SimulatedDatabase sdb = new SimulatedDatabase();
		ControleONG cONG = new ControleONG(sdb);
		ControlePosto cP = new ControlePosto(sdb);
		
		JOptionPane.showMessageDialog(null, cONG.whitchONGs(10, 10, 10));
	}
}
