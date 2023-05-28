/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ModelMenuKelas;
import view.MenuKelas;

/**
 *
 * @author USER 10
 */
public class ConMenuKelas {
    public ConMenuKelas(String kelas)
    {
        MenuKelas menukelas = new MenuKelas();
        ModelMenuKelas modelkelas = new ModelMenuKelas(kelas,menukelas.tabel);
        menukelas.kelas.setText(kelas);
        menukelas.setVisible(true);
        
    }
}
