import java.util.Scanner;
public class SearchNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = sc.nextInt();
        
        int[] arrNilai = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;
        for (int i = 0; i < jumlah; i++) {
            if (arrNilai[i] == key) {
                hasil = i; 
                break;     
            }
        }
        System.out.println(); 

        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }

        sc.close();
        

             
    }
}
