import java.util.Scanner;

public class systemWifiKampus9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Apakah anda seorang civitas akademika? (true/false): ");
        boolean civitas = sc.nextBoolean();

        if (civitas == true) {
            System.out.print("Apakah anda seorang dosen? (true/false): ");
            boolean dosen = sc.nextBoolean();
            if (dosen == true) {
                System.out.println("Akses WiFi diterima (dosen)");
            }else if (dosen == false) {
                System.out.print("apakah anda seorang mahasiswa? (true/false): ");
                boolean mahasiswa = sc.nextBoolean();
                if (mahasiswa == true){
                    System.out.print("Masukan jumlah SKS yang diambil: ");
                    int SKS = sc.nextInt();
                    if (SKS >= 12) {
                        System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
                    }else{
                        System.out.println("Akses ditolak, SKS kurang dari 12");
                    }
                }else{
                    System.out.println("Akses ditolak!");
                }
            }else{
                System.out.println("Akses ditolak!");
            }
        }else {
            System.out.println("Akses ditolak!");
        }
        sc.close();
    }
}

