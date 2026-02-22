package Minggu2;

public class MataKuliah26 {
    //Deklarasi atribut
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    //Deklarasii method
    //Method menampilkan informasi matkul
    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah SKS : " + sks + " sks");
        System.out.println("Jumlah Jam : " + jumlahJam + " jam");
    }

    //Method mengubah SKS Matkul
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah. Jumlah SKS saat ini : " + sksBaru);
    }

    //Method menambahkan jam matkul
    void tambahJam(int jamTambahan) {
        jumlahJam += jamTambahan;
        System.out.println("Jumlah jam telah bertambah. Jumlah jam saat ini : " + jumlahJam);

    }

    //Method mengurangi jam matkul dengan mengecek apakah jam yang diinput kurang dari jumlah jam yang sudah ada
    void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah jam berhasil dikurangi. Jumlah jam saat ini : " + jumlahJam);
        } else {
            System.out.println("Jumlah jam yang ingin dikurangi melebihi jumlah jam yang sudah ada.");
        }

    }

    //Konstruktor default
    public MataKuliah26() {
    }

    //Konstruktor berparameter
    public MataKuliah26(String kodeMK, String namaMK, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        nama = namaMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
    
}
