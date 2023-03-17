package rizky;

import java.util.Scanner;

public class LatLoopingFor {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;

        Scanner rdk = new Scanner(System.in);
        System.out.println("Masukkan nilai awal = ");
        nilaiAwal = rdk.nextInt();
        System.out.println("Masukkan nilai akhir = ");
        nilaiAkhir = rdk.nextInt();

        total = 0;

        while (nilaiAwal <= nilaiAkhir) {
            total = total + nilaiAwal;
            System.out.println(" ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
    }
}
