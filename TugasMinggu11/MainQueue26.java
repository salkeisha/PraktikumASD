package TugasMinggu11;
import java.util.Scanner;
public class MainQueue26 {
    public static void menu() {
        System.out.println();
        System.out.println("--- SISTEM ANTRIAN MAHASISWA ---");
        System.out.println("=================================");
        System.out.println("1. Tambah Antrian Baru");
        System.out.println("2. Panggil Antrian");
        System.out.println("3. Lihat Antrian Terdepan dan Terakhir");
        System.out.println("4. Cek Jumlah Antrian Saat Ini");
        System.out.println("5. Cek Status Antrian (Kosong/Penuh)");
        System.out.println("6. Lihat Seluruh Daftar Antrian");
        System.out.println("7. Kosongkan Semua Antrian");
        System.out.println("8. Keluar");
        System.out.println("==================================");
        System.out.print("Pilih Menu (1-8) : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList26 antrian = new QueueLinkedList26();
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.println("--- PENDAFTARAN ANTRIAN ---");
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = sc.nextLine();
                    System.out.print("Keperluan : ");
                    String keperluan = sc.nextLine();
                    Mahasiswa26 mhs = new Mahasiswa26(nim, nama, kelas, keperluan);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.printFrontRear();
                    break;
                case 4:
                    antrian.printSize();
                    break;
                case 5:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian Masih Kosong.");
                    } else if (antrian.isFull()) {
                        System.out.println("Antrian sudah penuh.");
                    } else {
                        System.out.println("Antrian masih tersedia, silahkan mendaftar.");
                    }
                    break;
                case 6:
                    antrian.printQueue();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    System.out.println("Terimakasih sudah menggunakan layanan kami!");
                    break;
                default:
                    System.out.println("Pilih nomor yang valid!");
             }
        } while (pilih != 8);

        sc.close();
    }
}
