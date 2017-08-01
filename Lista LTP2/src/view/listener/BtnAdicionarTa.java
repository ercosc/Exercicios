package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import exercicios.Exercicios;

public class BtnAdicionarTa implements ActionListener 
{
	private Exercicios ex;
	private JTextField nmeErickField;
	private JTextField nmeRennanField;
	
	public BtnAdicionarTa(Exercicios ex, JTextField nmeErickField, JTextField nmeRennanField) 
	{
		this.ex = ex;
		this.nmeErickField = nmeErickField;
		this.nmeRennanField = nmeRennanField;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {
			String idtErick = this.ex.tbErickEx15(this.nmeErickField.getText());
			String idtRennan = this.ex.tbRennanEx15(this.nmeRennanField.getText());
		 
			this.ex.addTa(idtErick, idtRennan);

			JOptionPane.showMessageDialog(null, "Adicionado com sucesso");
		} catch (Exception e1) 
		{
			JOptionPane.showMessageDialog(null, "falha ao adicionar");
		}
		
	}

}
