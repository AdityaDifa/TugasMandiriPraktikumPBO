package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    public String DBurl = "jdbc:mysql://localhost/tugasakhirpbo";
    public String DBusername = "root";
    public String DBpassword ="";
    
    public Conn()
    {
            try{
        Connection koneksi = DriverManager.getConnection(DBurl, DBusername, DBpassword);
        koneksi.close();
        }
        catch(SQLException e)
        {
            System.out.println("gagal menyambung");
        }
    }
}
