import java.util.Scanner;

    public class ArrayRataNilai11{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan jumlah mahasiswa = ");
            int jumlahMhs = sc.nextInt();

            int[] nilaiMhs= new int[jumlahMhs];
            double totalLulus = 0;
            double totalTidaklulus = 0;
            double rataLulus;
            double rataTidaklulus;
            int lulus = 0;
            int tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus +=nilaiMhs[i];
                lulus++;
            }else {
                totalTidaklulus += nilaiMhs[i];
                tidakLulus++;
            }
        
        }
        
            rataLulus = (lulus > 0) ? totalLulus / lulus : 0;
            rataTidaklulus = (tidakLulus > 0) ? totalTidaklulus / tidakLulus :0;

            System.out.println("Rata-rata nilai lulus = "+rataLulus);
            System.out.println("Jumlah mahasiswa yang lulus  = "+rataTidaklulus);
            
        }
    }