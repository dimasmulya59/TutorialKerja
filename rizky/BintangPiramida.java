package rizky;

import java.util.Scanner;

public class BintangPiramida {
    public static void main(String[] args) {
        Scanner rdk = new Scanner(System.in);
        int n;
        System.out.println("Masukkan Angka n = ");
        n = rdk.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
