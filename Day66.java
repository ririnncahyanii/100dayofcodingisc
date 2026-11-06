
import java.util.Scanner;

public class Day66 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
     
     System.out.print("Masukkan jumlah baris : ");
    int b = input.nextInt();
    System.out.print("Masukkan jumlah kolom : ");
    int k = input.nextInt();
     for(int i = 1; i <= b; i++ ){
      for(int j = 1; j <= k; j++){
      
        if((i + j) % 2 == 0){
          System.out.print("# ");
        }else{
            System.out.print("o "); 
        }
      }
        System.out.println();
      
     }
   

     }
       }
      
     
    
     
    
