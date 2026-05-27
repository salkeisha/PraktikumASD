package Minggu11;

public class SingleLinkedList26 {
    Node26 head;
    Node26 tail;

    boolean isEmpty() {
        return (head == null);
    }

    void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.print("Isi Linked List:\t");
            System.out.println();
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void InsertAfter(String key, Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        Node26 tmp = head;

        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }

    void InsertAt(int index, Mahasiswa26 input) {
        if (index < 0) {
            System.out.println("Indeks salah.");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node26 tmp =  head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            tmp.next = new Node26(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }
}
