package model;

import java.util.ArrayList;

public class SubjectGrade 
{
	private String subjectName;
	private ArrayList<Double> grades;
	private double score;
	
	public SubjectGrade(ArrayList<String> list)
	{
		this.subjectName = list.get(0);
		this.grades = generateGrades(list);
		this.score = generateScore();
	}
	
	public SubjectGrade(String subjectName, ArrayList<Double> grades)
	{
		this.setSubjectName(subjectName);
		this.setGrades(grades);
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public ArrayList<Double> getGrades() {
		return grades;
	}
	public void setGrades(ArrayList<Double> grades) {
		this.grades = grades;
	}

	
	private ArrayList<Double> generateGrades(ArrayList<String> list)
	{
		ArrayList<Double> grades = new ArrayList<Double>();
		
		for(int i = 1; i < list.size(); i++)
		{
			grades.add(Double.parseDouble(list.get(i)));
		}
		
		return grades;
		
	}
	private double generateScore()
	{
		double score = 0;
		
		for(int i = 0; i < grades.size(); i++)
		{
			score += grades.get(i);
		}
		return score/grades.size();
				
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	

	}

