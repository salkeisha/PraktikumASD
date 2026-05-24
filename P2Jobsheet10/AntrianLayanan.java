package P2Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    AntrianLayanan (int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh.");
            return;
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
            rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    Mahasiswa layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    void lihatTerdepan() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    //Menambahkan method getJumlahAntrian
    int getJumlahAntrian() {
        return size;
    }

    //Menambahkan Method LihatAkhir()
    void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("Mahasiswa antrian terbaru: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antiran masih kosong.");
        }
    }
}
