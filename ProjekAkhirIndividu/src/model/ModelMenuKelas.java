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
public class ModelMenuKelas {
    private Connection connection;
    private Statement stm;
    private ResultSet result;
    private Conn koneksi = new Conn();
    
    private String namakelas;
    private JTable tabel;
    
    public ModelMenuKelas(String namakelas, JTable tabel){
    try{
             connection = DriverManager.getConnection(koneksi.DBurl, koneksi.DBusername, koneksi.DBpassword);
             System.out.println("berhasil terhubung");
             
            this.namakelas = namakelas;
            this.tabel = tabel;
    
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
             System.out.println("gagal terhubung");
         }
    }
}
