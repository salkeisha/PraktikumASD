package Minggu2;

public class MahasiswaMain26 {
    public static void main(String[] args) {
        Mahasiswa26 mhs1 = new Mahasiswa26();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa26 mhs2 = new Mahasiswa26("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa26 mhsNanamiKento = new Mahasiswa26("Nanami Kento", "2441070202116", 3.55, "TI 2C");
        mhsNanamiKento.tampilkanInformasi();
    }
}
