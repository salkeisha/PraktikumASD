package Minggu3;

public class DataDosen26 {

    void dataSemuaDosen (Dosen26[] arrayDosen26) {
        String format = "%-2s %-10s %-22s %-15s %-4s\n";
        int nomor = 1;
        String jk;
        System.out.println("================ DATA DOSEN ================");
        System.out.printf(format, "No", "Kode", "Nama", "Jenis Kelamin", "Usia");
        for (Dosen26 dosen : arrayDosen26) {
            if (dosen.jenisKelamin == true) {
                jk = "Wanita";
            } else {
                jk = "Pria";
            }
            System.out.printf(format, nomor, dosen.kode, dosen.nama, jk, dosen.usia);

            nomor++;
        }
        System.out.println("----------------------------------------------");
    }

    void jumlahDosenPerJenisKelamin(Dosen26[] arrayOfDosen26) {
        System.out.println("============= DATA JUMLAH DOSEN =============");
        int jumlahDosenWanita = 0, jumlahDosenPria = 0;
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosen.jenisKelamin == true) {
                jumlahDosenWanita++;
            } else {
                jumlahDosenPria++;
            }
        }
        System.out.println("Jumlah Dosen Wanita : " + jumlahDosenWanita);
        System.out.println("Jumlah Dosen Pria   : " + jumlahDosenPria);
        System.out.println("----------------------------------------------");
    
    }

    void rerataUsiaDosenPerjenisKelamin(Dosen26[] arrayOfDosen26) {
        System.out.println("============= DATA RERATA USIA DOSEN =============");
        int jumlahDosenWanita = 0, jumlahDosenPria = 0, jumlahUsiaW = 0, jumlahUsiaP = 0;
        double rerataW = 0, rerataP = 0;
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosen.jenisKelamin == true) {
                jumlahDosenWanita++;
                jumlahUsiaW += dosen.usia;
            } else {
                jumlahDosenPria++;
                jumlahUsiaP += dosen.usia;
            }
        }
        rerataW = jumlahUsiaW/jumlahDosenWanita;
        rerataP = jumlahUsiaP/jumlahDosenPria;
        System.out.println("Rerata Usia Dosen Wanita : " + rerataW);
        System.out.println("Rerata Usia Dosen Pria : " + rerataP);
        System.out.println("----------------------------------------------");
    }

    void infoDosenPalingTua(Dosen26[] arrayOfDosen26) {
        Dosen26 dosenPlgTua = arrayOfDosen26[0];
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosen.usia > dosenPlgTua.usia) {
                dosenPlgTua = dosen;
            }
        }

        String format = "%-2s %-10s %-22s %-15s %-4s\n";
        String jk = "";
        System.out.println("================= DATA DOSEN PALING TUA =================");
        System.out.printf(format, "No", "Kode", "Nama", "Jenis Kelamin", "Usia");
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosenPlgTua.jenisKelamin == true) {
                jk = "Wanita";
            } else {
                jk = "Pria";
            }
        }
        System.out.printf(format, "1", dosenPlgTua.kode, dosenPlgTua.nama, jk, dosenPlgTua.usia);
        System.out.println("----------------------------------------------");
    }

    void infoDosenPalingMuda(Dosen26[] arrayOfDosen26) {
        Dosen26 dosenPlgMuda = arrayOfDosen26[0];
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosen.usia < dosenPlgMuda.usia) {
                dosenPlgMuda = dosen;
            }
        }
        String format = "%-2s %-10s %-22s %-15s %-4s\n";
        String jk = "";
        System.out.println("================= DATA DOSEN PALING MUDA =================");
        System.out.printf(format, "No", "Kode", "Nama", "Jenis Kelamin", "Usia");
        for (Dosen26 dosen : arrayOfDosen26) {
            if (dosenPlgMuda.jenisKelamin == true) {
                jk = "Wanita";
            } else {
                jk = "Pria";
            }
        }
        System.out.printf(format, "1", dosenPlgMuda.kode, dosenPlgMuda.nama, jk, dosenPlgMuda.usia);
        System.out.println("----------------------------------------------");

    }
    
}
