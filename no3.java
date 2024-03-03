package tugas3;
import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        do {
            System.out.print("Masukkan nilai N (1-1000): ");
            N = scanner.nextInt();
            
            if (N < 1 || N > 1000) {
                System.out.println("Nilai N harus antara 1 dan 1000.");
            }
        } while (N < 1 || N > 1000);

        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= N);

        scanner.close();
    }
}