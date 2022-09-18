/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesKoperasi;

import java.util.Scanner;

/**
 *
 * @author senja007
 */
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pinjam, angsur;
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());
       
        System.out.print("Masukkan Jumlah Pinjaman : ");
        pinjam = sc.nextFloat();
        donny.pinjam(pinjam);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman(pinjam));
        System.out.print("Masukkan Jumlah Pinjaman : ");
        pinjam = sc.nextFloat();
        donny.pinjam(pinjam);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman(pinjam));
        System.out.print("Masukkan Jumlah Angsuran : ");
        angsur = sc.nextFloat();
        donny.angsur(angsur);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman(pinjam));
        System.out.print("Masukkan Jumlah Angsuran : ");
        angsur = sc.nextFloat();
        donny.angsur(angsur);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman(pinjam));

    }
  
}
