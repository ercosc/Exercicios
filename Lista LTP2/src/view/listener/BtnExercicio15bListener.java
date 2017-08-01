package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exercicios.Exercicios;

public class BtnExercicio15bListener implements ActionListener 
{
	private Exercicios ex;
	
	public BtnExercicio15bListener(Exercicios ex)
	{
		this.ex = ex;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		this.ex.createEx15bWindow();
	}

}
