package TugasMinggu11;

public class Mahasiswa26 {
    String nim, nama, kelas, keperluan;
    String formatMenu = "%-15s %-20s %-10s %-20s\n";

    Mahasiswa26() {
    }

    Mahasiswa26(String nm, String nma, String kls, String kprluan) {
        nim = nm;
        nama = nma;
        kelas = kls;
        keperluan = kprluan;
    }

    void tampilkanInformasi() {
        System.out.printf(formatMenu, nim, nama, kelas, keperluan);
    }

    
}
