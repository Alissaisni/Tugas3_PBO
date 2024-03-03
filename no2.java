package tugas3;
import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input batas awal dan batas akhir
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i) && i != 1) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk memeriksa apakah suatu bilangan adalah bilangan prima atau tidak
    public static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}