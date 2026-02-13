package Minggu1;

import java.util.Scanner;
public class percobaan2_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long nim = 0;
        System.out.print("Masukkan NIM anda : ");
        nim = sc.nextLong();

        long digit = 0;
        digit = nim % 100;

        for (int i = 1; i <= digit; i++) {

            if (digit < 10) {
                digit = digit + 10;
            }
            
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 == 1 && !(i % 3 == 0)) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }

        }
        sc.close();
    
    }
}
