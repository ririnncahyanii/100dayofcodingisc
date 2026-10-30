import java.util.Scanner;

public class Day59 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
       System.out.print("Masikkan nilai N : ");
       int N = input.nextInt();
      System.out.print("Masukkan nilai M : ");
      int M = input.nextInt();
      for(int i = 1; i <= N ; i++){
        if(i % M == 0){
          System.out.println(i);
        }
      }
         }
       }
     
    
