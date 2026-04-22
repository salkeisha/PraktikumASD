package CASEMETHOD1;

public class SistemPeminjaman26 {
    Peminjaman26[] listPeminjaman26 = new Peminjaman26[5];
    int index;

    // SistemPeminjaman26(int kapasitas) {
    //     listPeminjaman26 = new Peminjaman26[kapasitas];
    //     index = 0;
    // }

    void tambahData(Peminjaman26 p) {
        if (index < listPeminjaman26.length) {
            listPeminjaman26[index] = p;
            index++;
        }
    }

    void urutkanDenda() {
        for (int i = 0; i < index - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < index; j++) {
                if (listPeminjaman26[j].denda > listPeminjaman26[maxIdx].denda) {
                    maxIdx = j;
                }
            }

            Peminjaman26 temp = listPeminjaman26[maxIdx];
            listPeminjaman26[maxIdx] = listPeminjaman26[i];
            listPeminjaman26[i] = temp;
        }
    }

    void tampilkanDataDenda() {
        for (int i = 0; i < index; i++) {
            listPeminjaman26[i].tampilPeminjaman();
        }
    }

    // Modifikasi C2
    void lamaPinjamMhs(String NIM) {
        boolean ditemukan = false;
        int totalPeminjamanMhs = 0;

        for (int i = 0; i < listPeminjaman26.length; i++) {
            if (listPeminjaman26[i].mhs.nim.equalsIgnoreCase(NIM)) {
                totalPeminjamanMhs += listPeminjaman26[i].lamaPinjam;
            }
        }

        if (!ditemukan) {
                System.out.println("Data lama peminjaman dengan NIM " + NIM + " tidak ditemukan");
        }
    }

    void cariBerdasarNIM(String cari) {
        boolean ditemukan = false;

        for (int i = 0; i < index; i++) {
            if (listPeminjaman26[i].mhs.nim.equalsIgnoreCase(cari)) {
                listPeminjaman26[i].tampilPeminjaman();
                ditemukan = true;
            }
            
        }
        
        if (!ditemukan) {
                System.out.println("Data peminjaman dengan NIM " + cari + " tidak ditemukan");
        }

    }

    //MODIFIKASI B2
    void cariBerdasarJudul(Buku26[] arrayBuku26, String cari2) {
        boolean ditemukan = false;

        for (int i = 0; i < 4; i++) {
            if (arrayBuku26[i].judul.equalsIgnoreCase(cari2)) {
                arrayBuku26[i].tampilBuku();
                ditemukan = true;
            }
            
        }
        
        if (!ditemukan) {
                System.out.println("Data peminjaman dengan Bukui " + cari2 + " tidak ditemukan");
        }

    }
}
