 import java . util.Scanner;
 public class day1 {

     public static void main(String[]args) {
         Scanner input = new Scanner (System.in);
        double a, b ;
        char operator;
        System.out.println("Masukkan angka pertama:");
        a = input.nextDouble();
        System.out.println("Masukkan operator (+,-,*,/):");
        operator = input.next().charAt(0);
        System.out.println("Masukkan angka kedua:");
        b = input.nextDouble();
        if (operator == '+'){
            System.out.println("hasil =" + (a + b));
        } else if ( operator == '-'){
            System.out.println("hasil"+ (a - b));
        
        }else if (operator == '*'){
            System.out.println("hasil" + (a * b));

        }else if (operator == '/'){
            if ( b != 0) {
                System.out.println("hasil" + (a / b));
             } else{
                System.out.println("tidak bisa dibagi nol!");
                 }
             } else {
                System.out.println("operator tidak valid");             
             } 
     }    
     }
