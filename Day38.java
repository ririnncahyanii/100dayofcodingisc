 import java . util.Scanner;
 public class Day38 {

     public static void main(String[]args) {
         Scanner input = new Scanner (System.in);
        System.out.println("\n=== MENU MAKANAN ===");
        System.out.println("1.Nasi Goreng");
        System.out.println("2.Mie Goreng");
        System.out.println("3.Bakso");
        System.out.println("Pilih Menu (1-3):");

        int pilihan = input.nextInt();
        if (pilihan == 1){
            System.out.println("Anda Memilih Nasi Goreng");
        }
        if (pilihan == 2){
            System.out.println("Anda Memilih Mie Goreng");
        }
        if (pilihan == 3){
            System.out.println("Anda Memilih Bakso");
        }
        if (pilihan < 1 || pilihan > 3){
            System.out.println("Pilihan Tidak Tersedia");
        }
       
     }    
     }
