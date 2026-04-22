package CASEMETHOD1;

import java.util.Scanner;

public class CaseMethodDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa26[] arrayMahasiswa26 = new Mahasiswa26[3];
        arrayMahasiswa26[0] = new Mahasiswa26("22001", "Andi", "Teknik Informatika");
        arrayMahasiswa26[1] = new Mahasiswa26("22002", "Budi", "Teknik Informatika");
        arrayMahasiswa26[2] = new Mahasiswa26("22003", "Citra", "Sistem Informasi Bisnis");

        Buku26[] arrayBuku26 = new Buku26[4];
        arrayBuku26[0] = new Buku26("B001", "Algoritma", 2020);
        arrayBuku26[1] = new Buku26("B002", "Basis Data", 2019);
        arrayBuku26[2] = new Buku26("B002", "Pemrograman", 2021);
        arrayBuku26[3] = new Buku26("B004", "Fisika", 2024);

        SistemPeminjaman26 sistem = new SistemPeminjaman26();

        sistem.tambahData(new Peminjaman26(arrayMahasiswa26[0], arrayBuku26[0], 7));
        sistem.tambahData(new Peminjaman26(arrayMahasiswa26[1], arrayBuku26[1], 3));
        sistem.tambahData(new Peminjaman26(arrayMahasiswa26[2], arrayBuku26[2], 10));
        sistem.tambahData(new Peminjaman26(arrayMahasiswa26[2], arrayBuku26[3], 6));
        sistem.tambahData(new Peminjaman26(arrayMahasiswa26[0], arrayBuku26[1], 4));

        int menu;
        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjamana");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("6. Cari berdasarkan Judul Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    for (int i = 0; i < arrayMahasiswa26.length; i++) {
                        arrayMahasiswa26[i].tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku: ");
                    for (int i = 0; i < arrayBuku26.length; i++) {
                        arrayBuku26[i].tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("Data Peminjaman: ");
                    sistem.tampilkanDataDenda();
                    break;
                case 4:
                    System.out.println("Setelah diurutkan (Denda Terbesar): ");
                    sistem.urutkanDenda();
                    sistem.tampilkanDataDenda();
                    break;
                case 5:
                    System.out.print("Masukkan Judul NIM: ");
                    String cari = sc.nextLine();
                    sistem.cariBerdasarNIM(cari);
                    break;
                 // MODIFIKASI B2
                case 6:
                    System.out.println("Masukkan judul Buku: ");
                    String cari2 = sc.nextLine();
                    sistem.cariBerdasarJudul(arrayBuku26, cari2);
                    break;
                case 0:
                    System.out.println("Terimakasih sudah menggunakan layanan kami!");
                    break;
                default:
                    System.out.println("Input yang anda masukkan tidak valid! Coba lagi!");
            } 

        } while (menu != 0);

        sc.close();
    }
}
