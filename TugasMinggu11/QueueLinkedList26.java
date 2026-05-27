package TugasMinggu11;

public class QueueLinkedList26 {
    Node26 head, tail;
    int size;
    int max = 25;

    public QueueLinkedList26() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Semua Antrian sudah dikosongkan.");
    }

    void enqueue(Mahasiswa26 input) {
        if (isFull()) {
            System.out.println("Mohon Maaf antrian sudah penuh.");
        } else {
            Node26 newNode = new Node26(input, null);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
            System.out.println("Mahasiswa " + input.nama + " telah berahasil ditambahkan kedalam antrian.");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Mohon Maaf antrian masih kosong, tidak dapat memproses antrian.");
        } else {
            System.out.println("Memanggil antrian Teratas: ");
            head.data.tampilkanInformasi();
            head = head.next;
            size--;
            if (isEmpty()) {
                tail = null;
            }
        }
    }

    void printFrontRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("Antiran terdepan : " + head.data.nama + " dengan NIM " + head.data.nim);
            System.out.println("Antrian terakhir : " + tail.data.nama + " dengan NIM " + tail.data.nim);
        }
    }

    void printSize() {
        System.out.println("Jumlah Mahasiswa yang sedang berada dalam antrian : " + size + " Mahasiswa");
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat menampilkan antrian.");
        } else {
            System.out.printf("%-15s %-20s %-10s %-20s\n", "NIM", "NAMA", "KELAS", "KEPERLUAN");
            System.out.println("===========================================================");
            Node26 tmp = head;
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
        }
    }
}
