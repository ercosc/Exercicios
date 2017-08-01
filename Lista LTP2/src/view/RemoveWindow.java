package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;
import view.listener.BtnAdicionarTa;
import view.listener.BtnRemoverTa;

public class RemoveWindow extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private JTextField nmeErickField;
	private JTextField nmeRennanField;
	
	
	public RemoveWindow(Exercicios ex) 
	{
		this.ex = ex;
		
		setBounds(100, 100, 241, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("nome tb_erick:");
		lblNome.setBounds(10, 29, 103, 14);
		contentPane.add(lblNome);
		
		nmeErickField = new JTextField();
		nmeErickField.setBounds(139, 26, 86, 20);
		contentPane.add(nmeErickField);
		nmeErickField.setColumns(10);
		
		JLabel lblNomeTbrennan = new JLabel("nome tb_rennan:");
		lblNomeTbrennan.setBounds(10, 77, 103, 14);
		contentPane.add(lblNomeTbrennan);
		
		nmeRennanField = new JTextField();
		nmeRennanField.setBounds(139, 74, 86, 20);
		contentPane.add(nmeRennanField);
		nmeRennanField.setColumns(10);
		
		JButton btnRemoverTa = new JButton("Remover");
		btnRemoverTa.addActionListener(new BtnRemoverTa(this.ex, this.nmeErickField, this.nmeRennanField));
		btnRemoverTa.setBounds(59, 113, 89, 23);
		contentPane.add(btnRemoverTa);
		
		this.setVisible(true);
		this.setResizable(false);
	}

}
