
import java.util.Scanner;

public class Day68 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
    
     System.out.print("Masukkan ukuran segitiga :");
     int N = input.nextInt();
     if(N < 1){
      System.out.println("Ukuran tidak valid :");return ;

     }

     for(int i = 1; i <= N; i++){
      for(int j = 1; j <= i; j++) {

        if(j == 1 || j == i || i == N ){
          System.out.print("* ");
      
      }else{
        System.out.print("  ");
      }
     }
     System.out.println();
     }
    }
       }
      
     
    
