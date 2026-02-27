package Minggu3;

import java.util.Scanner;
public class MataKuliah26 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    //Mebnambahkan konstruktor default
    public MataKuliah26() {
    }

    public MataKuliah26(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    //penambahan method tambah data
    void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode            : ");
        kode = sc.nextLine();
        System.out.print("Nama            : ");
        nama = sc.nextLine();
        System.out.print("Sks             : ");
        String dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam      : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
    }

    //penambahan method cetak info
    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Sks         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }

    // Untuk menjawab pertanyaan pada jobsheet
    // public MataKuliah26(String kode, String nama) {
    //     this.kode = kode;
    //     this.nama = nama;
    // }

    // public MataKuliah26(int sks, int jumlahJam) {
    //     this.sks = sks;
    //     this.jumlahJam = jumlahJam;
    // }
}
