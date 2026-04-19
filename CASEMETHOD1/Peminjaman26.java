package CASEMETHOD1;

public class Peminjaman26 {
    Mahasiswa26 mhs;
    Buku26 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman26(Mahasiswa26 mhs, Buku26 bk, int lamaPnjm) {
        this.mhs = mhs;
        buku = bk;
        lamaPinjam = lamaPnjm;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat*2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + mhs.prodi + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }

}
