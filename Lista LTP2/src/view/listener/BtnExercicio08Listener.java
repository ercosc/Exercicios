package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import exercicios.Exercicios;

public class BtnExercicio08Listener implements ActionListener 
{
	private Exercicios ex;
	
	public BtnExercicio08Listener(Exercicios ex) 
	{
		this.ex = ex;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		this.ex.createInsertEx08Window();
	}
}
