package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;
import view.listener.BtnUpdateListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UpdateEx08Window extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private JTextField idtField;
	private JTextField sglField;
	private JTextField nmeField;
	private JTextField valField;

	public UpdateEx08Window(Exercicios ex) 
	{
		this.ex = ex;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 226, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdentificador = new JLabel("Identificador:");
		lblIdentificador.setBounds(10, 30, 74, 14);
		contentPane.add(lblIdentificador);
		
		JLabel lblNewLabel = new JLabel("sglErick:");
		lblNewLabel.setBounds(10, 55, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmeerick = new JLabel("nmeErick: ");
		lblNmeerick.setBounds(10, 80, 74, 14);
		contentPane.add(lblNmeerick);
		
		JLabel lblValerick = new JLabel("valErick:");
		lblValerick.setBounds(10, 105, 74, 14);
		contentPane.add(lblValerick);
		
		idtField = new JTextField();
		idtField.setBounds(94, 27, 86, 20);
		contentPane.add(idtField);
		idtField.setColumns(10);
		
		sglField = new JTextField();
		sglField.setBounds(94, 52, 86, 20);
		contentPane.add(sglField);
		sglField.setColumns(10);
		
		nmeField = new JTextField();
		nmeField.setBounds(94, 77, 86, 20);
		contentPane.add(nmeField);
		nmeField.setColumns(10);
		
		valField = new JTextField();
		valField.setBounds(94, 102, 86, 20);
		contentPane.add(valField);
		valField.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new BtnUpdateListener(this.ex, this.idtField, this.sglField, this.nmeField, this.valField));
		btnUpdate.setBounds(57, 130, 89, 23);
		contentPane.add(btnUpdate);
		
		this.setVisible(true);
		this.setResizable(false);
	}

}
