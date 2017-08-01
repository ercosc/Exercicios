package aula0311;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.ListarListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listar extends JFrame {

	
	private JPanel contentPane;
	private JTextArea taSaida;


	public Listar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea taSaida = new JTextArea();
		taSaida.setBounds(21, 70, 476, 305);
		contentPane.add(taSaida);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ListarListener(this, taSaida));
		btnListar.setBounds(217, 36, 89, 23);
		contentPane.add(btnListar);
		
	}
 }
