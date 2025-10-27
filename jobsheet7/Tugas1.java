import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jumlahTiket, diskon, totalHarga, hargaTiket = 50000;

        do {
            System.out.print("Masukan jumlah tiket yang ingin dipesan: ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket yang dipesan tidak valid. Masukan ulang jumlah tiket!");
                continue;
            }
            if (jumlahTiket > 0 && jumlahTiket <=4) {
                diskon = 0 * 50000;
                totalHarga = (jumlahTiket * hargaTiket) - (jumlahTiket * diskon);
                int tiket = (int) jumlahTiket;
                int harga = (int) totalHarga;
                System.out.println("Tiket terjual: " + tiket);
                System.out.println("Total harga yang harus dibayarkan adalah: Rp " + harga);
            }else if (jumlahTiket > 4 && jumlahTiket <= 10) {
                diskon = 0.1 * 50000;
                totalHarga = (jumlahTiket * hargaTiket) - (jumlahTiket * diskon);
                int tiket = (int) jumlahTiket;
                int harga = (int) totalHarga;
                System.out.println("Tiket terjual: " + tiket);
                System.out.println("Total harga yang harus dibayarkan adalah: Rp " + harga);
            }else if (jumlahTiket > 10) {
                diskon = 0.15 * 50000;
                totalHarga = (jumlahTiket * hargaTiket) - (jumlahTiket * diskon);
                int tiket = (int) jumlahTiket;
                int harga = (int) totalHarga;
                System.out.println("Tiket terjual: " + tiket);
                System.out.println("Total harga yang harus dibayarkan adalah: Rp " + harga);
            }

            sc.nextLine();
        }while (true);
    }
}
