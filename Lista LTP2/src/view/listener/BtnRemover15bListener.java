package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import exercicios.Exercicios;

public class BtnRemover15bListener implements ActionListener 
{
	private Exercicios ex;
	private JComboBox tbErick;
	private JComboBox tbRennan;
	
	public BtnRemover15bListener(Exercicios ex, JComboBox tbErick, JComboBox tbRennan)
	{
		this.ex = ex;
		this.tbErick = tbErick;
		this.tbRennan = tbRennan;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {
			this.ex.removeTaEx15(this.ex.getIdtTbErick(this.tbErick), this.ex.getIdtTbRennan(this.tbRennan));
			JOptionPane.showMessageDialog(null, "itens removidos com sucesso");
		} 
		catch (Exception e1) 
		{
			JOptionPane.showMessageDialog(null, "falha ao excluir");
		}
	}

}
