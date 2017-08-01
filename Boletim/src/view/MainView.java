package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.MainController;
import listener.RegisteReportListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainView extends JFrame {

	private JPanel contentPane;
	private MainController mc;
	private JTextField nameField;
	private JTextField subject1;
	private JTextField subject2;
	private JTextField subject3;
	
	private JTextField grade11;
	private JTextField grade21;
	private JTextField grade31;
	
	private JTextField grade12;
	private JTextField grade22;
	private JTextField grade32;
	
	private JTextField grade13;
	private JTextField grade23;
	private JTextField grade33;
	
	private JTextField grade14;
	private JTextField grade24;
	private JTextField grade34;
	

	public MainView(MainController mc)
	{
		this.mc = mc;
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoletim = new JLabel("Boletim");
		lblBoletim.setBounds(247, 12, 46, 14);
		contentPane.add(lblBoletim);
		
		nameField = new JTextField();
		nameField.setBounds(105, 37, 320, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(35, 40, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblDisciplinas = new JLabel("Disciplinas");
		lblDisciplinas.setBounds(35, 82, 68, 14);
		contentPane.add(lblDisciplinas);
		
		JLabel lblNota = new JLabel("Nota1");
		lblNota.setBounds(131, 82, 46, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(206, 82, 46, 14);
		contentPane.add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 3");
		lblNota_2.setBounds(305, 82, 46, 14);
		contentPane.add(lblNota_2);
		
		JLabel lblNota_3 = new JLabel("Nota 4");
		lblNota_3.setBounds(397, 82, 46, 14);
		contentPane.add(lblNota_3);
		
		subject1 = new JTextField();
		subject1.setBounds(17, 107, 86, 20);
		contentPane.add(subject1);
		subject1.setColumns(10);
		
		subject2 = new JTextField();
		subject2.setBounds(17, 141, 86, 20);
		contentPane.add(subject2);
		subject2.setColumns(10);
		
		subject3 = new JTextField();
		subject3.setBounds(17, 176, 86, 20);
		contentPane.add(subject3);
		subject3.setColumns(10);
		
		grade11 = new JTextField();
		grade11.setBounds(120, 107, 51, 20);
		contentPane.add(grade11);
		grade11.setColumns(10);
		
		grade21 = new JTextField();
		grade21.setBounds(119, 141, 51, 20);
		contentPane.add(grade21);
		grade21.setColumns(10);
		
		grade31 = new JTextField();
		grade31.setBounds(118, 176, 59, 20);
		contentPane.add(grade31);
		grade31.setColumns(10);
		
		JButton btnGerarBoletim = new JButton("Gerar Boletim");
		btnGerarBoletim.addActionListener(new RegisteReportListener(this, mc));
		btnGerarBoletim.setBounds(17, 254, 435, 92);
		contentPane.add(btnGerarBoletim);
		
		grade12 = new JTextField();
		grade12.setBounds(181, 107, 86, 20);
		contentPane.add(grade12);
		grade12.setColumns(10);
		
		grade22 = new JTextField();
		grade22.setBounds(180, 141, 86, 20);
		contentPane.add(grade22);
		grade22.setColumns(10);
		
		grade32 = new JTextField();
		grade32.setBounds(181, 176, 86, 20);
		contentPane.add(grade32);
		grade32.setColumns(10);
		
		grade13 = new JTextField();
		grade13.setBounds(277, 107, 86, 20);
		contentPane.add(grade13);
		grade13.setColumns(10);
		
		grade23 = new JTextField();
		grade23.setBounds(276, 141, 86, 20);
		contentPane.add(grade23);
		grade23.setColumns(10);
		
		grade33 = new JTextField();
		grade33.setBounds(277, 176, 86, 20);
		contentPane.add(grade33);
		grade33.setColumns(10);
		
		grade14 = new JTextField();
		grade14.setBounds(376, 107, 86, 20);
		contentPane.add(grade14);
		grade14.setColumns(10);
		
		grade24 = new JTextField();
		grade24.setBounds(372, 141, 86, 20);
		contentPane.add(grade24);
		grade24.setColumns(10);
		
		grade34 = new JTextField();
		grade34.setBounds(376, 176, 86, 20);
		contentPane.add(grade34);
		grade34.setColumns(10);
		setResizable(false);
		setVisible(true);
	}


	public MainController getMc() {
		return mc;
	}


	public void setMc(MainController mc) {
		this.mc = mc;
	}


	public JTextField getNameField() {
		return nameField;
	}


	public void setNameField(JTextField nameField) {
		this.nameField = nameField;
	}


	public JTextField getSubject1() {
		return subject1;
	}


	public void setSubject1(JTextField subject1) {
		this.subject1 = subject1;
	}


	public JTextField getSubject2() {
		return subject2;
	}


	public void setSubject2(JTextField subject2) {
		this.subject2 = subject2;
	}


	public JTextField getSubject3() {
		return subject3;
	}


	public void setSubject3(JTextField subject3) {
		this.subject3 = subject3;
	}


	public JTextField getGrade11() {
		return grade11;
	}


	public void setGrade11(JTextField grade11) {
		this.grade11 = grade11;
	}


	public JTextField getGrade21() {
		return grade21;
	}


	public void setGrade21(JTextField grade21) {
		this.grade21 = grade21;
	}


	public JTextField getGrade31() {
		return grade31;
	}


	public void setGrade31(JTextField grade31) {
		this.grade31 = grade31;
	}


	public JTextField getGrade12() {
		return grade12;
	}


	public void setGrade12(JTextField grade12) {
		this.grade12 = grade12;
	}


	public JTextField getGrade22() {
		return grade22;
	}


	public void setGrade22(JTextField grade22) {
		this.grade22 = grade22;
	}


	public JTextField getGrade32() {
		return grade32;
	}


	public void setGrade32(JTextField grade32) {
		this.grade32 = grade32;
	}


	public JTextField getGrade13() {
		return grade13;
	}


	public void setGrade13(JTextField grade13) {
		this.grade13 = grade13;
	}


	public JTextField getGrade23() {
		return grade23;
	}


	public void setGrade23(JTextField grade23) {
		this.grade23 = grade23;
	}


	public JTextField getGrade33() {
		return grade33;
	}


	public void setGrade33(JTextField grade33) {
		this.grade33 = grade33;
	}


	public JTextField getGrade14() {
		return grade14;
	}


	public void setGrade14(JTextField grade14) {
		this.grade14 = grade14;
	}


	public JTextField getGrade24() {
		return grade24;
	}


	public void setGrade24(JTextField grade24) {
		this.grade24 = grade24;
	}


	public JTextField getGrade34() {
		return grade34;
	}


	public void setGrade34(JTextField grade34) {
		this.grade34 = grade34;
	}
	
	public ArrayList<JTextField> getSubject1fields()
	{
		ArrayList<JTextField> fields = new ArrayList<JTextField>();
		fields.add(subject1);
		fields.add(grade11);
		fields.add(grade12);
		fields.add(grade13);
		return fields;
	}
	public ArrayList<JTextField> getSubject2fields()
	{
		ArrayList<JTextField> fields = new ArrayList<JTextField>();
		fields.add(subject2);
		fields.add(grade21);
		fields.add(grade22);
		fields.add(grade23);
		return fields;
	}	
	public ArrayList<JTextField> getSubject3fields()
	{
		ArrayList<JTextField> fields = new ArrayList<JTextField>();
		fields.add(subject3);
		fields.add(grade31);
		fields.add(grade32);
		fields.add(grade33);
		return fields;
	}	

}
