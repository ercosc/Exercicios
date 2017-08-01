package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;
import view.listener.BtnDeleteListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DeleteEx10Window extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private JTextField idtField;
	
	

	public DeleteEx10Window(Exercicios ex) 
	{
		this.ex = ex;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecioneOIdt = new JLabel("selecione o idt para deletar:");
		lblSelecioneOIdt.setBounds(10, 27, 159, 14);
		contentPane.add(lblSelecioneOIdt);
		
		idtField = new JTextField();
		idtField.setBounds(179, 24, 144, 20);
		contentPane.add(idtField);
		idtField.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new BtnDeleteListener(this.ex, this.idtField));
		btnDelete.setBounds(134, 67, 89, 23);
		contentPane.add(btnDelete);
		
		this.setVisible(true);
		this.setResizable(false);
	}

}
