/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Connection.Conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER 10
 */
public class ModelMenuKelasAction {
    private Connection connection;
    private Statement stm;
    private ResultSet result;
    private Conn koneksi = new Conn();
     
    public ModelMenuKelasAction()
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
    public void tambahData(String nama,String namaKelas)
    {
        
        try{
            String query = "INSERT INTO "+namaKelas+" VALUES('0','"+nama+"')";
            stm = connection.createStatement();
            stm.executeUpdate(query);
            System.out.println("data berhasil ditambahkan");
        }
        catch(Exception e)
        {
            System.out.println("data gagal ditambahkan");  
            System.out.println(e.getMessage());
        }
    }
    public void updateTabel(String namakelas, JTable tabel)
    {
        try{
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
             
             stm = connection.createStatement();
             result = stm.executeQuery("SELECT * FROM "+ namakelas);
             int nomor = 0;
             String nama;
             int nomorInduk;
              model.setRowCount(0);
             while(result.next()){
                 nomor++;
                 nomorInduk = result.getInt("No_Induk");
                nama = result.getString("Nama");
                model.addRow(new Object[]{nomor,nomorInduk,nama});
//                 System.out.println(hasil[0]);
             }
        }
        catch(SQLException e)
        {
            System.out.println("error");
        }
    }
    
    public void hapusData(String noinduk, String nama, String kelas)
    {
        try{
            stm = connection.createStatement();
            stm.executeUpdate("DELETE FROM "+kelas+" WHERE No_Induk = '"+noinduk+"' AND Nama = '"+nama+"';");
            stm.executeUpdate("ALTER TABLE "+kelas+" AUTO_INCREMENT = "+1000);
            System.out.println("data berhasil dihapus");
        }
        catch(Exception e)
        {
            System.out.println("error : "+e.getMessage());
        }
        
    }
}
