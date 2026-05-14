package Minggu9;

public class StackSurat26 {
    Surat26[] tumpukanSurat;
    int size;
    int top;

    public StackSurat26(int size) {
        this.size = size; 
        tumpukanSurat = new Surat26[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Surat26 data) {
        if (!isFull()) {
            top++;
            tumpukanSurat[top] = data;
            System.out.printf("Surat %s berhasil terdata\n", data.namaMahasiswa);
        } else {
            System.out.println("Stack penuh. Tidak bisa menambahkan surat lagi.");
        }
    }

    Surat26 pop() {
        if (!isEmpty()) {
            Surat26 m = tumpukanSurat[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada Surat yang sedang diproses.");
            return null;
        }
    }

    Surat26 peek() {
        if (!isEmpty()) {
            return tumpukanSurat[top];
        } else {
            System.out.println("Stack kosong! Tidak ada data Surat.");
            return null;
        }
    }

    Surat26 cariSurat(String nmMhs) {
        for (int i = top; i >=0; i--) {
            if (tumpukanSurat[i].namaMahasiswa.equalsIgnoreCase(nmMhs)) {
                return tumpukanSurat[i];
            }
        }
        return null;
    }
}
