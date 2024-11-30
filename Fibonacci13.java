import java.util.Scanner;
public class Fibonacci13 {

    public static int hitungPasangan(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1; 
        }
        return hitungPasangan(bulan - 1) + hitungPasangan(bulan - 2); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bulan ke-n: ");
        int bulan = scanner.nextInt();
        if (bulan <= 0) {
            System.out.println("Bulan harus lebih besar dari 0.");
        } else {
            int totalPasangan = hitungPasangan(bulan);
            System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + totalPasangan);
        }

        scanner.close();
    }
}
