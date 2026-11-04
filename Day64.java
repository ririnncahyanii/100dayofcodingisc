import java.util.Scanner;

public class Day64 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
     int N;
     System.out.print("Masukkan angka : ");
     N = input.nextInt();
     for(int i = 1;i <= N; i++){
      int faktorial = 1;
      for(int j = 1; j <= i; j++){
        faktorial = faktorial* j;
         }
         System.out.println(i + " != " + faktorial);
     }

     }
       }
     
    
