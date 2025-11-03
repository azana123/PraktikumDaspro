import java.util.Scanner;

public class NilaiKelompok09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, nilai;
        float totalNilai, rataNilai;
        float rataTertinggi = 0;   
        int kelompokTertinggi = 0;
       
        i =1;
        
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            
            }

            rataNilai = totalNilai / 5;
    
            System.out.println("Rata-Rata nilai: " + rataNilai);

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }
        System.out.println("\n==============================");
        System.out.println("Kelompok dengan rata-rata tertinggi:");
        System.out.println("Kelompok " + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);
        System.out.println("==============================");
    }
}
