package rizky;

public class Array {
    public static void main(String[] args) {
        int[] angka = { 10, 20, 30, 40, 50 };
        String[] nama = { "Andi", "Budi", "Cindy" };

        System.out.println(angka[0]);
        System.out.println(nama[2]);

        angka[2] = 35;
        System.out.println(angka[2]);

        System.out.println(angka.length);
        System.out.println(nama.length);
    }

}
