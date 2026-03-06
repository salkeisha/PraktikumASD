package KuisPraktikum;

public class produkMain26 {

    public static void main(String[] args) {
        //Instansiasi class
        produk26[] arrayOfProduk26 = new produk26[4];
        //Format menu untuk formatan printformat tabel data produk
        String formatMenu = "%-10s %-15s %-5s %-5s\n";

        //Masukkan data produk dengan konstruktor berparameter
        arrayOfProduk26[0] = new produk26("Beras", 75000, 23, 5);
        arrayOfProduk26[1] = new produk26("Gula", 17500, 58, 5);
        arrayOfProduk26[2] = new produk26("Roti", 22000, 26, 2);
        arrayOfProduk26[3] = new produk26("Susu", 12000, 64, 3);

        //Panggil method tampilinformasi per produk
        System.out.println("=========== DAFTAR PRODUK ===========");
        System.out.printf(formatMenu,  "Nama", "Harga", "Stok", "Diskon");
        arrayOfProduk26[0].tampilkanInformasi();
        arrayOfProduk26[1].tampilkanInformasi();
        arrayOfProduk26[2].tampilkanInformasi();
        arrayOfProduk26[3].tampilkanInformasi();

        //Panggil method hitungHargaDiskon per produk
        System.out.println("============ HARGA SETELAH DISKON PER PRODUK ============");
        System.out.println("Harga setelah diskon produk Beras : " + arrayOfProduk26[0].hitungHargaDiskon());
        System.out.println("Harga setelah diskon produk Gula  : " + arrayOfProduk26[1].hitungHargaDiskon());
        System.out.println("Harga setelah diskon produk Roti  : " + arrayOfProduk26[2].hitungHargaDiskon());
        System.out.println("Harga setelah diskon produk Susu  : " + arrayOfProduk26[3].hitungHargaDiskon());


    }
    
}
