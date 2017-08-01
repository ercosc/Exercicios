package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JTextArea;

import aula0311.Listar;

public class ListarListener implements ActionListener {
	
	public Listar listar;
	public JTextArea taSaida;
	
	public ListarListener(Listar listar, JTextArea taSaida) 
	{
		this.listar=listar;
		this.taSaida=taSaida;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(
					"jdbc.mysql://localhost/ltp2","root","");
			String SQL = "SELECT * FROM TB_PRODUTO";
			
			PreparedStatement ps = cn.prepareStatement(SQL);
			
			ResultSet rs = ps.executeQuery();
			
			String aux = "";
			
			while(rs.next())
			{
				aux += rs.getString("NME_PRODUTO") + "(R$ " +
					   rs.getString("VLR_PRODUTO") + ") * " + 
					   rs.getString("QTD_ESTOQUE_PRODUTO") + " = " +
					   "R$ " + (rs.getDouble("VLR_PRODUTO")* rs.getInt("QTD_ESTOQUE_PRODUTO")) + "\n";
			}
			taSaida.setText(aux);
			rs.close(); ps.close(); cn.close();
			
			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
