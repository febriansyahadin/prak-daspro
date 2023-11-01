package jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[][] {
            {"***", "***"},
            {"***", "***"},
            {"***", "***"},
            {"***", "***"}
        };
        
        int menu;
        boolean exit = true;

        while (exit) {
            System.out.println("Menu");
            System.out.println("1. input data penonoton");
            System.out.println("2. Tampilan daftar penonoton");
            System.out.println("3. exit");

            System.out.print("pilih menu (1/2/3) : ");
            menu = sc.nextInt();


            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    nama = sc.next();
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    
                    if (baris >= 1 && baris <penonton.length && kolom <= penonton[0].length) {
                        if (penonton[baris -1] [kolom-1] != "***") {
                            System.out.println("Kursi sudah ada yang menempati");
                        } else {
                            penonton[baris-1] [kolom-1] = nama;
                            System.out.println("Kursi tersedia");
                        }

                        
                    } else {
                        System.out.println("Kursi tidak tersedia");
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.next();
                    break;

                case 2:
                    System.out.println("Daftar penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("penonton ke-" + (i+1) + " : " + String.join (",", penonton[i]));
                    }
                    break;

                case 3:
                System.out.println("Program telah keluar");
                    exit = false;
                    
                default:
                    break;
            }

            
        }
    }
}