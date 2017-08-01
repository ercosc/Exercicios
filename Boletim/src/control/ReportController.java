package control;

import java.util.ArrayList;

import database.SimulatedDatabase;
import model.Report;
import model.SubjectGrade;

public class ReportController {
	
	private SimulatedDatabase sdb;
	
	public ReportController(SimulatedDatabase sdb) {
		
	}
	public void registerReport(String studentName, ArrayList<SubjectGrade> grades)
	{
		Report report = new Report(studentName, grades);
		this.sdb.save(report);
	}
}
