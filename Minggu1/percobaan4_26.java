package Minggu1;

public class percobaan4_26 {

    static int[][] bunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9},
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    static void pendapatanHabis() {
        for (int i = 0; i < bunga.length; i++) {
            int jumlahPendapatan = 0;

            for (int j = 0; j < bunga[i].length; j++) {
                jumlahPendapatan += bunga[i][j] * hargaBunga[j];
            }

            String status = tampilkanStatus(jumlahPendapatan);
            System.out.println("RoyalGarden" + (i + 1) + " : Rp" + jumlahPendapatan + " dengan status : " + status);

        }
    }

    static String tampilkanStatus(int jumlahPendapatan) {
        if (jumlahPendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        } 
    }

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("Pendapatan Cabang-cabang RoyalGarden");
        System.out.println("===============================");
        pendapatanHabis();
    }
    
}
