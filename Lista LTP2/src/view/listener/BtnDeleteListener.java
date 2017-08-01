package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import exercicios.Exercicios;

public class BtnDeleteListener implements ActionListener 
{
	private Exercicios ex;
	private JTextField idtField;
	
	public BtnDeleteListener(Exercicios ex, JTextField idtField)
	{
		this.ex = ex;
		this.idtField = idtField;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try {
			this.ex.ex10(this.idtField.getText());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
