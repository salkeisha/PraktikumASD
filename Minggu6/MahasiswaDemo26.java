package Minggu6;

import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26();

        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------------------");
            list.tambah(new Mahasiswa26(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-------------------------------------------------");
        System.out.println("Masukkan ipk Mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        // Sequential Search
        // System.out.println("Menggunakan Sequential Searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        // Binary Search
        System.out.println("-------------------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("-------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // String nama, kelas, nim;
        // double ipk;

        // Setekah dimodifikasi
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
        //     System.out.print("NIM    : ");
        //     nim = sc2.nextLine();
        //     System.out.print("Nama   : ");
        //     nama = sc2.nextLine();
        //     System.out.print("Kelas  : ");
        //     kelas = sc2.nextLine();
        //     System.out.print("IPK    : ");
        //     ipk = sc2.nextDouble();
        //     sc2.nextLine();

        //     Mahasiswa26 m = new Mahasiswa26(nim, nama, kelas, ipk);

        //     list.tambah(m);
    
        // }

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

        // // System.out.println("Data mahasiswa sebelum sorting: ");
        // // list.tampil();

        // // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // // list.bubbleSort();
        // // list.tampil();

        // // System.out.println("Data yang sudah terurut menggunakan Selection Sort (ASC) : ");
        // // list.selectionSort();
        // // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan Insertion Sort (ASC) : ");
        // list.insertionSort();
        // list.tampil();

        sc.close();
    }    
}
