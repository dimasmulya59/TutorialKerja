package rizky;

import java.util.Scanner;

public class LatihanIFELSE {
    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);

        int i;

        System.out.println("Masukkan Nilai = ");
        i = rd.nextInt();

        if (i <= 10) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }

    }
}
