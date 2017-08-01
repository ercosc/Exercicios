package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import exercicios.Exercicios;

public class BtnAdicionar15b implements ActionListener 
{
	private Exercicios ex;
	private JComboBox tbErickCB;
	private JComboBox tbRennanCB;
	
	public BtnAdicionar15b(Exercicios ex, JComboBox tbErickCB, JComboBox tbRennanCB) 
	{
		this.ex = ex;
		this.tbErickCB = tbErickCB;
		this.tbRennanCB = tbRennanCB;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {			
			this.ex.addTa(this.ex.getIdtTbErick(this.tbErickCB), this.ex.getIdtTbRennan(this.tbRennanCB));
			JOptionPane.showMessageDialog(null, "Itens incluidos com sucesso");
		} 
		catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Falha ao incluir");
		}

	}

}
