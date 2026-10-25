
 import java. util.Scanner;
 public class soal (2) {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double N = input.nextDouble();
     if (N % 1 != 0){
        System.out.println("Pecahan");
     }else if (N % 2 == 0){
        System.out.println("Bulat Genap");
     }else {
        System.out.println("Bulat ganjil");
     }
     if (N > 0){
        System.out.println("Positif");
     }else if (N < 0){
        System.out.println("Negatif");
     }else{
        System.out.println("Netral");
     }
     if(N >= 0 && N % 1 == 0){
        System.out.println("Natural/cacah");
     }
     }
    }
