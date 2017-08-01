package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import exercicios.Exercicios;

public class BtnExercicio05Listener implements ActionListener 
{
	private Exercicios ex;
	
	public BtnExercicio05Listener(Exercicios ex) 
	{
		this.ex = ex;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		try {
			this.ex.ex05();
		} catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "exception");
		}
	}

}
