package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Database 
{
    private String servidor;
    private String schema;
    private String usuario;
    private String senha;
    private Connection cn;
    
    public Database() throws Exception
    {
        servidor="localhost";
        usuario="root";
        senha="";
        schema="LISTA1";
        this.conectar();
    }
    
    public Database(String server, String schema, String user, String senha) throws Exception
    {
        this.servidor = server;
        this.usuario = user;
        this.senha = senha;
        this.schema = schema;
        this.conectar();
    }
    private void conectar() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + servidor + "/" + schema;
        cn = DriverManager.getConnection(url, usuario, senha);
    }
    public ResultSet consultar(String SQL, String... parametros) throws Exception
    {
        ResultSet rs= null;
        PreparedStatement ps = cn.prepareStatement(SQL);
            if(parametros.length > 0)
            {
                for(int i = 0; i < parametros.length; i++)
                {
                     ps.setString(i + 1, parametros[i]);
                }
            }
            rs = ps.executeQuery();
        return rs;
    }
    
    public boolean atualizar(String SQL, String... parametros) throws Exception {
        boolean ret = true;
        PreparedStatement ps = cn.prepareStatement(SQL);
        if (parametros.length > 0) {
            for (int i = 0; i < parametros.length; i++) {
                ps.setString(i + 1, parametros[i]);
            }
        }
        ret = ps.executeUpdate() > -1;
        return ret;
    }
}
