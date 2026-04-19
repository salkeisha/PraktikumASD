package CASEMETHOD1;

public class Buku26 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    
    Buku26(String kode, String jdl, int tahun) {
        kodeBuku = kode;
        judul = jdl;
        tahunTerbit = tahun;
    }

    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
