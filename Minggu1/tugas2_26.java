package Minggu1;

import java.util.Scanner;
public class tugas2_26 {
    
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);

    static void inputDataMhs(String[][] jadwalMhs) {
        for (int i = 0; i < jadwalMhs.length; i++) {
            System.out.println("======= JADWAL KE-" + (i+1) + " =======");
            System.out.print("Masukkan Nama Mata Kuliah : ");
            jadwalMhs[i][0] = sc2.nextLine();
            System.out.print("Masukkan Nama Ruangan : ");
            jadwalMhs[i][1] = sc2.nextLine();
            System.out.print("Masukkan Hari : ");
            jadwalMhs[i][2] = sc2.nextLine();
            System.out.print("Masukkan Jam : ");
            jadwalMhs[i][3] = sc2.nextLine();

        }   
    }

    static void tampilkanTabel(String[][] jadwalMhs) {
        System.out.println("============================ TABEL JADWAL ===============================");
        String formatMenu = "%-10s %-30s %-10s %-10s %-20s%n";
        System.out.printf(formatMenu, "Jadwal", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwalMhs.length; i++) {
            System.out.printf(formatMenu, (i+1), jadwalMhs[i][0], jadwalMhs[i][1], jadwalMhs[i][2], jadwalMhs[i][3]);
        }
        sc.nextLine();
    }

    static void tampilkanDataHari(String[][] jadwalMhs) {
        System.out.print("Masukkan Hari yang ingin dicari : ");
        String namaHari = sc2.nextLine();

        boolean ditemukan = false;
        String formatMenu = "%-10s %-30s %-10s %-20s%n";
        int nomorUrut = 1;

        for (int i = 0; i < jadwalMhs.length; i++) {
            if (jadwalMhs[i][2].equalsIgnoreCase(namaHari)) {
                System.out.printf(formatMenu, nomorUrut, jadwalMhs[i][0], jadwalMhs[i][1], jadwalMhs[i][3]);
                ditemukan = true;
                nomorUrut++;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal di hari " + namaHari);
        }
        sc.nextLine();
    }

    static void taampilkanDataMatkul(String[][] jadwalMhs) {
        System.out.print("Masukkan Mata Kuliah yang ingin dicari : ");
        String namaMK = sc2.nextLine();

        boolean ditemukan = false;
        String formatMenu = "%-10s %-30s %-10s %-20s%n";
        int nomorUrut = 1;

        for (int i = 0; i < jadwalMhs.length; i++) {
            if (jadwalMhs[i][0].equalsIgnoreCase(namaMK)) {
                System.out.printf(formatMenu, nomorUrut, jadwalMhs[i][1], jadwalMhs[i][2], jadwalMhs[i][3]);
                ditemukan = true;
                nomorUrut++;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada Mata Kuliah " + namaMK);
        }
        sc.nextLine();

    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah Jadwal Kuliah anda : ");
        int jmlJadwal = sc.nextInt();

        String[][] jadwalMhs = new String[jmlJadwal][4];

        inputDataMhs(jadwalMhs);

        while (true) {
            System.out.println("========= MENU JADWAL KULIAH MAHASISWA =========");
            System.out.println("Pilih Menu yang ingin ditampilkan :");
            System.out.println("1. Menampilkan Jadwal Kuliah");
            System.out.println("2. Cari Jadwal Kuliah Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Kuliah Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 1) {
                tampilkanTabel(jadwalMhs);
            } else if (pilihanMenu == 2) {
                tampilkanDataHari(jadwalMhs);
            } else if (pilihanMenu == 3) {
                taampilkanDataMatkul(jadwalMhs);
            } else if (pilihanMenu == 4) {
                System.out.println("Terimakasih sudah menggunakan layanan kami!");
                break;   
            } else {
                System.out.println("Pilih nomor yang sesuai!");
                continue;
            }
            
        }
    }

}
