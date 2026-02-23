package Minggu2;

public class DosenMain26 {
    public static void main(String[] args) {
        //Konstruktor default
        Dosen26 dosen1 = new Dosen26();
        dosen1.idDosen = "IFR";
        dosen1.nama = "Imam Fahrur Rozi, ST., M.Mkom.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2016;
        dosen1.bidangKeahlian = "Information System";

        //Konstruktor Berparameter
        Dosen26 dosen2 = new Dosen26("VAH", "Vipkas Al Hadid Firdaus, ST., MT.", true, 2009, "AI & Data Science");
        Dosen26 dosen3 = new Dosen26("HJT", "Budi Harjanto, ST., M.Mkom.", false, 2007, "Networks $ IoT");

        //Menampilkan data dosem
        System.out.println("=============== DAFTAR DOSEN ===============");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja : " + dosen1.hitungMasaKerja(2026) + " tahun");
        System.out.println();
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja : " + dosen2.hitungMasaKerja(2026) + " tahun");
        System.out.println();
        dosen3.tampilInformasi();
        System.out.println("Masa Kerja : " + dosen3.hitungMasaKerja(2026) + " tahun");
        System.out.println();

        //Perubahan data dengan mengakses method
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Data Analyst");
        dosen2.setStatusAktif(false);
        dosen3.setStatusAktif(true);

        //Menampilkan data dosen setelah perubahan
        System.out.println("================ DAFTAR SETELAH PERUBAHAN DATA DOSEN ================");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja : " + dosen1.hitungMasaKerja(2026) + " tahun");
        System.out.println();
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja : " + dosen2.hitungMasaKerja(2026) + " tahun");
        System.out.println();
        dosen3.tampilInformasi();
        System.out.println("Masa Kerja : " + dosen3.hitungMasaKerja(2026) + " tahun");
        System.out.println();

    }
}
