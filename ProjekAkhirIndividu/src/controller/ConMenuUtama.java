package controller;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ModelMenuUtama;


public class ConMenuUtama {
    private ModelMenuUtama model = new ModelMenuUtama();

    
    public ConMenuUtama()
    {

    }
        
    public void setTabel(JTable tabel)
    {
        model.getDataTabel(tabel);
    }
    
    public void deleteTabel(String nama, JTable tabel)
    {
        model.deleteTabel(nama);
        model.getDataTabel(tabel);
    }
    public void createTabel(String nama,JTable tabel)
    {
        model.createTabel(nama);
        model.getDataTabel(tabel);
    }
}
