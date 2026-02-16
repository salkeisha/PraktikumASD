package Minggu1;

import java.util.Scanner;
public class tugas1_26 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Deklarasi isi Array KODE dan KOTA dengan tipe data char
        char[] KODE = {'A', 'B', 'D', 'E','F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        //Input dinamis pengguna
        System.out.print("Input kode plat nomor yang ingin anda cari : ");
        char inputKode = sc.next().charAt(0); //Agar bisa input dengantipe data char

        //Menetapkan nilai awal variabel ditemukan
        int ditemukan = -1;

        //Mencari di variabel Array KODE agar sesuai dengan inputan pengguna
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode){
                ditemukan = i; //mengganti nilai variabel ditemukan dengan nilai variabel i
                break;
            }
        }

        //Output jika sudah dicari
        //Jika variabel ditemukan ketemu, maka akan menjalankan output sesuai kota
        if (ditemukan != -1) {
            System.out.print("Plat nomor dari kode yang anda masukkan adalah : ");
            for (int j = 0; j < KOTA[ditemukan].length; j++ ) {
                System.out.print(KOTA[ditemukan][j]);
            }
            System.out.println();
        //Jika variabel ditemukan tidak ketemu(nilai tetap -1), maka akan menghasilkan output dibawah ini
        } else {
            System.out.println("Plat nomor yang anda cari tidak ada di dalam data");
        }
        sc.close();
     }
}
