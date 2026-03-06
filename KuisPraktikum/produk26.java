package KuisPraktikum;

public class produk26 {
    String nama;
    double harga;
    int stok;
    double diskon;

    void tampilkanInformasi() {
        String formatMenu = "%-10s %-15s %-5s %-5s\n";
        System.out.printf(formatMenu, nama, harga, stok, diskon);  
    }

    double hitungHargaDiskon() {
        double hargaDiskon = 0;
        hargaDiskon = harga - ((harga*diskon)/100);

        return hargaDiskon;
    }

    produk26(String nm, double hrg, int stk, double disk) {
        nama = nm;
        harga = hrg;
        stok = stk;
        diskon = disk;
    }
}
