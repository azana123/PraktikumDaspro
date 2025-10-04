import java.util.Scanner;

public class systemPerpustakaanKampus9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartu = sc.nextBoolean();

        System.out.print("apakah mahasiswa melakukan registrasi secara online? (true/false): ");
        boolean registrasi = sc.nextBoolean();

        if (kartu == true || registrasi == true) {
            System.out.println("Mahasiswa diperbolehkan masuk");
        }else
        System.out.println("Mahasiswa tidak diperbolehkan masuk!!!");

        sc.close();
    }
}
