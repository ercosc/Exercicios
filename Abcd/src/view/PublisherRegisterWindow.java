package view;

import javax.swing.JOptionPane;

public class PublisherRegisterWindow 
{
	private String name;
	
	public PublisherRegisterWindow()
	{
		this.setName(JOptionPane.showInputDialog("Informe o nome da empresa:"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
