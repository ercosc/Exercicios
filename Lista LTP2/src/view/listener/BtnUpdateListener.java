package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import exercicios.Exercicios;

public class BtnUpdateListener implements ActionListener 
{
	private Exercicios ex;
	private JTextField idtErick;
	private JTextField sglErick;
	private JTextField nmeErick;
	private JTextField valErick;
	
	public BtnUpdateListener(Exercicios ex, JTextField idtErick, JTextField sglErick, JTextField nmeErick, JTextField valErick) 
	{
		this.ex = ex;
		this.idtErick = idtErick;
		this.sglErick = sglErick;
		this.nmeErick = nmeErick;
		this.valErick = valErick;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try 
		{
			this.ex.ex09(this.idtErick.getText(), this.sglErick.getText(), this.nmeErick.getText(), this.valErick.getText());
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Falha ao atualizar");
			e1.printStackTrace();
		}
	}

}
