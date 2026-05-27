package Minggu11;

public class Mahasiswa26 {
    String nim, nama, kelas;
    double ipk;
    String formatMenu = "%-15s %-20s %-10s %-5s\n";

    Mahasiswa26() {

    }

    Mahasiswa26(String nm, String nma, String kls, double ip) {
        nim = nm;
        nama = nma;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.printf(formatMenu, nama, nim, kelas, ipk);
    }
}
