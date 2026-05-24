package Minggu10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahSudahKRS;
    int kuotaDPA = 30;

    AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.jumlahSudahKRS = 0;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void clear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        } else {
            front = -1;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }

    void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudahh penuh!");
            return;
        } else {
            if (jumlahSudahKRS + size >= kuotaDPA) {
                System.out.println("Mohon maaf, kuota DPA sudah penuh.");
            }

            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
            System.out.println("Data mahasiswa " + mhs.nama + " telah berhasil dimasukkan.");
        }
    }

    void panggilKRS() {
        if (isEmpty()) {
            System.out.println("Antrian KRS masih kosong.");
            return;
        } else {
            System.out.println("=== MAHASISWA PROSES KRS ===");
            Mahasiswa mhs1 = data[front];
            front = (front + 1) % max;
            size--;
            jumlahSudahKRS++;
            System.out.print("Panggilan 1: ");
            mhs1.tampilkanData();
            if (!isEmpty()) {
                Mahasiswa mhs2 = data[front];
                front = (front + 1) % max;
                size--;
                jumlahSudahKRS++;
                System.out.print("Panggilan 2: ");
                mhs2.tampilkanData();
            } else {
                System.out.println("Hanya 1 mahasiswa yang tersisa di antrian panggilan ini.");
            }
        }
    }

    void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian KRS masih kosong.");
            return;
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian KRS masih kosong.");
            return;
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            System.out.print("1. ");
            data[front].tampilkanData();

            if (size > 1) {
                int index2 = (front + 1) % max;
                System.out.print("2. ");
                data[index2].tampilkanData();
            } else {
                System.out.println( "Hanya ada 1 mahasiswa di antrian");
            }
        }
    }

    void lihatPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian KRS masih kosong."); 
            return;
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    void cetakInformasiKRS() {
        System.out.println("--- INFORMASI STATISTIK KRS ---");
        System.out.println("1. Jumlah antrian saat ini     : " + size);
        System.out.println("2. Jumlah sudah proses KRS     : " + jumlahSudahKRS);

        int belumKRS = kuotaDPA - jumlahSudahKRS;
        System.out.println("3. Jumlah mahasiswa belum KRS  : " + belumKRS + " (SISA KUOTA DPA)");
        System.out.println("Total Kuota DPA : " + kuotaDPA);
    }
}
