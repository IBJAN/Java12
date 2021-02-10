/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solusi;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author CATUR WARGA COMPUTER
 */
public class Poscontrol implements posinterface {
    
    private String[] header = {"KODE BARANG","NAMA BARANG","JENIS BARANG"};
    
    private ArrayList<Pos> list = new ArrayList();
    
    public void read(JTable table){
        
        DefaultTableModel data = new DefaultTableModel (null, header);
        
        for (int i = 0; i < list.size(); i++) {
            Object[] ob = new Object[3];
            ob[0]=list.get(i).getKd_Barang();
            ob[1]=list.get(i).getNama_Barang();
            ob[2]=list.get(i).getJenis_Barang();

            data.addRow(ob);
        }
        table.setModel(data);
        
    }
    
    public void create(Pos p){
        list.add(p);
        JOptionPane.showMessageDialog(null, "BERHASIL DISIMPAN !!!");
        
    }
    
}
