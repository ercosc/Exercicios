package view;

import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;

public class Ex05Window extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private ResultSet rs;
	private JTextArea ta;

	public Ex05Window(Exercicios ex, ResultSet rs) throws Exception 
	{
		this.ex = ex;
		this.rs = rs;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(36, 33, 357, 187);
		contentPane.add(textArea);
		this.ta = textArea;
		
		this.addTa(textArea, rs);
		this.setVisible(true);
		this.setResizable(false);
	}
	private void addTa(JTextArea ta, ResultSet rs) throws Exception
	{
		int i = 0;
		while(rs.next())
		{
			this.ta.append(rs.getString("sgl_erick") + " " 
										+ rs.getString("nme_erick") 
										+ " " + rs.getString("val_erick") + "\n");
			i++;
		}
		this.ta.append("Quantidade de registros lidos: " + i);
	}

}
