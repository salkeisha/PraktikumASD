package Minggu2;

public class Dosen26 {
    //Deklarasi atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    //Deklarasi Method
    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Lengkap : " + nama);
        //Jika status true maka akan menampilkan status aktif dan sebaliknya
        if (statusAktif) {
            System.out.println("Status : Aktif");
        } else {
            System.out.println("Status : Tidak Aktif");
        }
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang/Fokus Riset : " + bidangKeahlian);
    }

    //Method untuk set status dosen menjadi aktif
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    //Method untuk menghitung masa kerja dosen
    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }

    //Method untuk mengubah bidang keahlian dosen
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    //Konstruksi default
    public Dosen26() {
    }

    //Konstruksi berparameter
    public Dosen26(String id, String nm, boolean status, int tahunGabung, String bidang) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahunGabung;
        bidangKeahlian = bidang;
    }
}
