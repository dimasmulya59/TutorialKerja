package rizky;

public class LatihanLoopingFOR {
    public static void main(String[] args) {
        // Temukan jumlah semua kelipatan 3 atau 5 di bawah 1000
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
