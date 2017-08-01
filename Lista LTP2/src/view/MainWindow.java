package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;
import view.listener.BtnExercicio05Listener;
import view.listener.BtnExercicio06Listener;
import view.listener.BtnExercicio07Listener;
import view.listener.BtnExercicio08Listener;
import view.listener.BtnExercicio09Listener;
import view.listener.BtnExercicio10Listener;
import view.listener.BtnExercicio11Listener;
import view.listener.BtnExercicio15Listener;
import view.listener.BtnExercicio15bListener;

public class MainWindow extends JFrame 
{

	private JPanel contentPane;
	private Exercicios ex;

	public MainWindow(Exercicios ex) 
	{
		this.ex = ex;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 158, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExercicio05 = new JButton("Exercício 05");
		btnExercicio05.addActionListener(new BtnExercicio05Listener(this.ex));
		btnExercicio05.setBounds(0, 11, 150, 23);
		contentPane.add(btnExercicio05);
		
		JButton btnExercicio06 = new JButton("Exercício 06");
		btnExercicio06.addActionListener(new BtnExercicio06Listener(this.ex));
		btnExercicio06.setBounds(0, 34, 150, 23);
		contentPane.add(btnExercicio06);
		
		JButton btnExercicio07 = new JButton("Exercício 07");
		btnExercicio07.addActionListener(new BtnExercicio07Listener(this.ex));
		btnExercicio07.setBounds(0, 56, 150, 23);
		contentPane.add(btnExercicio07);
		
		JButton btnExercicio08 = new JButton("Exercício 08");
		btnExercicio08.addActionListener(new BtnExercicio08Listener(this.ex));
		btnExercicio08.setBounds(0, 78, 150, 23);
		contentPane.add(btnExercicio08);
		
		JButton btnExercicio09 = new JButton("Exercício 09");
		btnExercicio09.addActionListener(new BtnExercicio09Listener(this.ex));
		btnExercicio09.setBounds(0, 100, 150, 23);
		contentPane.add(btnExercicio09);
		
		JButton btnExercicio10 = new JButton("Exercício 10");
		btnExercicio10.addActionListener(new BtnExercicio10Listener(this.ex));
		btnExercicio10.setBounds(0, 123, 150, 23);
		contentPane.add(btnExercicio10);
		
		JButton btnExercicio11 = new JButton("Exercício 11");
		btnExercicio11.addActionListener(new BtnExercicio11Listener(this.ex));
		btnExercicio11.setBounds(0, 146, 150, 23);
		contentPane.add(btnExercicio11);
		
		JButton btnExercicio15 = new JButton("Exercício 15");
		btnExercicio15.addActionListener(new BtnExercicio15Listener(this.ex));
		btnExercicio15.setBounds(0, 169, 150, 23);
		contentPane.add(btnExercicio15);
		
		JButton btnExercicio15b = new JButton("Exercício 15b");
		btnExercicio15b.addActionListener(new BtnExercicio15bListener(this.ex));
		btnExercicio15b.setBounds(0, 194, 150, 23);
		contentPane.add(btnExercicio15b);
		
		this.setVisible(true);
		this.setResizable(false);
	}

}
