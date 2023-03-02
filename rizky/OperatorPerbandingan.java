package rizky;

public class OperatorPerbandingan {
    public static void main(String[] args) {
        // Operator pembanding (persamaan dan pertidaksamaan)
        // Persamaan (==)
        System.out.println("==== Persamaan ====");
        int a, b;
        boolean hasilPembandingan;

        a = 11;
        b = 10;

        hasilPembandingan = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilPembandingan);

        a = 10;
        b = 10;

        hasilPembandingan = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilPembandingan);

        // Pertidaksamaan (!=)
        System.out.println("==== Pertidaksamaan ====");
        a = 11;
        b = 10;

        hasilPembandingan = (a != b);
        System.out.printf("%d != %d --> %s \n", b, a, hasilPembandingan);

        a = 13;
        b = 21;

        hasilPembandingan = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilPembandingan);

        // Kurang dari (<)
        System.out.println("==== Kurang dari ====");
        a = 10;
        b = 10;

        hasilPembandingan = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilPembandingan);

        a = 11;
        b = 10;

        hasilPembandingan = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilPembandingan);

        // Lebih dari (>)
        System.out.println("==== Lebih dari ====");
        a = 11;
        b = 11;

        hasilPembandingan = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilPembandingan);

        a = 11;
        b = 10;

        hasilPembandingan = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilPembandingan);

        // Kurang dari sama dengan (<=)
        System.out.println("==== Kurang dari sama dengan ====");
        a = 10;
        b = 10;

        hasilPembandingan = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilPembandingan);

        a = 11;
        b = 10;

        hasilPembandingan = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilPembandingan);

        // Lebih dari sama dengan (>=)
        System.out.println("==== Lebih dari sama dengan ====");
        a = 11;
        b = 11;

        hasilPembandingan = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilPembandingan);

        a = 11;
        b = 10;

        hasilPembandingan = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilPembandingan);

    }
}
