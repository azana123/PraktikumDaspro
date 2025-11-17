import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        double[][] survey = new double[jumlahResponden][jumlahPertanyaan];

        System.out.println("=== Masukan Hasil Survey (0-5) ===");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {

                double nilai;
                while (true) {
                    System.out.print(" Skala kepuasan pertanyaan " + (j + 1) + ": ");
                    nilai = input.nextDouble();
                    if (nilai >= 0 && nilai <= 5) {
                        break; 
                    } else {
                        System.out.println("ERROR: Nilai harus antara 0 - 5! Silakan input lagi!");
                    }
                }

                survey[i][j] = nilai;
            }
            System.out.println();
        }

        System.out.println("=== Rata-rata untuk Setiap Responden ===");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survey[i][j];
            }
            double rata = total / jumlahPertanyaan;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rata);
        }

        System.out.println("\n=== Rata-rata untuk Setiap Pertanyaan ===");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }
            double rata = total / jumlahResponden;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rata);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);

        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.printf("Rata-rata: %.2f%n", rataKeseluruhan);

        input.close();
    }
}
