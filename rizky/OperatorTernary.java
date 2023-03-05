package rizky;

import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        // Operator Ternary
        // (jawaban = ekspresi ? statement_true : statement_false)

        // Contoh 1

        boolean suka = true;
        String jawaban;

        jawaban = suka ? "iya" : "tidak";

        System.out.println(jawaban);
        System.out.println("========================");

        // Contoh 2
        Scanner rdk = new Scanner(System.in);
        int umur;
        String nama, alamat, status;

        System.out.println("Masukan Nama Anda = ");
        nama = rdk.nextLine();
        System.out.println("Masukan Alamat Anda = ");
        alamat = rdk.nextLine();
        System.out.println("Masukan Umur Anda = ");
        umur = rdk.nextInt();

        status = (umur >= 25) ? ("Sudah Siap Menikah") : ("Belum Siap Menikah");
        System.out.println("Nama Anda = " + nama);
        System.out.println("Alamat Anda = " + alamat);
        System.out.println("Umur Pria / Wanita = " + umur + " Tahun ");
        System.out.println("ketentuanMenikah = " + status);
    }
}
