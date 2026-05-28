package Minggu12;

public class Mahasiswa26 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa26(String nm, String nma, String kls, double ip) {
        nim = nm;
        nama = nma;
        kelas = kls;
        ipk = ip;
    }

    void tampil() {
        System.out.println(
            "NIM     : " + nim +
            "\nNama    : " + nama +
            "\nKelas   : " + kelas + 
            "\nIPK     : " + ipk 
        );
    }
}
