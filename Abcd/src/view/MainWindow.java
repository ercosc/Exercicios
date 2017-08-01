package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.ControlManager;
import view.listener.RegisterPublisherBtnListener;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private ControlManager cm;

	public MainWindow(ControlManager cm) 
	{
		this.cm = cm;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegisterPublisher = new JButton("Register Publisher");
		btnRegisterPublisher.addActionListener(new RegisterPublisherBtnListener(this, cm));
		btnRegisterPublisher.setBounds(68, 43, 137, 38);
		contentPane.add(btnRegisterPublisher);
		
		
		setVisible(true);
		setResizable(false);
	}
}
