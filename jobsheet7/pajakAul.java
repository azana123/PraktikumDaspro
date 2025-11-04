import java.util.Scanner;

public class pajakAul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double penghasilan, pajak;

        System.out.print("Masukan penghasilan anda: ");
        penghasilan = sc.nextInt();

        if (penghasilan > 500000000) {
            pajak = penghasilan * 0.2;
            int stringPajak = (int) pajak;
            System.out.println("Total pajak anda adalah: " + stringPajak);
        }else if (penghasilan > 250000000 && penghasilan <= 500000000) {
            pajak = penghasilan * 0.15;
            int stringPajak = (int) pajak;
            System.out.println("Total pajak anda adalah: " + stringPajak);
        }else if (penghasilan > 50000000 && penghasilan <= 250000000) {
            pajak = penghasilan * 0.1;
            int stringPajak = (int) pajak;
            System.out.println("Total pajak anda adalah: " + stringPajak);
        }else if (penghasilan == 50000000) {
            pajak = penghasilan * 0.05;
            int stringPajak = (int) pajak;
            System.out.println("Total pajak anda adalah: " + stringPajak);
        }else if (penghasilan == -1) {
            System.out.println("Program selesai");
        }else {
            System.out.println("Jumlah penghasilan anda tidak valid");
        }
        sc.close();
    }
}