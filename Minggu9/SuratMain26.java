package Minggu9;

import java.util.Scanner;

public class SuratMain26 {
    public static void main(String[] args) {
        StackSurat26 stack = new StackSurat26(5);
        Scanner scan = new Scanner(System.in);
        
        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Melihat Surat Izin Terakhir");
            System.out.println("4. Mencari Surat Izin Berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S : Sakit | I : Izin): ");
                    char jenisIzin = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat26 surat = new Surat26(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat26 proses = stack.pop();
                        if (proses != null) {
                        System.out.println("Memproses surat " + proses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat26 lihat = stack.peek();
                        if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Belum ada surat yang masuk.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String nmMhs = scan.nextLine();
                    Surat26 hasilCari = stack.cariSurat(nmMhs);

                    if (hasilCari != null) {
                        System.out.println("=== Data Surat Mahasiswa ===");
                        System.out.println("ID Surat   : " + hasilCari.idSurat);
                        System.out.println("Nama       : " + hasilCari.namaMahasiswa);
                        System.out.println("Kelas      : " + hasilCari.kelas);
                        System.out.println("Jenis Izin : " + hasilCari.jenisIzin);
                        System.out.println("Durasi     : " + hasilCari.durasi + " jam");
                    } else {
                        System.out.println("Nama Mahasiswa tidak ada di dalam tumpukan surat!");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari sistem, terimakasih.");
                    break;
                default:
                    System.out.println("Pilih opsi yang ada di Menu!");
            }

        } while (pilih != 5);

        scan.close();
    }
    
}
