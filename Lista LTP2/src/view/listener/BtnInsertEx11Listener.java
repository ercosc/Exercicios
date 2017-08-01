package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import exercicios.Exercicios;

public class BtnInsertEx11Listener implements ActionListener 
{
	private Exercicios ex;
	private JTextField registros;
	
	public BtnInsertEx11Listener(Exercicios ex, JTextField registros) 
	{
		this.ex = ex;
		this.registros = registros;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {
			this.ex.ex11(this.registros.getText());
			JOptionPane.showMessageDialog(null, "Item(ns) incluído(s) com sucesso");
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "falha ao incluír");
		}
	}

}
