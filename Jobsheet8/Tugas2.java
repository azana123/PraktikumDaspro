import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        int i = 1;
        while (i <= n) {
           
            int j = 1;
           
            while (j <= n) {
         
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print(n + " ");
                else
                    System.out.print("  ");
                j++;
            
            }
            
            System.out.println(); 
            i++;
        }
    }
}
