package Minggu12;
import java.util.Scanner;
public class DoubleLinkedListMain26 {

    public static Mahasiswa26 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM     : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama    : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas   : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK     : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa26(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListed26 list = new DoubleLinkedListed26();
        int pilihan;
        
        do {
            System.out.println("\n==== MENU DOUBLE LINKED LIST ====");
            System.out.println("1. Tambah data di Awal");
            System.out.println("2. Tambah data di Akhir");
            System.out.println("3. Sisipkan data di tengah (Setelah NIM)");
            System.out.println("4. Hapus data di Awal");
            System.out.println("5. Hapus data di Akhir");
            System.out.println("6. Tampilkan Data (Mulai Awal)");
            System.out.println("7. Tampilkan Data (Mulai Akhir)"); //Modifikasi penambahan method
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa26 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa26 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru : ");
                    Mahasiswa26 dataBaru = inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7: // Modifikasi penambahan method
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
