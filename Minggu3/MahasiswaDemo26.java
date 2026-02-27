package Minggu3;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Mahasiswa26[] arrayOfMahasiswa26 = new Mahasiswa26[3];
        arrayOfMahasiswa26[0] = new Mahasiswa26();
        arrayOfMahasiswa26[0].nim = "244107060033";
        arrayOfMahasiswa26[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa26[0].kelas = "SIB-1E";
        arrayOfMahasiswa26[0].ipk = (float) 3.75;

        arrayOfMahasiswa26[1] = new Mahasiswa26();
        arrayOfMahasiswa26[1].nim = "2341720172";
        arrayOfMahasiswa26[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa26[1].kelas = "TI-2A";
        arrayOfMahasiswa26[1].ipk = (float) 3.36;

        arrayOfMahasiswa26[2] = new Mahasiswa26();
        arrayOfMahasiswa26[2].nim = "244107023006";
        arrayOfMahasiswa26[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa26[2].kelas = "TI-2E";
        arrayOfMahasiswa26[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayOfMahasiswa26[0].nim);
        System.out.println("NAMA    : " + arrayOfMahasiswa26[0].nama);
        System.out.println("KELAS   : " + arrayOfMahasiswa26[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa26[0].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa26[1].nim);
        System.out.println("NAMA    : " + arrayOfMahasiswa26[1].nama);
        System.out.println("KELAS   : " + arrayOfMahasiswa26[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa26[1].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa26[2].nim);
        System.out.println("NAMA    : " + arrayOfMahasiswa26[2].nama);
        System.out.println("KELAS   : " + arrayOfMahasiswa26[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa26[2].ipk);
        System.out.println("-----------------------------------------");
    }
}
