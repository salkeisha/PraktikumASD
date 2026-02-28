package Minggu3;

import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan jumlah data Dosen yang ingin diinput : ");
        int jumlahData = sc.nextInt();

        Dosen26[] arrayDosen26 = new Dosen26[jumlahData];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            kode = sc2.nextLine();
            System.out.print("Nama           : ");
            nama = sc2.nextLine();
            System.out.print("Jenis Kelamin  : ");
            dummy = sc2.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Wanita");
            System.out.print("Usia           : ");
            dummy = sc2.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayDosen26[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }

        int nomor = 1;

        for (Dosen26 dosen : arrayDosen26) {
            System.out.println("Data Dosen ke-" + (nomor));
            System.out.println("Kode              : " + dosen.kode);
            System.out.println("Nama              : " + dosen.nama);
            if (dosen.jenisKelamin == true) {
                System.out.println("Jenis Kelamin     : Wanita");
            } else {
                System.out.println("Jenis Kelamin     : Pria");
            }
            System.out.println("Usia              : " + dosen.usia);
            System.out.println("------------------------------------");

            nomor++;
        }
        
        DataDosen26 dataDosen = new DataDosen26();
        dataDosen.dataSemuaDosen(arrayDosen26);
        dataDosen.jumlahDosenPerJenisKelamin(arrayDosen26);
        dataDosen.rerataUsiaDosenPerjenisKelamin(arrayDosen26);

        sc.close();
        sc2.close();

    }
    
}
