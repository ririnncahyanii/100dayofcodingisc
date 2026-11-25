import java.util.Scanner;

public class Day85 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      int[] angka = new int[5];

      System.out.println("Masukkan lima angka :");

      for(int i = 0; i < angka.length; i++){
        
      System.out.print("angka ke-" + (i + 1) + ": ");
      angka[i] = input.nextInt();
      }
      int minimal = angka[0];

      for(int i = 1; i < angka.length; i++){
         if (angka[i] < minimal){
            minimal = angka[i];
         }
      }

      System.out.println("Angka minimal adalah: " + minimal);
     }

}
