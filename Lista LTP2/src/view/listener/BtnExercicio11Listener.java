package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exercicios.Exercicios;

public class BtnExercicio11Listener implements ActionListener 
{
	private Exercicios ex;
	
	public BtnExercicio11Listener(Exercicios ex) 
	{
		this.ex = ex;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		this.ex.InsertEx11Window();
	}

}
