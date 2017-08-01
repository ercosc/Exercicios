package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.Database;
import exercicios.Exercicios;
import view.listener.BtnExcluirListener;

public class DeleteEx10ConfirmWindow extends JFrame {

	private JPanel contentPane;
	private Exercicios ex;
	private ResultSet rs;
	private String idt;
	private Database db;
	
	public DeleteEx10ConfirmWindow(Exercicios ex, ResultSet rs, String idt, Database db) throws SQLException 
	{
		
		this.ex = ex;
		this.rs = rs;
		this.idt = idt;
		this.db = db;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 174, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSigla = new JLabel("Sigla:");
		lblSigla.setBounds(10, 30, 46, 14);
		contentPane.add(lblSigla);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 55, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblDesejaRealmenteExcluir = new JLabel("Deseja realmente excluir?");
		lblDesejaRealmenteExcluir.setBounds(10, 129, 154, 14);
		contentPane.add(lblDesejaRealmenteExcluir);
		
		
		JLabel lblNewLabel = new JLabel(rs.getString("sgl_erick"));
		lblNewLabel.setBounds(56, 30, 71, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(rs.getString("nme_erick"));
		lblNewLabel_1.setBounds(56, 55, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new BtnExcluirListener(this.ex, idt, db));
		btnExcluir.setBounds(38, 162, 89, 23);
		contentPane.add(btnExcluir);

		this.setVisible(true);
		this.setResizable(false);
	}

}
