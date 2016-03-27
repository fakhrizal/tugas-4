package praktikum4;

import java.util.Scanner;

public class MainBuku {

    public MainBuku() {
    }

    public static void main(String[] args) {
        int i = 0;
        String cek;
        Scanner scan = new Scanner(System.in);
        do {
            BukuAlamat[] book = new BukuAlamat[3];
            ArrayBuku(book);
            System.out.println("===Selamat Datang===");
            System.out.println("Data yang tersedia");
            for (int a = 0; a < book.length; a++) {
                System.out.println((a + 1) + "." + book[a].getNama());
            }
            System.out.println("====================");
            cetak(book);
            System.out.print("lihat data lain (y/n) :");
            cek = scan.next();
        } while (cek.equalsIgnoreCase("y"));
    }

    public static void ArrayBuku(BukuAlamat[] book) {
        book[0] = new BukuAlamat();
        book[0].setNama("Fakhrizal Arif P");
        book[0].setAlamat("Jln.Ikan Tombro Selatan II");
        book[0].setTlp("085576857695");
        book[0].setEmail("fakhrizal.arif@yahoo.com");

        book[1] = new BukuAlamat();
        book[1].setNama("Arif Rahmadani Vinanda");
        book[1].setAlamat("Jln.Ronggowuni Tumpang");
        book[1].setTlp("086969696969");
        book[1].setEmail("arifrahmadanivivanda@gmail.com");

        book[2] = new BukuAlamat();
        book[2].setNama("Tyo Rizky Bachtiar");
        book[2].setAlamat("Gajayana Gg 1 ");
        book[2].setTlp("082323232323");
        book[2].setEmail("itachi.amatheratsu@gmail.com");
    }

    static void cetak(BukuAlamat[] book) {
        System.out.print("pilih data :");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("Nama\t:" + book[i - 1].getNama());
        System.out.println("Alamat\t:" + book[i - 1].getAlamat());
        System.out.println("Telp\t:" + book[i - 1].getTlp());
        System.out.println("Email\t:" + book[i - 1].getEmail());
    }

}
