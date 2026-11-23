import java.util.Scanner;

public class Day83{
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);


   int jumlah, total =  0;
   System.out.print("Masukkan angka elemen: ");
   jumlah = input.nextInt();
   int[] angka = new int[jumlah];
   for(int i = 0 ; i < jumlah; i++){
    System.out.print("Masukkan angka ke-" + (i  + 1) + ": ");
    angka[i] = input.nextInt();
   }

   for(int i = 0; i < jumlah; i++){
    total += angka[i];
   }
   
   System.out.println("Jumlah seluruh elemen: " + total);
     }

        }
