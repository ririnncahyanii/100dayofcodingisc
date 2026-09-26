import java.util.Locale;
import java.util.Scanner;
public class Day25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("\n=== PROGRAM MENGHITUNG LUAS KOLAM ===");
       System.out.println();
       System.out.print("Masukkan diameter kolam (meter)\t:");
       double diameter = input.nextDouble();

       //menghitung jari-jari
       double jarijari = diameter/2;
       //menghitung luas liangkaran
       double PI = 3.14;
       double luas = PI * jarijari * jarijari;

       System.out.println();
       System.out.println("----------------------------");
       System.out.println("\n+++ Hasil perhitungan +++");
       System.out.println();
       System.out.printf(Locale.US,"Diameter\t : %.1f m%n",diameter);
       System.out.printf(Locale.US,"Jari-jari\t : %.1f m%n",jarijari );
       System.out.printf(Locale.US,"Luas \t\t : %.2f m2%n",luas);
       System.out.println();
       System.out.println("============================");
       
       input.close();

       

    }
}
