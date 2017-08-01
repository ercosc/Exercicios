package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import exercicios.Exercicios;

public class BtnInsertListener implements ActionListener 
{
	private Exercicios ex;
	private JTextField sgl_erickField;
	private JTextField nme_erickField;
	private JTextField val_erickField;
	
	public BtnInsertListener(Exercicios ex, JTextField sglField, JTextField nmeField, JTextField valField) 
	{
		this.ex = ex;
		this.sgl_erickField = sglField;
		this.nme_erickField = nmeField;
		this.val_erickField = valField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try 
		{
			this.ex.ex08(this.sgl_erickField.getText(), this.nme_erickField.getText(), this.val_erickField.getText());
			JOptionPane.showMessageDialog(null, "adicionado na tabela");
		} 
		catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Falha na inserção");
		}
	}

}
