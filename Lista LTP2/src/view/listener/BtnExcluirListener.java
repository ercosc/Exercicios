package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import database.Database;
import exercicios.Exercicios;

public class BtnExcluirListener implements ActionListener 
{
	private Exercicios ex;
	private String idt;
	private Database db;
	
	public BtnExcluirListener(Exercicios ex, String idt, Database db) 
	{
		this.ex = ex;
		this.idt = idt;
		this.db = db;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {
			this.ex.deleteEx10(this.idt, this.db);
			JOptionPane.showMessageDialog(null, "Excluido com sucesso");
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "falha ao excluir");
			e1.printStackTrace();
		}
	}

}
