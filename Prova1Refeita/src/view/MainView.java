package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.ControlManager;

import javax.swing.JButton;

public class MainView extends JFrame {
	
	private ControlManager cm;
	private JPanel contentPane;

	public MainView(ControlManager cm) {
		
		this.cm = cm;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOngMenu = new JButton("ONG Menu");
		btnOngMenu.setBounds(173, 48, 113, 50);
		contentPane.add(btnOngMenu);
		
		JButton btnPostoMenu = new JButton("Posto Menu");
		btnPostoMenu.setBounds(173, 145, 113, 50);
		contentPane.add(btnPostoMenu);
		setVisible(true);
		setResizable(false);
		
	}
}
