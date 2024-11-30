import java.util.Scanner;
public class PenjumlahanRekursif {

    public static int hitungPenjumlahan(int f) {
        if (f == 1) {
            return 1;
        }
        return f + hitungPenjumlahan(f - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = scanner.nextInt();

        if (f <= 0) {
            System.out.println("Masukkan nilai f yang lebih besar dari 0.");
        } else {
            int hasil = hitungPenjumlahan(f);
            System.out.println("Hasil penjumlahan dari 1 hingga " + f + " adalah: " + hasil);
        }

        scanner.close();
    }
}
