package Minggu5;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26();
        Mahasiswa26 m1 = new Mahasiswa26("123", "Zidan", "2A", 3.2);
        Mahasiswa26 m2 = new Mahasiswa26("124", "Ayu", "2A", 3.5);
        Mahasiswa26 m3 = new Mahasiswa26("125", "Sofi", "2A", 3.1);
        Mahasiswa26 m4 = new Mahasiswa26("126", "Sita", "2A", 3.9);
        Mahasiswa26 m5 = new Mahasiswa26("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}
