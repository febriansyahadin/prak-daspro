import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Masukkan sudut pertama segitiga: ");
        float sudut1 = input11.nextFloat();
        System.out.print("Masukkan sudut kedua segitiga: ");
        float sudut2 = input11.nextFloat();
        System.out.print("Masukkan sudut ketiga segitiga: ");
        float sudut3 = input11.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;

    if (totalSudut == 180) {
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
        System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        }else if (sudut1 == sudut2 && sudut2 == sudut3)
        System.out.println("segitiga tersebut adalah segitiga sama sisi");
        else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3)
         System.out.println("segitiga tersebut adalah segitiga sama kaki");  
         else
        System.out.println("segitiga tersebut adalah segitiga sembarang");
         } else 
         System.out.println("Bukan segitiga");
   
    
    
    }
}