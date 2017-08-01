package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import control.MainController;
import control.ReportController;
import view.MainView;

public class RegisteReportListener implements ActionListener 
{
	private MainView mv;
	private MainController mc;
	
	public RegisteReportListener(MainView mv, MainController mc)
	{
		this.mv = mv;
		this.mc = mc;
	}
	
	private ArrayList<String> fieldToString(ArrayList<JTextField> list)
	{
		ArrayList<String> fieldsStrings = new ArrayList<String>();
		
		for(int i = 0; i < list.size(); i++)
		{
			fieldsStrings.add(list.get(i).getText());
		}
		return fieldsStrings;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String studentName = this.mv.getNameField().getText();
		ArrayList<String> s1 = fieldToString(this.mv.getSubject1fields());
		ArrayList<String> s2 = fieldToString(this.mv.getSubject2fields());
		ArrayList<String> s3 = fieldToString(this.mv.getSubject3fields());
		mc.registerReport(studentName,s1, s2, s3);
	}
}