package exercicios;

import java.sql.ResultSet;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import database.Database;
import view.AddEx15Window;
import view.AddRemoveWindow;
import view.AddRemoveWindow;
import view.DeleteEx10ConfirmWindow;
import view.DeleteEx10Window;
import view.Ex05Window;
import view.Ex05Window;
import view.Ex06Window;
import view.Ex07Window;
import view.Exercicio15bWindow;
import view.InsertEx08Window;
import view.InsertEx11Window;
import view.MainWindow;
import view.RemoveWindow;
import view.UpdateEx08Window;

public class Exercicios 
{
	private MainWindow mw;
	
	public Exercicios() 
	{
		this.mw = new MainWindow(this);
	}

	public void ex05() throws Exception 
	{
		//JOptionPane.showMessageDialog(null, "ok");
		String SQL = "SELECT * FROM TB_ERICK";
		
		Database db = new Database();
		
		ResultSet rs=db.consultar(SQL);
		this.createEx05Window(rs);
	}

	private void createEx05Window(ResultSet rs) throws Exception {
		new Ex05Window(this, rs);
		
	}
	
	public void ex06() throws Exception
	{
		Database db = new Database();
		String SQL = "SELECT sgl_erick, qtd_21505796, nme_rennan FROM TB_ERICK "
				+ "JOIN TA_21505796 ON idt_erick=cod_erick JOIN TB_RENNAN ON cod_rennan=idt_rennan";
		
		ResultSet rs=db.consultar(SQL);
		
		this.createEx06Window(rs);
	}

	private void createEx06Window(ResultSet rs) throws Exception 
	{
		new Ex06Window(this, rs);
	}

	public void ex07() throws Exception 
	{
		Database db = new Database();
		String SQL = "SELECT sgl_erick, nme_erick, COUNT(cod_erick) AS RA "
				   + "FROM TB_ERICK JOIN TA_21505796 ON idt_erick=cod_erick GROUP BY nme_erick ORDER BY RA DESC";
		
		ResultSet rs = db.consultar(SQL);
		
		this.createEx07Window(rs);
	}
	
	private void createEx07Window(ResultSet rs) throws Exception
	{
		new Ex07Window(this, rs);
	}

	public void ex08(String sglErick, String nmeErick, String valErick) throws Exception 
	{
		Database db = new Database();
		String SQL = "INSERT INTO TB_ERICK(sgl_erick, nme_erick, val_erick) VALUES (?,?,?)";
		
		db.atualizar(SQL, sglErick, nmeErick, valErick);
	}

	public void createInsertEx08Window() 
	{
		new InsertEx08Window(this);	
	}

	public void createUpdateEx08Window() 
	{
		new UpdateEx08Window(this);
	}

