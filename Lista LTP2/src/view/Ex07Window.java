package view;

import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;

public class Ex07Window extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private ResultSet rs;
	private JTextArea textArea;

	public Ex07Window(Exercicios ex, ResultSet rs) throws Exception 
	{
		this.ex = ex;
		this.rs = rs;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 41, 354, 183);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		this.textArea = textArea;
		
		this.populateTa(this.textArea, this.rs);
		
		this.setVisible(true);
		this.setResizable(false);
	}
	
	private void populateTa(JTextArea ta, ResultSet rs) throws Exception
	{
		while(rs.next())
		{
			ta.append(rs.getString("sgl_erick") + "     " 
			+ rs.getString("nme_erick") + "     " 
			+ rs.getString("RA") + "\n");
		}
	}
}
