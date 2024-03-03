package tugas3;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angka = new int[3];

        String[] namaBil = {"pertama", "kedua", "ketiga"};

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan bilangan " + namaBil[i] + ": ");
            angka[i] = scanner.nextInt();
        }

        // Memeriksa apakah angka adalah ribuan dan menampilkannya
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] >= 1000) {
                System.out.println("Bilangan " + namaBil[i] + " adalah ribuan");
            } else {
                System.out.println("Bilangan " + namaBil[i] + " adalah bukan ribuan");
            }
        }

        scanner.close();
    }
}
