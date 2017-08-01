package view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ControlManager;
import view.MainWindow;

public class RegisterPublisherBtnListener implements ActionListener 
{
	private MainWindow mw;
	private ControlManager cm;
	
	public RegisterPublisherBtnListener(MainWindow mw, ControlManager cm) 
	{
		this.mw = mw;
		this.cm = cm;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		this.cm.showRegisterPublisher();

	}

}
