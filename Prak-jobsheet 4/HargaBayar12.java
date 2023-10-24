import java.util.Scanner;

public class HargaBayar12 {
    public static void main(String[]args) {
            Scanner input =new Scanner(System.in);
            int harga, jumlah, halamanBuku;
            String namaBuku;
            double dis, total, bayar, jmlDis;
            System.out.println("Masukkan nama buku yang dibeli ");
            namaBuku = input.nextLine();
            System.out.println("Masukkan halaman buku yang dibeli ");
            halamanBuku = input.nextInt();
            System.out.println("Masukkan diskon yang anda dapatkan ");
            dis = input.nextDouble();
            System.out.println("Masukkan harga barang yang dibeli ");
            harga=input.nextInt();
            System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
            jumlah=input.nextInt();
            total=harga*jumlah;
            jmlDis=total*dis;
            bayar=total-jmlDis;
            System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
            System.out.println("Jumlah yang harus dibayar adalah" +bayar);
    }
}