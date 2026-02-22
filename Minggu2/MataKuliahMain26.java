package Minggu2;

public class MataKuliahMain26 {

    public static void main(String[] args) {
        //Menggunakan konstruktor default/kosong
        MataKuliah26 matkul1 = new MataKuliah26();
        matkul1.kodeMK = "BD";
        matkul1.nama = "Basis Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        //Menggunakan konstruktor berparameter
        MataKuliah26 matkul2 = new MataKuliah26("DA", "Desain Antarmuka", 2, 4);
        MataKuliah26 matkul3 = new MataKuliah26("AL", "Aljabar Linear", 2, 4);

        //Menampilkan daftar mata kuliah awal
        System.out.println("============= DAFTAR MATA KULIAH =============");
        matkul1.tampilInformasi();
        matkul2.tampilInformasi();
        matkul3.tampilInformasi();
        System.out.println();

        //Melakukan perubahan setiap matkul dengan mengakses methodnya
        System.out.println("================= PERUBAHAN DATA =================");
        System.out.println("Matkul 1 :");
        matkul1.ubahSKS(8);
        System.out.println("Matkul 2 :");
        matkul2.tambahJam(4);
        matkul2.kurangiJam(2);
        System.out.println("Matkul 3 : ");
        matkul3.kurangiJam(5);
        System.out.println();

        //Menampilkan data matkul setelah data diubah
        System.out.println("================= DAFTAR SETELAH PERUBAHAN DATA =================");
        matkul1.tampilInformasi();
        matkul2.tampilInformasi();
        matkul3.tampilInformasi();


    }
    
}

