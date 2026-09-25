import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("\n=== PROGRAM MENGHITUNG LUAS TAMAN ===");

       System.out.print("masukkan panjang taman(meter)\t:");
       double panjangtaman = input.nextDouble();
       System.out.print(" masukkan lebar taman(meter)\t:");
       float lebartaman = input.nextFloat();

       double luastaman = panjangtaman*lebartaman;

       System.out.println("\n------------------------------");
       System.out.println();
       System.out.println("hasil perhitungan:");
       System.out.println("panjang taman\t:" + panjangtaman + " m");
       System.out.println("lebar taman\t:" + lebartaman + " m");
       System.out.println("luas taman\t: " + luastaman + " m2");
       System.out.println("\n=============================");

    }
}
