package rizky;

import java.util.Scanner;

public class LatihanScanner {
    public static void main(String[] args) {
        Scanner rdk = new Scanner(System.in);
        String nama;
        int umur;
        System.out.println("Masukan nama anda = ");
        nama = rdk.nextLine();
        System.out.println("Masukan umur anda = ");
        umur = rdk.nextInt();

        System.out.println("Nama = " + nama);
        System.out.println("Umur anda = " + umur + " Tahun ");
    }
}
