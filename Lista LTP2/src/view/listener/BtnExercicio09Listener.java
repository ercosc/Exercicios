package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exercicios.Exercicios;

public class BtnExercicio09Listener implements ActionListener 
{
	private Exercicios ex;

	public BtnExercicio09Listener(Exercicios ex) 
	{
		this.ex = ex;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		this.ex.createUpdateEx08Window();
	}

}
