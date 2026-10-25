
 import java. util.Scanner;
 public class soal (1) {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int x = input.nextInt();
     int y = input.nextInt();
     int z = input.nextInt();
     if (y > x){
        x = x + 1;
     }else if (y < x){
       x = x - 1;
     }
     if (z > x){
       x = x + 2;
     }else if (z < x){
     x = x - 2;
     }
     System.out.println(x);

     }
    }
