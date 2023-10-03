import java.util.Scanner;

public class Pemilihan2Percobaan111{
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan tahun:");
        tahun = input11.nextInt();
    if ((tahun % 4) == 0 ) {
        if (tahun == 2100) {
             System.out.println("Bukan Tahun kabisat");
        } else
        System.out.println("Tahun Kabisat");
    } else
     System.out.println("Bukan Tahun kabisat");
        
    } 

    } 