package CASEMETHOD1;

public class SistemPeminjaman26 {
    Peminjaman26[] listPeminjaman26 = new Peminjaman26[5];
    int index;

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
}
