import java.util.Scanner;

public class Day58 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
       System.out.print("Masikkan nilai N : ");
       int N = input.nextInt();
       System.out.println("Bilangan ganjil dari N - 1 : ");
        for(int i = N ; i >= 1 - 1;i--){
          if(i % 2 != 0){
        System.out.println(i + " ");
          }
        }
        System.out.println("Bilangan gelap dari N - 1 : ");
        for(int i = N;i>=1;i--){
          if(i %2 == 0){
            System.out.print(i+" ");
          }
        }

         }
       }
     
    
