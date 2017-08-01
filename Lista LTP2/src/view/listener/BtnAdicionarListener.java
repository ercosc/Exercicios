package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exercicios.Exercicios;

public class BtnAdicionarListener implements ActionListener 
{
	private Exercicios ex;
	
	public BtnAdicionarListener(Exercicios ex) 
	{
		this.ex = ex;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		this.ex.createAddWindow();
	}

}
