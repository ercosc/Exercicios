package model;

import java.util.ArrayList;

public class Report 
{
	private String studentName;
	private ArrayList<SubjectGrade> grades;
	
	public Report(String StudentName, ArrayList<SubjectGrade> grades)
	{
		this.setStudentName(StudentName);
		this.setGrades(grades);
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public ArrayList<SubjectGrade> getGrades() {
		return grades;
	}
	public void setGrades(ArrayList<SubjectGrade> grades) {
		this.grades = grades;
	}
	
	
	public String toString()
	{
		return "nome: " + this.studentName + "\n"
				+
	}
	public String gradesToString()
	{
		String Grades = "";
	
		for (int i = 0; i< this.grades.size(); i++)
		{
			grades += this.grades.get(i).getSubjectName() 
					+ this.grades.get(i).getGrades()
					+ this.grades.get(i).getScore();
		}
	return grades;
}
