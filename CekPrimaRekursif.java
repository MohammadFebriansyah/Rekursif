import java.util.Scanner;
public class CekPrimaRekursif {

    public static boolean isPrima(int n, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false; 
        }
        return isPrima(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n + " bukan bilangan prima.");
        } else {
            boolean hasil = isPrima(n, n - 1);
            if (hasil) {
                System.out.println(n + " adalah bilangan prima.");
            } else {
                System.out.println(n + " bukan bilangan prima.");
            }
        }

        scanner.close();
    }
}
