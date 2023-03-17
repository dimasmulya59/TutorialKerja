package rizky;

public class NestedIF {
    public static void main(String[] args) {

        int a = 6;
        int b = 8;

        System.out.println("ini adalah awal dari program");

        if (a == 6) {
            if (b == 9) {
                System.out.println("ini adalah dimana a = 6 dan b = 8");
            } else {
                System.out.println("ini adalah dimana a = 6 dan b bukan 8");
            }
        } else {
            System.out.println("ini adalah a dan b salah");
        }
        System.out.println("ini adalah akhir dari program");
    }
}