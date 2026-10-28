import java.util.Scanner;

public class Day57 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
       System.out.print("Masikkan nilai N : ");
       int N = input.nextInt();
       System.out.println("Angka ganjil 1 sampai " + N + " :");
       for(int i = 1; i <= N ; i++){
        if(i % 2 != 0){
          System.out.println(i+" ");
        }
       }
       System.out.println("Angka genap 1 sampai " + N + " :");
       for(int i = 1; i <= N ; i++){
        if(i % 2 == 0 ){
          System.out.print(i+" ");
        }
       }

         }
       }
     
    
