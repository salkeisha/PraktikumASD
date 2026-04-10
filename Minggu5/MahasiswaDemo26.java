package Minggu5;

import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);
        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26();

        String nama, kelas, nim;
        double ipk;

        // Setekah dimodifikasi
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM    : ");
            nim = sc2.nextLine();
            System.out.print("Nama   : ");
            nama = sc2.nextLine();
            System.out.print("Kelas  : ");
            kelas = sc2.nextLine();
            System.out.print("IPK    : ");
            ipk = sc2.nextDouble();
            sc2.nextLine();

            Mahasiswa26 m = new Mahasiswa26(nim, nama, kelas, ipk);

            list.tambah(m);
    
        }

        // Sebelum dimodifikasi 
        // Mahasiswa26 m1 = new Mahasiswa26("123", "Zidan", "2A", 3.2);
        // Mahasiswa26 m2 = new Mahasiswa26("124", "Ayu", "2A", 3.5);
        // Mahasiswa26 m3 = new Mahasiswa26("125", "Sofi", "2A", 3.1);
        // Mahasiswa26 m4 = new Mahasiswa26("126", "Sita", "2A", 3.9);
        // Mahasiswa26 m5 = new Mahasiswa26("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan Selection Sort (ASC) : ");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan Insertion Sort (ASC) : ");
        list.insertionSort();
        list.tampil();

        sc2.close();
    }
}
