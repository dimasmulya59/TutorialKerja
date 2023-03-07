package rizky;

import java.util.Scanner;

public class LatihanIFELSE2 {
    public static void main(String[] args) {

        Scanner rdk = new Scanner(System.in);

        String nama;
        int nik, nilai;
        System.out.println(" Masukkan Nama Anda = ");
        nama = rdk.nextLine();
        System.out.println(" Masukkan Nik Anda = ");
        nik = rdk.nextInt();
        System.out.println(" Masukkan Nilai Anda = ");
        nilai = rdk.nextInt();

        if (nilai <= 7) {
            System.out.println("Anda Gagal");
        } else {
            if (nilai == 8) {
                System.out.println("Selamat Anda Lulus");
            } else {
                if (nilai > 9) {
                    System.out.println("Anda Lulus dengan hasil terbaik");
                }
            }
        }
    }
}
