package Minggu10;

import java.util.Scanner;

public class MainKRS {
    public static void menu() {
        System.out.println("\n=== MENU ANTRIAN KRS (DPA) ===");
        System.out.println("1. Tambah Antrian Mahasiswa");
        System.out.println("2. Panggil Antrian (Proses 2 Mahasiswa)");
        System.out.println("3. Lihat Semua Antrian");
        System.out.println("4. Lihat 2 Antrian Terdepan");
        System.out.println("5. Lihat Antrian Paling Akhir");
        System.out.println("6. Cek Status/Informasi Kuota KRS");
        System.out.println("7. Kosongkan semua antrian");
        System.out.println("0. Keluar");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            menu();
            System.out.print("Masukkan Menu yang ingin dipilih : ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n--- TAMBAH DATA MAHASISWA ---");
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatPalingAkhir();
                    break;
                case 6:
                    antrian.cetakInformasiKRS();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}
