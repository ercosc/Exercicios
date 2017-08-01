package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exercicios.Exercicios;
import view.listener.BtnAdicionar15b;
import view.listener.BtnRemover15bListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Exercicio15bWindow extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private JComboBox tbErickCB;
	private JComboBox tbRennanCB;

	public Exercicio15bWindow(Exercicios ex) 
	{
		this.ex = ex;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 153);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeTberick = new JLabel("nome TbErick:");
		lblNomeTberick.setBounds(10, 29, 96, 14);
		contentPane.add(lblNomeTberick);
		
		JComboBox tbErickCB = new JComboBox();
		this.populateTbErickCB(tbErickCB);
		tbErickCB.setBounds(10, 54, 91, 20);
		contentPane.add(tbErickCB);
		
		JLabel lblNomeTbrennan = new JLabel("nome TbRennan:");
		lblNomeTbrennan.setBounds(116, 29, 114, 14);
		contentPane.add(lblNomeTbrennan);
		
		JComboBox tbRennanCB = new JComboBox();
		this.populateTbRennan(tbRennanCB);
		tbRennanCB.setBounds(111, 54, 91, 20);
		contentPane.add(tbRennanCB);
		
		JButton btnAdicionar15b = new JButton("Adicionar");
		btnAdicionar15b.addActionListener(new BtnAdicionar15b(this.ex, tbErickCB, tbRennanCB));
		btnAdicionar15b.setBounds(233, 25, 89, 23);
		contentPane.add(btnAdicionar15b);
		
		JButton btnRemover15b = new JButton("Remover");
		btnRemover15b.addActionListener(new BtnRemover15bListener(this.ex, tbErickCB, tbRennanCB));
		btnRemover15b.setBounds(233, 59, 89, 23);
		contentPane.add(btnRemover15b);
		
		this.setVisible(true);
		this.setResizable(false);
	}
	
	private void populateTbErickCB(JComboBox tbErickCB)
	{
		try {
			this.ex.populateTbErickCB(tbErickCB);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private void populateTbRennan(JComboBox tbRennanCB)
	{
		try {
			this.ex.populateTbRennanCB(tbRennanCB);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
