import java.util.Scanner;

public class BioskopWithScanner09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {

                    case 1:
                        while (true) {
                            System.out.print("Masukkan nama: ");
                            nama = sc.nextLine();

                            while (true) {
                                System.out.print("Masukkan baris (1-4): ");
                                baris = sc.nextInt();

                                System.out.print("Masukkan kolom (1-2): ");
                                kolom = sc.nextInt();
                                sc.nextLine(); 
                            
                                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                    System.out.println("Posisi kursi tidak valid! Masukkan kembali.\n");
                                    continue;
                                }

                                if (penonton[baris - 1][kolom - 1] != null) {
                                    System.out.println("Kursi sudah terisi oleh penonton lain!");
                                    System.out.println("Silakan pilih posisi kursi yang lain.\n");
                                    continue; 
                                }

                                break;
                            }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                    
                case 2:
                    System.out.println("\n===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = penonton[i][j];
                            if (isi == null) {
                                isi = "***"; 
                            }
                            System.out.printf("Baris %d Kolom %d: %s\n", i + 1, j + 1, isi);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    return;

                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
