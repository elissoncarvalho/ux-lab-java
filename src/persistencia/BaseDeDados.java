package persistencia;
import java.sql.*;

public class BaseDeDados 
{
    private static final String urlDB = "https://databases-auth.000webhost.com/db_structure.php?db=id2509221_uxlab";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql:" + urlDB;
    private String user = "id2509221_admin";
    private String password = "uxlabadmin";
    private Connection conn;
    
    
    public Connection conecta()
    {
        try
        {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DATABASE_URL, this.user, this.password);
        } 
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } 
        catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }

    public void desconecta()
    {
        try
        {
            conn.close();
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
