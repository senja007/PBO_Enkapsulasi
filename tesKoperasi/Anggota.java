/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesKoperasi;

/**
 *
 * @author senja007
 */
public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    Anggota(String noKTP, String nama, int limitPinjaman) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.limitPeminjaman = 5000000;
        this.jumlahPinjaman = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setnoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama = nama;
    }

    public String getnoKTP() {
        return noKTP = noKTP;
    }

    public int getLimitPinjaman() {
        return limitPeminjaman;
    }

  public void angsur(float uang) {
        if (uang < (0.1 * jumlahPinjaman)) {
            System.out.println("Maaf, angsuran minimal harus 10% dari jumlah pinjaman.");
        } else {
        jumlahPinjaman -= uang;
        }
    }

    public void pinjam(float uang) {
        if (uang > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }

    }

    public int getJumlahPinjaman(double pinjam) {
        return jumlahPinjaman;
    }
}