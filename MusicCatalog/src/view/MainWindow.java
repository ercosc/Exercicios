package view;

import javax.swing.JOptionPane;

public class MainWindow
{
	private String option;
	
	public MainWindow()
	{
	
	}
	public String getOption()
	{
		this.option = JOptionPane.showInputDialog(""+
				"1- Cadastrar Musica: "+'\n'+
				"2- Listar todas as musicas: "+'\n'+
				"3- Sair: "+'\n');
		return this.option;
	}
	
}
