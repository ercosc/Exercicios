package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;
import view.listener.BtnInsertEx11Listener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InsertEx11Window extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private JTextField registros;
	
	public InsertEx11Window(Exercicios ex) 
	{
		this.ex = ex;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmeroDeRegistros = new JLabel("Número de registros para adicionar:");
		lblNmeroDeRegistros.setBounds(10, 22, 205, 14);
		contentPane.add(lblNmeroDeRegistros);
		
		registros = new JTextField();
		registros.setBounds(10, 47, 205, 20);
		contentPane.add(registros);
		registros.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new BtnInsertEx11Listener(this.ex, registros));
		btnInsert.setBounds(93, 78, 89, 23);
		contentPane.add(btnInsert);
		
		this.setVisible(true);
		this.setResizable(false);
	}

}
