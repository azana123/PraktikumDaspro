package PraktikumDaspro.Jobsheet13;
import java.util.Scanner;

public class CM2_FafiqLutfiAzana {
    static String[][] dataPrestasi = new String[10][5]; 
    static int jumlahData = 0;
// index 0 = nama
// index 1 = nim
// index 2 = jenis prestasi
// index 3 = tingkat prestasi
// index 4 = tahun prestasi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int menu;

        while (running) {
            System.out.println("=====================================");
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Cari Prestasi Berdasarkan Jenis");
            System.out.println("4. Hitung Jumlah Prestasi per Tingkat");
            System.out.println("5. Keluar");
            System.out.println("=====================================");
            System.out.print("=> ");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println("=====================================");

            switch (menu) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    System.out.print("Masukkan jenis prestasi : ");
                    String jenis = sc.nextLine();
                    System.out.println("");
                    cariJenis(jenis);
                    break;
                case 4:
                    hitungPrestasiPerTingkat();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Masukkan angka yang valid!");
            }
        }

        System.out.println("====== Program Dihentikan ======");
    }

    //Infinite data input
    static void infiniteArray() {
        String[][] infiniteData = new String[dataPrestasi.length * 2][5];
        for (int i = 0; i < jumlahData; i++) {
            for (int j = 0; j < 5; j++) {
                infiniteData[i][j] = dataPrestasi[i][j];
            }
        }
        dataPrestasi = infiniteData;
    }

    //Menu 1 Tambah Data
    static void inputData() { 
        Scanner sc = new Scanner(System.in);

        if (jumlahData >= dataPrestasi.length) {
            infiniteArray();
        }
        //Input Data Mahasiswa
        System.out.println("==== Data Mahasiswa ====");
       
        System.out.print("Nama\t\t: ");
        dataPrestasi[jumlahData][0] = sc.nextLine();
        
        System.out.print("NIM\t\t: ");
        dataPrestasi[jumlahData][1] = sc.nextLine();
        
        System.out.print("Jenis Prestasi\t: ");
        dataPrestasi[jumlahData][2] = sc.nextLine();

        //Input Tingkat Prestasi Mahasiswa
        int tingkatPrestasi;
        while (true) {
            System.out.println();
            System.out.println("==========Tingkat Prestasi===========");
            System.out.println("1. Lokal");
            System.out.println("2. Nasional");
            System.out.println("3. Internasional");
            System.out.print("=> ");

            if (sc.hasNextInt()) {
                tingkatPrestasi = sc.nextInt();
                sc.nextLine();
                if (tingkatPrestasi >= 1 && tingkatPrestasi <= 3) break;
            } else sc.nextLine();

            System.out.println("Pilihan tidak valid!");
        }

        switch (tingkatPrestasi) {
            case 1: dataPrestasi[jumlahData][3] = "Lokal"; break;
            case 2: dataPrestasi[jumlahData][3] = "Nasional"; break;
            case 3: dataPrestasi[jumlahData][3] = "Internasional"; break;
        }

        //Input Tahun Prestasi Mahasiswa
        int tahunPrestasi;
        while (true) {
            System.out.print("Tahun Prestasi\t: ");
            tahunPrestasi = sc.nextInt();
            if (tahunPrestasi >= 2015 && tahunPrestasi <= 2025) break;
            System.out.println("Masukkan tahun antara 2015-2025!");
        }

        dataPrestasi[jumlahData][4] = String.valueOf(tahunPrestasi);
        jumlahData++;

        System.out.println("Penambahan Data Prestasi Berhasil!");
    }

    //Menu 2 Tampilkan Data
    static void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data Mahasiswa berprestasi");
            return;
        }

        String[] tampilData = {
            "Nama\t\t\t: ",
            "NIM\t\t\t: ",
            "Jenis Prestasi\t\t: ",
            "Tingkat Prestasi\t: ",
            "Tahun Prestasi\t\t: "
        };

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Mahasiswa " + (i + 1));
            System.out.println("=====================================");
            for (int j = 0; j < 5; j++) {
                System.out.println(tampilData[j] + dataPrestasi[i][j]);
            }
            System.out.println("=====================================");
        }
    }
    //Menu 3 Cari Prestasi Berdasarkan Jenis
    static void cariJenis(String jenis) {
        boolean found = false;
        System.out.println("Data Prestasi Mahasiswa " + jenis);

        for (int i = 0; i < jumlahData; i++) {
            if (dataPrestasi[i][2].equalsIgnoreCase(jenis)) {
                found = true;
                System.out.println("=====================================");
                System.out.println("Nama\t\t\t: " + dataPrestasi[i][0]);
                System.out.println("NIM\t\t\t: " + dataPrestasi[i][1]);
                System.out.println("Jenis Prestasi\t\t: " + dataPrestasi[i][2]);
                System.out.println("Tingkat Prestasi\t: " + dataPrestasi[i][3]);
                System.out.println("Tahun Prestasi\t\t: " + dataPrestasi[i][4]);
            }
        }

        if (!found) {
            System.out.println("=====================================");
            System.out.println("Tidak ada data Prestasi " + jenis);
        }
        System.out.println("=====================================");
    }

    //Menu 4 hitung jumlah prestasi per tingkat
    static void hitungPrestasiPerTingkat() {
        int[] count = {0, 0, 0};

        for (int i = 0; i < jumlahData; i++) {
            if (dataPrestasi[i][3].equals("Lokal")) count[0]++;
            else if (dataPrestasi[i][3].equals("Nasional")) count[1]++;
            else if (dataPrestasi[i][3].equals("Internasional")) count[2]++;
        }

        System.out.println("====== Data Prestasi Per Tingkat ======");
        System.out.println("Lokal\t\t: " + count[0]);
        System.out.println("Nasional\t: " + count[1]);
        System.out.println("Internasional\t: " + count[2]);
        System.out.println("=====================================");
    }
}
