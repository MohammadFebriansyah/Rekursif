import java.util.Scanner;

public class DeretDescendingRekursif13 {
   
    public static void tampilkanRekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        tampilkanRekursif(n - 1);
    }
    public static void tampilkanIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        System.out.println("\nMenggunakan Rekursi:");
        tampilkanRekursif(n);
        System.out.println("\n\nMenggunakan Iterasi:");
        tampilkanIteratif(n);

        scanner.close();
    }
}
