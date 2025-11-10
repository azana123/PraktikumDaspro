import java.util.Scanner; 
public class tugas2 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        String[] namaPesanan = new String[jumlah];
        double[] hargaPesanan = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = input.nextLine();

            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine(); 
        }

        double totalBiaya = 0;
        for (int i = 0; i < jumlah; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n===== DAFTAR PESANAN KAFE =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d. %s - Rp %.2f%n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }

        System.out.println("-----------------------------------");
        System.out.printf("Total Biaya: Rp %.2f%n", totalBiaya);
        System.out.println("===================================");

        input.close();
    }
}


