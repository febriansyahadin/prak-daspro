import java.util.Scanner;

public class PemilihanPercobaan111{
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = input11.nextInt();
       
        String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisBilangan);

    }
}