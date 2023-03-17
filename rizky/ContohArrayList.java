package rizky;

import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<String>();

        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Cindy");

        System.out.println("Daftar Nama" + daftarNama);

        String namaKetiga = daftarNama.get(2);
        System.out.println("Nama Ketiga:" + namaKetiga);

        daftarNama.remove(0);
        System.out.println("Daftar nama setelah penghapusan" + daftarNama);

        int jumlahNama = daftarNama.size();
        System.out.println("Jumlah nama dalam daftar:" + jumlahNama);
    }

}
