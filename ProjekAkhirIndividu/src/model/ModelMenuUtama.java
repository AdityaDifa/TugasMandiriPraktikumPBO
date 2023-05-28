
package model;

import Connection.Conn;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ModelMenuUtama {
    private Connection connection;
    private Statement stm;
    private ResultSet result;
     private Conn koneksi = new Conn();
     
     private String[] hasil;
     private String nama;
     
    public ModelMenuUtama()
    {
         try{
             connection = DriverManager.getConnection(koneksi.DBurl, koneksi.DBusername, koneksi.DBpassword);
             System.out.println("berhasil terhubung");
         }
         catch(SQLException e)
         {
             System.out.println("gagal terhubung");
         }
    }
    public void getDataTabel(JTable tabel)
    {
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        try{
            stm = connection.createStatement();
             result = stm.executeQuery("SHOW TABLES");
             int nomor = 0;
              model.setRowCount(0);
             while(result.next()){
                 nomor++;
                nama = result.getString("Tables_in_tugasakhirpbo");
                model.addRow(new Object[]{nomor,nama});
//                 System.out.println(hasil[0]);
             }

             System.out.println("data berhasil diambil");

        }
        catch(SQLException e)
                {
                    System.out.println("eror model menu utama : "+e.getMessage());

                }
        catch(Exception e)
            {
                System.out.println("error model menu utama: "+e.getMessage());

            }
        }
    
    public void deleteTabel(String nama)
        {
            try{
                String query = "DROP TABLE "+nama;
                System.out.println(query);
                stm = connection.createStatement();
                
                stm.executeUpdate(query);
                System.out.println("tabel berhasil dihapus");
                

            }
            catch(SQLException e)
            {
                System.out.println("model menu utama error : "+e.getMessage());
            }
        }
    public void createTabel(String nama)
        {
            try{
                stm = connection.createStatement();
                String query = "CREATE TABLE "+nama+" (No_Induk INT PRIMARY KEY AUTO_INCREMENT, Nama VARCHAR(50) NOT NULL);";
                stm.executeUpdate(query);
                query = "ALTER TABLE "+nama+" CHANGE `No_Induk` `No_Induk` INT(4) NOT NULL AUTO_INCREMENT;";
                stm.executeUpdate(query);
                query = "ALTER TABLE "+nama+ " AUTO_INCREMENT = 1000";
                stm.executeUpdate(query);
                System.out.println("tabel berhasil ditambahkan");
            }
            catch(Exception e)
            {
                System.out.println("error model menu utama : "+e.getMessage());
            }
            
        }
    }
