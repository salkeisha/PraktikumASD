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

    // Modifikasi A2
    String kategoriDenda;
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat*2000;
            if (denda > 10000) {
                kategoriDenda = "Berat";
            } else if (denda > 5000 && denda <= 10000) {
                kategoriDenda = "Sedang";
            } else if (denda <= 5000) {
                kategoriDenda = "Ringan";
            }
        } else {
            terlambat = 0;
            denda = 0;
            kategoriDenda = "Tidak ada Denda";
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + mhs.prodi + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda + " | Kategori Denda: " + kategoriDenda);
    }

}
