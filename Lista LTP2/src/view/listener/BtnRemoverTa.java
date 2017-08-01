package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import exercicios.Exercicios;

public class BtnRemoverTa implements ActionListener 
{
	private Exercicios ex;
	private JTextField nmeErickField;
	private JTextField nmeRennanField;
	
	public BtnRemoverTa(Exercicios ex, JTextField nmeErickField, JTextField nmeRennanField) 
	{
		this.ex = ex;
		this.nmeErickField =  nmeErickField;
		this.nmeRennanField = nmeRennanField;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try 
		{
			String idtErick = this.ex.tbErickEx15(nmeErickField.getText());
			String idtRennan = this.ex.tbRennanEx15(nmeRennanField.getText());
			
			JOptionPane.showMessageDialog(null, idtErick);
			JOptionPane.showMessageDialog(null, idtRennan);
			
			this.ex.removeTaEx15(idtErick, idtRennan);
			JOptionPane.showMessageDialog(null, "Removido com sucesso");
			
		} 
		catch (Exception e1) 
		{
			JOptionPane.showMessageDialog(null, "falha ao remover");
		}
	}

}
