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
        Scanner Rdk = new Scanner(System.in);
        int umur;
        String status;

        System.out.println("Masukan umur anda = ");
        umur = Rdk.nextInt();

        status = (umur >= 25) ? ("Sudah Siap Menikah") : ("Belum Siap Menikah");
        System.out.println("Umur Pria / Wanita = " + umur + " Tahun ");
        System.out.println("ketentuanMenikah = " + status);
    }
}
