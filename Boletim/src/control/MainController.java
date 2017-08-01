package control;

import java.util.ArrayList;

import database.SimulatedDatabase;
import model.SubjectGrade;
import view.MainView;

public class MainController 
{
	private SimulatedDatabase sdb;
	private MainView mv;
	private ReportController rc;
	private SubjectGradeController sgc;
	
	
public MainController()
{
	this.sdb = new SimulatedDatabase();
	this.rc = new ReportController(this.sdb);
	this.sgc = new SubjectGradeController(this.sdb);
	this.mv = new MainView(this);
	
	
}

public void registerReport(String studentName, ArrayList<String> s1, ArrayList<String> s2, ArrayList<String> s3) 
{
	ArrayList<SubjectGrade> grades = new ArrayList<SubjectGrade>();
	
	grades.add(createSubjectGrade(s1));
	grades.add(createSubjectGrade(s2));
	grades.add(createSubjectGrade(s3));
	
	this.rc.registerReport(studentName,grades);
}
public SubjectGrade createSubjectGrade(ArrayList<String> stringList)
{
	return new SubjectGrade(stringList);
}

}
