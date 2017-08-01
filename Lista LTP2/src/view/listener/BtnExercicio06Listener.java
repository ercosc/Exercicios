package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exercicios.Exercicios;

public class BtnExercicio06Listener implements ActionListener 
{
	private Exercicios ex;
	
	public BtnExercicio06Listener(Exercicios ex) 
	{
		this.ex = ex;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		try {
			this.ex.ex06();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
