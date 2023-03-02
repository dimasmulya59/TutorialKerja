package rizky;

public class OperatorAritmatika {
    public static void main(String[] args) {

        // Operasi Aritmatika

        int variable1 = 75;
        int variable2 = 25;
        int hasil;

        // Penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        // Pengurangan
        hasil = variable1 - variable2;
        System.out.println(variable1 + " - " + variable2 + " = " + hasil);

        // Perkalian
        hasil = variable1 * variable2;
        System.out.println(variable1 + " * " + variable2 + " = " + hasil);

        // Pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n", variable1, variable2, hasil);

        // Modulus(adalah sisa pembagian)
        hasil = variable1 % variable2;
        System.out.println(variable1 + " %% " + variable2 + " = " + hasil);

    }
}