import java.util.Scanner;

public class tugas2_9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("angka genap");

        }else {
            System.out.println("angka ganjil");
            
        }
        sc.close();
    }
}

