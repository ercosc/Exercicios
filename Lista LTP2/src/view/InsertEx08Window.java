package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;
import view.listener.BtnInsertListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InsertEx08Window extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private JTextField sgl_erickField;
	private JTextField nme_erickField;
	private JTextField val_erickField;

	public InsertEx08Window(Exercicios ex) 
	{
		this.ex = ex;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sglLabel = new JLabel("sgl_erick: ");
		sglLabel.setBounds(10, 31, 48, 14);
		contentPane.add(sglLabel);
		
		JLabel lblNmeerick = new JLabel("nme_erick:");
		lblNmeerick.setBounds(10, 56, 52, 14);
		contentPane.add(lblNmeerick);
		
		JLabel lblValerick = new JLabel("val_erick:");
		lblValerick.setBounds(10, 81, 48, 14);
		contentPane.add(lblValerick);
		
		sgl_erickField = new JTextField();
		sgl_erickField.setBounds(94, 28, 113, 20);
		contentPane.add(sgl_erickField);
		sgl_erickField.setColumns(10);
		
		nme_erickField = new JTextField();
		nme_erickField.setBounds(94, 53, 113, 20);
		contentPane.add(nme_erickField);
		nme_erickField.setColumns(10);
		
		val_erickField = new JTextField();
		val_erickField.setBounds(94, 78, 113, 20);
		contentPane.add(val_erickField);
		val_erickField.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new BtnInsertListener(this.ex, sgl_erickField, nme_erickField, val_erickField));
		btnInsert.setBounds(73, 109, 89, 23);
		contentPane.add(btnInsert);
		
		this.setVisible(true);
		this.setResizable(false);
	}
}
