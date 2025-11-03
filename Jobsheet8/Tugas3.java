import java.util.Scanner;

public class Tugas3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        int totalPelanggan = 0;
        int totalItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        int i = 1; 
      
        while (i <= jumlahCabang) {
            
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            int totalItemCabang = 0;
            int j = 1; 
           
            while (j <= jumlahPelanggan) {
                
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
                j++;
            
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

          
            totalPelanggan += jumlahPelanggan;
            totalItem += totalItemCabang;

            i++;
       
        }
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("- Pelanggan: " + totalPelanggan + " orang");
        System.out.println("- Item terjual: " + totalItem + " item");
    }
}
