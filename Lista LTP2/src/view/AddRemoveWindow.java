package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;
import view.listener.BtnAdicionarListener;
import view.listener.BtnRemoverListener;

public class AddRemoveWindow extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	
	public AddRemoveWindow(Exercicios ex) 
	{
		this.ex = ex;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 273, 98);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdicionar = new JButton("Adicionar ");
		btnAdicionar.addActionListener(new BtnAdicionarListener(this.ex));
		btnAdicionar.setBounds(10, 11, 99, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new BtnRemoverListener(this.ex));
		btnRemover.setBounds(148, 11, 99, 23);
		contentPane.add(btnRemover);
		
		this.setVisible(true);
		this.setResizable(false);
	}

}
