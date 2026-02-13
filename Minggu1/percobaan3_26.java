package Minggu1;

import java.util.Scanner;
public class percobaan3_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMatkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] nilaiMhs = new int[8];
        String[] nilaiHuruf = new String[nilaiMhs.length];
        double[] bobotNilai = new double[nilaiMhs.length];

        System.out.println("===========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===========================");
         
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMatkul[i] + " : " );
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] <= 100 && nilaiMhs[i] > 80) {
                nilaiHuruf[i] = "A"; 
                bobotNilai[i] = 4.00;
            } else if (nilaiMhs[i] <= 80 && nilaiMhs[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiMhs[i] <= 73 && nilaiMhs[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiMhs[i] <= 65 && nilaiMhs[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiMhs[i] <= 60 && nilaiMhs[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiMhs[i] <= 50 && nilaiMhs[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        System.out.println("===========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===========================");

        String formatMenu = "%-45s %-20s %-20s %-20s%n";
        System.out.printf(formatMenu, "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.printf(formatMenu, namaMatkul[i], nilaiMhs[i], nilaiHuruf[i], bobotNilai[i]);
        }

        double nilaiAkhir = 0;
        double bobotSKS[] = {2.00, 3.00, 2.00, 2.00, 1.00, 2.00, 2.00, 2.00};
        double totalBobot = 0, totalSKS = 0; 

        for (int i = 0; i < nilaiMhs.length; i++) {
            totalBobot += (bobotNilai[i] * bobotSKS[i]);
            totalSKS += bobotSKS[i];
        }

        nilaiAkhir = totalBobot / totalSKS;

        System.out.println("===========================");
        System.out.println("IP : " + nilaiAkhir);

        sc.close();
    }
}
