package PraktikumDaspro.belajar;

import java.util.Scanner;
public class inventarisToko {
    static Scanner sc = new Scanner(System.in);
    static String[][] dataBarang = new String[1][4];
    static int jumlahData = 0;
    static int[] hargaGlobal = new int[1];
    static int[] stokGlobal = new int[1];
    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println();
            System.out.println("========================================");
            System.out.println("============== TOKO MONAS ==============");
            System.out.println("========= SILAHKAN PILIH MENU ==========");
            System.out.println("========================================");
            System.out.println();
            System.out.println("1. Tambahkan barang baru");
            System.out.println("2. Tampilkan semua barang");
            System.out.println("3. Cari barang berdasarkan kode");
            System.out.println("4. Update stock barang");
            System.out.println("5. Tampilkan nilai total inventaris");
            System.out.println("6. Update harga barang");
            System.out.println("7. Hapus data barang");
            System.out.println("8. Keluar");
            System.out.println();
            System.out.println("========================================");
            System.out.print("MENU => ");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            switch (menu) {
                case 1:
                    tambahBarang();
                    for (int i = 0; i < jumlahData; i++) {
                        hargaGlobal[i] = Integer.parseInt(dataBarang[i][2]);
                        stokGlobal[i] = Integer.parseInt(dataBarang[i][3]);
                    }
                    break;
                case 2: 
                    tampilDataBarang();
                    break;
                case 3:
                    cariKode();
                    break;
                case 4:
                    updateStok();
                    for (int i = 0; i < jumlahData; i++) {
                        hargaGlobal[i] = Integer.parseInt(dataBarang[i][2]);
                        stokGlobal[i] = Integer.parseInt(dataBarang[i][3]);
                    }
                    break;
                case 5: 
                    totalInventaris();
                    break;
                case 6: 
                    updateHarga();
                    for (int i = 0; i < jumlahData; i++) {
                        hargaGlobal[i] = Integer.parseInt(dataBarang[i][2]);
                        stokGlobal[i] = Integer.parseInt(dataBarang[i][3]);
                    }
                    break;
                case 7:
                    hapusData();
                    for (int i = 0; i < jumlahData; i++) {
                        hargaGlobal[i] = Integer.parseInt(dataBarang[i][2]);
                        stokGlobal[i] = Integer.parseInt(dataBarang[i][3]);
                    }
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Masukan menu yang valid!");
                        
            }
        }
        System.out.println("========== PROGRAM DIHENTIKAN ==========");
        System.out.println("========================================");
    }

    //infinite data input 
    static void infiniteData() {
        String[][] infiniteArray = new String[dataBarang.length * 2][4];
        int[] infiniteArray1 = new int[dataBarang.length * 2];
        int[] infiniteArray2 = new int[dataBarang.length * 2];
        for (int i = 0; i < jumlahData; i++) {
            for (int j = 0; j < 4; j++) {
                infiniteArray[i][j] = dataBarang[i][j];
                infiniteArray1[i] = hargaGlobal[i];
                infiniteArray2[i] = stokGlobal[i];
            }
        }
        dataBarang = infiniteArray;
        hargaGlobal = infiniteArray1;
        stokGlobal = infiniteArray2;
    }

    //MENU 1 INPUT DATA BARANG
    //index 0 = nama barang
    //index 1 = kode barang
    //index 2 = harga barang
    //index 3 = stok barang (kardus)

    static void tambahBarang() {

        if (jumlahData >= dataBarang.length) {
            infiniteData();
        }
        System.out.println("========================================");
        System.out.println("========== MASUKAN DATA BARANG =========");
        System.out.println("========================================");
        System.out.println();
        System.out.print("Masukan nama barang: ");
        dataBarang[jumlahData][0] = sc.nextLine();
        
        System.out.print("Masukan kode barang: ");
        String kodeUnik = sc.nextLine();
        validasiKode(kodeUnik, sc);

        System.out.print("Masukan harga barang (per kardus): ");
        boolean hargaValid = false;
        int harga = sc.nextInt();

        while (!hargaValid) {
            if (harga <= -1) {
                System.out.println("========================================");
                System.out.println("Harga tidak valid!");
                System.out.print("Masukan harga valid: ");
                harga = sc.nextInt();
            }else {
                String hargaSTR = String.valueOf(harga);
                dataBarang[jumlahData][2] = hargaSTR; 
                hargaValid = true;
            }
        }

        System.out.print("Masukan stok (kardus): ");
        boolean stokValid = false;
        int stok = sc.nextInt();

        while (!stokValid) {
            if (stok <= -1) {
                System.out.println("========================================");
                System.out.println("Stok tidak valid!");
                System.out.print("Masukan stok valid: ");
                stok = sc.nextInt();
            }else {
                String stokSTR = String.valueOf(stok);
                dataBarang[jumlahData][3] = stokSTR;
                stokValid = true;
                System.out.println();
            }
        }

        jumlahData++;
        System.out.println("========================================");
        System.out.println("======== DATA BERHASIL DISIMPAN ========");
        System.out.println("========================================");
        System.out.println();
    }
        
    //VALIDASI KODE UNIK
    static void validasiKode(String kodeUnik, Scanner sc) {
        boolean kodeValid = false;
        
        while (!kodeValid) {
            boolean sama = false;
            for (int i = 0; i < jumlahData; i++) {
                if (dataBarang[i][1].equals(kodeUnik)) {
                    sama = true;
                    break;
                }
            }

            if (sama) {
                System.out.println("KODE UNIK SUDAH TERPAKAI!");
                System.out.println("Masukan ulang KODE UNIK yang belum terpakai");
                System.out.print("Masukan kode barang: ");
                kodeUnik = sc.nextLine();
            }else {
                dataBarang[jumlahData][1] = kodeUnik;
                kodeValid = true;
            }
        }
    }
    //MENU 2 TAMPILKAN BARANG
    static void tampilDataBarang() {
        System.out.println("========================================");
        System.out.println("======== DATA BARANG TOKO MONAS ========");
        System.out.println("========================================");
        System.out.println();

        if (jumlahData == 0) {
            System.out.println("Data Tidak Ditemukan!");
            System.out.println();
        }else if (dataBarang[0][0].equals("0")) {
            System.out.println("Data Tidak Ditemukan!");
            System.out.println();
      
        }else {
                for (int i = 0; i < jumlahData; i++) {
                System.out.println();
                System.out.println("========================================");
                System.out.println("DATA BARANG KE- " + (i + 1));
                System.out.println("========================================");
                System.out.println("Nama Barang\t: " + dataBarang[i][0]);
                System.out.println("Kode Barang\t: " + dataBarang[i][1]);
                System.out.println("Harga Barang\t: " + dataBarang[i][2]);
                System.out.println("Stok Barang\t: " + dataBarang[i][3]);
            }     
        }
    }
    //MENU 3 CARI BARANG BERDASARKAN KODE
    static void cariKode() {
        int index = -1;
        boolean found = false;
        System.out.print("Masukan kode barang: ");
        String cariKode = sc.nextLine();
        System.out.println("========================================");
        
        for (int i = 0; i < jumlahData; i++) {
            index = i;
            for (int j = 0; j < 4; j++) {
                if (cariKode.equalsIgnoreCase(dataBarang[i][1])) {
                    found = true;
                    break;
                }
                
            }
        }
        if (found) {
            System.out.println("========================================");
            System.out.println("INI BARANG YANG ANDA CARI: ");
            System.out.println();
            System.out.println("Nama Barang\t: " + dataBarang[index][0]);
            System.out.println("Kode Barang\t: " + dataBarang[index][1]);
            System.out.println("Harga Barang\t: " + dataBarang[index][2]);
            System.out.println("Stok Barang\t: " + dataBarang[index][3]);
            System.out.println();
        }else {
            System.out.println("Barang tidak ditemukan");
            System.out.println("========================================");
        }
        
    }
    //MENU 4 UPDATE STOCK BARANG
    static void updateStok() {
        boolean dataAda = false;
        tampilDataBarang();
        if (jumlahData > 0) {
            dataAda = true;
        }
        if (dataAda) {
            System.out.println("========================================");
            System.out.println("Masukan data stok barang");
            System.out.print("Data ke-");
            
            int pilihData = sc.nextInt();
            boolean pilihDataValid = false;
    
            while (!pilihDataValid) {
                if (jumlahData < (pilihData) || ((pilihData-1) <= -1)) {
                    System.out.println("========================================");
                    System.out.println("Data tidak valid!");
                    System.out.print("Masukan data valid: ");
                    pilihData = sc.nextInt();
                }else {
                    pilihDataValid = true;
                    System.out.println("========================================");
                    System.out.println("Stok lama\t: " + dataBarang[(pilihData - 1)][3]);
                    System.out.print("Stok baru\t: ");
                    int stokBaru = sc.nextInt();
                    boolean stokValid = false;
                    while (!stokValid) {
                        if (stokBaru < 0) {
                            System.out.println("Stok baru tidak valid");
                            System.out.print("Masukan stok baru: ");
                            stokBaru = sc.nextInt();
                        }else {
                            stokValid = true;
                            System.out.println("Stok baru valid");
                            System.out.println("Stok baru berhasil disimpan");
                            String stok = String.valueOf(stokBaru);
                            dataBarang[(pilihData - 1)][3] = stok;
                        }
                    }
                }
            }
        }else {
            main(null);
        }

    }
    //MENU 5 TAMPILKAN NILAI TOTAL INVENTARIS
    static void totalInventaris() {
        int totalInventaris = 0;
        int[] nilai = new int [jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            nilai[i] = hargaGlobal[i] * stokGlobal[i];
            totalInventaris += nilai[i];
        }
        System.out.println("Total Nilai toko: " + totalInventaris);
    }
    //MENU 6 UPDATE HARGA BARANG
    static void updateHarga() {
        boolean dataAda = false;
        tampilDataBarang();
        if (jumlahData > 0) {
            dataAda = true;
        }
        if (dataAda) {
            System.out.println("========================================");
            System.out.println("Masukan data harga barang");
            System.out.print("Data ke-");
            
            int pilihData = sc.nextInt();
            boolean pilihDataValid = false;
    
            while (!pilihDataValid) {
                if (jumlahData < (pilihData) || ((pilihData-1) <= -1)) {
                    System.out.println("========================================");
                    System.out.println("Data tidak valid!");
                    System.out.print("Masukan data valid: ");
                    pilihData = sc.nextInt();
                }else {
                    pilihDataValid = true;
                    System.out.println("========================================");
                    System.out.println("Harga lama\t: " + dataBarang[(pilihData - 1)][2]);
                    System.out.print("Harga baru\t: ");
                    int hargaBaru = sc.nextInt();
                    boolean hargaValid = false;
                    while (!hargaValid) {
                        if (hargaBaru < 0) {
                            System.out.println("Harga baru tidak valid");
                            System.out.print("Masukan harga baru: ");
                            hargaBaru = sc.nextInt();
                        }else {
                            hargaValid = true;
                            System.out.println("Harga baru valid");
                            System.out.println("Harga baru berhasil disimpan");
                            String harga = String.valueOf(hargaBaru);
                            dataBarang[(pilihData - 1)][2] = harga;
                        }
                    }
                }
            }
        }else {
            main(null);
        }
    }
    //MENU 7 HAPUS DATA
    static void hapusData() {
        boolean dataAda = false;
        tampilDataBarang();
        if (jumlahData > 0) {
            dataAda = true;
        }
        if (dataAda) {
            System.out.println("========================================");
            System.out.println("Masukan data barang");
            System.out.print("Data ke-");
            
            int pilihData = sc.nextInt();
            boolean pilihDataValid = false;
            while (!pilihDataValid) {
                if (jumlahData < (pilihData) || ((pilihData-1) <= -1)) {
                    System.out.println("========================================");
                    System.out.println("Data tidak valid!");
                    System.out.print("Masukan data valid: ");
                    pilihData = sc.nextInt();
                }else {
                    pilihDataValid = true;
                    System.out.println("========================================");
                    System.out.println("Apakah anda yakin?");
                    System.out.println("1. iya");
                    System.out.println("2. tidak");
                    System.out.println("========================================");
                    System.out.print("=> ");
                    int jawab = sc.nextInt();
                    switch (jawab) {
                        case 1:
                            if (jumlahData == 1) {
                                System.out.println("========================================");
                                System.out.println("======== DATA BERHASIL DISIMPAN ========");
                                System.out.println("========================================");
                                System.out.println();
                                for (int i = 0; i < 4; i++) {
                                    dataBarang[pilihData - 1][i] = "0";
                                }
                            }else {
                                System.out.println("========================================");
                                System.out.println("======== DATA BERHASIL DISIMPAN ========");
                                System.out.println("========================================");
                                System.out.println();
                                for (int i = pilihData; i < jumlahData - 1; i++) {
                                    for (int j = 0; j < 4; j++) {
                                        dataBarang[i][j] = dataBarang[i+1][j];
                                    }
                                }
                                jumlahData--;
                            }
                            break;
                        case 2:
                            main(null);
                            break;
                    
                        default:
                            break;
                    }  
                }
            }
        }else {
            main(null);
        }
    }
}
