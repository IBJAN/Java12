/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc.Pos;

import java.util.Scanner;

/**
 *
 * @author CATUR WARGA COMPUTER
 */
public class PosViewbarang {

    public void Createdata(String kd_b, String NamaBarang, String JenisBarang) {

        Scanner input = new Scanner(System.in);

        System.out.println("-------- DATA BARANG --------\n");
        System.out.println("Masukkan Kode Barang :");
        kd_b = input.nextLine();

        System.out.println("Masukkan Nama Barang :");
        NamaBarang = input.nextLine();

        System.out.println("Masukkan Jenis Barang :");
        JenisBarang = input.nextLine();

            
        System.out.println("-------- Output BARANG --------\n");
        System.out.println("Kode Barang : "+ kd_b);
        System.out.println("Nama Barang : "+ NamaBarang);
        System.out.println("Jenis Barang : "+ JenisBarang);
    }
}
