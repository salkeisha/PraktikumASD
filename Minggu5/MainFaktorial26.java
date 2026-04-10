package Minggu5;

import java.util.Scanner;

public class MainFaktorial26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        int nilai = input.nextInt();

        Faktorial26 fk = new Faktorial26();
        System.out.println("NIlai faktorial " + nilai + 
            " menggunakan BF: " +fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + 
            " menggunakan DC: " + fk.faktorialDC(nilai));

        input.close();
    }
}
