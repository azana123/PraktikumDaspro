import java.util.Scanner;

public class ArrayRataNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double rata2, rata2Lulus, rata2TidakLulus, nilaiLulus = 0, nilaiTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0, jumlahMhs;
        
        System.out.print("Masukan jumlah mahasiswa: ");
        jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahLulus += 1;
                nilaiLulus += nilaiMhs[i];
            }else {
                jumlahTidakLulus += 1;
                nilaiTidakLulus += nilaiMhs[i];
            }
        }
        rata2Lulus = nilaiLulus/jumlahLulus;
        rata2TidakLulus = nilaiTidakLulus/jumlahTidakLulus;

        System.out.println("Rata-rata nilai lulus: " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rata2TidakLulus);
    }
}