	public void ex09(String idtErick, String sglErick, String nmeErick, String valErick) throws Exception 
	{
		Database db = new Database();
		
		String a = "SELECT COUNT(idt_erick) AS id FROM TB_ERICK WHERE idt_erick=?";
		ResultSet rs = db.consultar(a, idtErick);
		rs.first();
		if(rs.getString("id").equals(1))
		{
			String SQL = "UPDATE TB_ERICK SET sgl_erick=?, nme_erick=?, val_erick=? WHERE idt_erick=?";
			db.atualizar(SQL, sglErick, nmeErick, valErick, idtErick);	
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "local inexistente");
		}
	}

	public void createDeleteEx10Window() 
	{
		new DeleteEx10Window(this);
		
	}

	public void ex10(String idt) throws Exception 
	{
		Database db = new Database();
		String a = "SELECT *, COUNT(idt_erick) AS id FROM TB_ERICK WHERE idt_erick=?";
		ResultSet rs = db.consultar(a, idt);
		rs.first();
		if(rs.getString("id").equals("1"))
		{
			this.createDeleteEx10ConfirmWindow(rs, idt, db);
		}else
			JOptionPane.showMessageDialog(null, "Local indisponivel");
	}

	private void createDeleteEx10ConfirmWindow(ResultSet rs, String idt, Database db) throws Exception 
	{
		new DeleteEx10ConfirmWindow(this, rs, idt, db);
	}

	public void deleteEx10(String idt, Database db) throws Exception 
	{
		String a = "DELETE FROM TA_21505796 WHERE cod_erick=?";
		db.atualizar(a, idt);
		String SQL = "DELETE FROM TB_ERICK WHERE idt_erick=?";
		db.atualizar(SQL, idt);
	}

	public void InsertEx11Window() 
	{
		new InsertEx11Window(this);
	}

	public void ex11(String registros) throws Exception 
	{
		String SQL = "INSERT INTO TB_RENNAN(nme_rennan, end_rennan, dta_rennan) VALUES (?,?,?)";
		Database db = new Database();
		
		
		for(int i = 0; i < Integer.parseInt(registros); i++)
		{
			db.atualizar(SQL, this.randomNameEx11(), this.randomNameEx11(), this.randomDateEx11());
		}
	}
	
	private String randomNameEx11()
	{
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		
		
		return sb.toString();
	}
	
	private String randomDateEx11()
	{
		StringBuilder date = new StringBuilder();
		
		date.append(this.yearDateEx11());
		date.append("-");
		date.append(this.monthAndDayEx11());
		
		
		return date.toString();
	}
	
	private String yearDateEx11()
	{
		StringBuilder year= new StringBuilder();
		
		char[] milenio = "12".toCharArray();
		char[] numbers = "1234567890".toCharArray();
		Random random = new Random();
		String a= year.append(random.nextInt(milenio.length)).toString();
		if(a.equals("2"))
		{
			year.append(a);
			year.append("0");
			year.append(random.nextInt(numbers.length));
			year.append(random.nextInt(numbers.length));
		} 
		else
		{
		 year.append(a);
		 year.append(random.nextInt(numbers.length));
		 year.append(random.nextInt(numbers.length));
		 year.append(random.nextInt(numbers.length));
		}
		return year.toString();
	}
	
	private String monthAndDayEx11()
	{
		StringBuilder all = new StringBuilder();
		
		int randomMonth = 1 + (int)(Math.random() * 12);
		int randomFeb = 1 + (int)(Math.random() * 28);
		int random30 = 1 + (int) (Math.random() * 30);
		int randomDays = 1 + (int) (Math.random() * 31);
		switch(randomMonth)
		{
		case 2:
			all.append(randomMonth);
			all.append("-");
			all.append(randomFeb);
			break;
			
		case 4:
			all.append(randomMonth);
			all.append("-");
			all.append(random30);
			break;
			
		case 6: 
			all.append(randomMonth);
			all.append("-");
			all.append(random30);
			break;
			
		case 9:
			all.append(randomMonth);
			all.append("-");
			all.append(random30);
			break;
			
		case 11: 
			all.append(randomMonth);
			all.append("-");
			all.append(random30);
			break;
		
		default:
			all.append(randomMonth);
			all.append("-");
			all.append(randomDays);
			break;
		}
		
		return all.toString();
	}


	public void createAddWindow() 
	{
		new AddEx15Window(this);
	}

	public void addTa(String tbErick, String tbRennan) throws Exception 
	{
		String SQL = "INSERT INTO TA_21505796(cod_erick, cod_rennan, qtd_21505796) VALUES (?,?,?)";
		Database db = new Database();
		
		db.atualizar(SQL, tbErick , tbRennan, this.randomInt());
		
		
	}

	public String tbErickEx15(String nmeErick) throws Exception 
	{
		String SQL = "SELECT * FROM TB_ERICK WHERE nme_erick=?";
		Database db = new Database();
		ResultSet rs = db.consultar(SQL, nmeErick);
		
		rs.first();
		
		String idt = rs.getString("idt_erick");
		
		return idt;
	}

	public String tbRennanEx15(String nmeRennan) throws Exception 
	{
		String SQL = "SELECT * FROM TB_RENNAN WHERE nme_rennan=?";
		Database db = new Database();
		ResultSet rs = db.consultar(SQL, nmeRennan);
		
		rs.first();
		
		String idt = rs.getString("idt_rennan");
		
		return idt;
		
	}
	private String randomInt()
	{
		char[] numbers = "1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random rn = new Random();
		
		sb.append(rn.nextInt(numbers.length));
		sb.append(rn.nextInt(numbers.length));
		
		return sb.toString();
	}

	public void createAddRemoveWindow() 
	{
		new AddRemoveWindow(this);
		
	}

	public void createRemoveWindow() {
		new RemoveWindow(this);
		
	}

	public void removeTaEx15(String idtErick, String idtRennan) throws Exception 
	{
		String SQL = "DELETE FROM TA_21505796 WHERE cod_erick=? AND cod_rennan=?";
		Database db = new Database();
		
		db.atualizar(SQL, idtErick, idtRennan);
	}

	public void createEx15bWindow() 
	{
		new Exercicio15bWindow(this);
		
	}

	public void populateTbErickCB(JComboBox tbErickCB) throws Exception 
	{
		String SQL = "SELECT nme_erick FROM TB_ERICK";
		Database db = new Database();
		
		ResultSet rs = db.consultar(SQL);
		
		
		while(rs.next())
		{
			tbErickCB.addItem(rs.getString("nme_erick"));
		}
	}

	public void populateTbRennanCB(JComboBox tbRennanCB) throws Exception 
	{
		String SQL = "SELECT nme_rennan FROM TB_RENNAN";
		Database db = new Database();
		
		ResultSet rs = db.consultar(SQL);
		
		while(rs.next())
		{
			tbRennanCB.addItem(rs.getString("nme_rennan"));
		}
	}

	public String getIdtTbErick(JComboBox tbErickCB) throws Exception 
	{
		String SQL = "SELECT * FROM TB_ERICK";
		Database db = new Database();
		ResultSet rs = db.consultar(SQL);
		
		String idt = "";
		
		while(rs.next())
		{
			if(tbErickCB.getSelectedItem().equals(rs.getString("nme_erick")))
			{
				idt = rs.getString("idt_erick");
			}
		}
		return idt;
	}

	public String getIdtTbRennan(JComboBox tbRennanCB) throws Exception 
	{
		String SQL = "SELECT * FROM TB_RENNAN";
		Database db = new Database();
		ResultSet rs = db.consultar(SQL);
		
		String idt = "";
		
		while(rs.next())
			if(tbRennanCB.getSelectedItem().equals(rs.getString("nme_rennan")))
			{
				idt = rs.getString("idt_rennan");
			}
		
		return idt;
	}
}
