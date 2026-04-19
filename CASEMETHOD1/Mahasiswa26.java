package CASEMETHOD1;

public class Mahasiswa26 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa26(String nm, String nma, String prd) {
        nim = nm;
        nama = nma;
        prodi = prd;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
