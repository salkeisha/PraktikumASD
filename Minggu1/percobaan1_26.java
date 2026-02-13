package Minggu1;

import java.util.Scanner;
public class percobaan1_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir = 0;
        String nilaiHuruf = "", ketKelulusan = "";
        System.out.println("Program Menghitung Nilai AKhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        if (nilaiTugas < 0 || nilaiKuis < 0 || nilaiUTS < 0 || nilaiUAS < 0 || nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");
        } else {
            nilaiAkhir = (nilaiTugas*0.2) + (nilaiKuis*0.2) + (nilaiUTS*0.3) + (nilaiUAS*0.4);
        }

        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            nilaiHuruf = "A"; 
            ketKelulusan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            ketKelulusan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            nilaiHuruf = "B";
            ketKelulusan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            ketKelulusan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            nilaiHuruf = "C";
            ketKelulusan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            nilaiHuruf = "D";
            ketKelulusan = "TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            ketKelulusan = "TIDAK LULUS";
        }

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);

        System.out.println("===============================");
        System.out.println("===============================");

        System.out.println(ketKelulusan);

        sc.close();


    }
}
