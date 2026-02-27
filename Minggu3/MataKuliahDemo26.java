package Minggu3;

import java.util.Scanner;
public class MataKuliahDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modifikasi agar panjang array menjadi input dinamis
        System.out.print("Masukkan jumlah Matakuliah yang ingin diinput : ");
        int jumlahMatkul = sc.nextInt();

        MataKuliah26[] arrayOfMataKuliah26 = new MataKuliah26[jumlahMatkul];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan data Matakuliah ke-" + (i+1));
            // Modifikasi percobaan 3, penambahan method kedalam file Main
            arrayOfMataKuliah26[i] = new MataKuliah26();
            arrayOfMataKuliah26[i].tambahData();
            // System.out.print("Kode            : ");
            // kode = sc.nextLine();
            // System.out.print("Nama            : ");
            // nama = sc.nextLine();
            // System.out.print("Sks             : ");
            // dummy = sc.nextLine();
            // sks = Integer.parseInt(dummy);
            // System.out.print("Jumlah Jam      : ");
            // dummy = sc.nextLine();
            // jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            // arrayOfMataKuliah26[i] = new MataKuliah26(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah26[i].cetakInfo();
            System.out.println("------------------------------------");
        }
        sc.close();
    }
}
