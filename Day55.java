import java.util.Scanner;

public class Day55 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
       System.out.print("Masikkan nilai N : ");
       int N = input.nextInt();
       System.out.println("contoh continue: ");
       for (int i = 1 ; i <= N ; i++){
        if(i == 3){
            continue;
        }
            System.out.print(i+" ");
        }

        System.out.println( "\ncontoh break: ");
        for(int i = 1; i <= N ; i++){
            if(i == 3){
                break;
            }
            System.out.println(i+" ");
        }

        System.out.println("\ncontoh return: ");
        System.out.println("Hasil penjumlahan : " + tambah(5 ,3));
        input.close();
        }
         static int tambah(int a , int b){
            return a + b;
         }
       }
     
    
