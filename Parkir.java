import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Jenis, Durasi, Total = 0, TotalHarian = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=keluar): ");
            Jenis = sc.nextInt();

            if (Jenis > 2 || Jenis < 0) {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
                System.out.println();
                continue;
            }

            if (Jenis == 0) {
                System.out.println("Total biaya parkir hari ini: Rp " + TotalHarian);
                break;
            }

            System.out.print("Masukkan durasi parkir per jam: ");
            Durasi = sc.nextInt();

            if (Durasi > 5) {
                Total = 12500;
                TotalHarian += Total;
            }
            else if (Jenis == 1) {
                Total = Durasi * 3000;
                TotalHarian += Total;
            } else  {
                Total = Durasi * 2000;
                TotalHarian += Total;
            }

            System.out.println("Total biaya parkir: Rp " + Total);
            System.out.println();
        }
        
        sc.close();
    }
}