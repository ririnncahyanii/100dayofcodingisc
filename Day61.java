import java.util.Scanner;

public class Day61 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int N , hasil = 1;
       System.out.print("Masukkan angka N : ");
       N = input.nextInt();
       for(int i = 1 ; i <= N ; i++){
        hasil = hasil * i;
        
       }
       System.out.println("hasil perkalian : " + hasil);
      
         }
       }
     
    
