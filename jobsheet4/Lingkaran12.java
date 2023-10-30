import java.util.Scanner;

public class Lingkaran12 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double phi=3.14;
        int r;
        double keliling, luas;
        System.out.println("Masukkan jari jari lingkaran: ");
        r=input.nextInt();
        keliling= 2*phi*r;
        luas=phi*r*r;
        System.out.println(keliling);
        System.out.println(luas); 
        

    }
}