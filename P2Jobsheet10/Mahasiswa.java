package P2Jobsheet10;

public class Mahasiswa {
    String nim, nama, prodi, kelas;

    Mahasiswa (String nm, String nma, String prd, String kls) {
        nim = nm;
        nama = nma;
        prodi = prd;
        kelas = kls;
    }

    void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
