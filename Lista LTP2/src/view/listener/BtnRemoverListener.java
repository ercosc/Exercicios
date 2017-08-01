package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exercicios.Exercicios;

public class BtnRemoverListener implements ActionListener 
{
	private Exercicios ex;
	
	public BtnRemoverListener(Exercicios ex) 
	{
		this.ex = ex;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		this.ex.createRemoveWindow();
	}

}
