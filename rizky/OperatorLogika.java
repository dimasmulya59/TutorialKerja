package rizky;

public class OperatorLogika {
    public static void main(String[] args) {
        // Operator logika ---> operasi yang bisa kita lakukan kepada tipe data boolean
        // (nilai boolean true dan false)
        // apa aja tipe data boolean = AND, OR, XOR, negasi
        // OR untuk penjumlahan, AND untuk perkalian, XOR (exclusive OR = jika hasil
        // nilai yang sama akan false jika sebaliknya akan true)

        boolean a, b, c;

        // OR (||)
        System.out.println("==== OR (||) ====");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        // AND (&&)
        System.out.println("==== AND (&&) ====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        // XOR (^)
        System.out.println("==== XOR (^) ====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // negasi (!)
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " ---> (!) = " + c);
        a = false;
        c = !a;
        System.out.println(a + " ---> (!) = " + c);
    }
}
