import java. util.Scanner;
public class Day41 {

    public static void main (String[]args){
Scanner input = new Scanner ( System.in);
      System.out.println("=== MASUKKAN  TEMPERATURE RUANGAN (°C): ===");
      double suhu = input.nextDouble();
      if ( suhu < 20){
        System.out.println("temperature ruangan dingin");

      }else if (suhu <= 30){
        System.out.println("temperature ruangan normal");
      }else {
        System.out.println("temperature ruangan panas");
      }
      
      
    }
}
