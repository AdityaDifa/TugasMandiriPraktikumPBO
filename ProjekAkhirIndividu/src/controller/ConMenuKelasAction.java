/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JTable;
import model.ModelMenuKelasAction;

/**
 *
 * @author USER 10
 */
public class ConMenuKelasAction {
    
    public void tambahData(String nama,String namaKelas,JTable tabel)
    {
        ModelMenuKelasAction model = new ModelMenuKelasAction();
        model.tambahData(nama,namaKelas);
        model.updateTabel(namaKelas, tabel);
    }
    
    public void hapusData(String noinduk, String nama, String kelas, JTable tabel)
    {
        ModelMenuKelasAction model = new ModelMenuKelasAction();
        model.hapusData(noinduk, nama,kelas);
        model.updateTabel(kelas, tabel);
    }
}
