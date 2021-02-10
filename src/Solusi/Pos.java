/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solusi;

/**
 *
 * @author ibjan
 */
public class Pos {
    private int Kd_Barang;
    private String Nama_Barang;
    private String Jenis_Barang;
    private String Jenis_Pengiriman;
    
    public int getKd_Barang() {
        return Kd_Barang;
        
    }

    public void setKd_Barang(int Kd_Barang) { this.Kd_Barang = Kd_Barang;}

    public String getNama_Barang() { return Nama_Barang; }

    public void setNama_Barang(String Nama_Barang) {
        this.Nama_Barang = Nama_Barang;
    }

    
    public String getJenis_Barang() {
        return Jenis_Barang;
    }
    public void setJenis_Barang(String Jenis_Barang) {
        this.Jenis_Barang = Jenis_Barang;
    }

}
