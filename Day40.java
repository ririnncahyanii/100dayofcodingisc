import java. util.Scanner;
public class Day40 {

    public static void main (String[]args){
Scanner input = new Scanner ( System.in);
      int kehadiran = input.nextInt();
      int nilai = input.nextInt();
      if (kehadiran == 1){
        if ( nilai >= 70){
         System.out.println("lulus");
        }else if (nilai < 70){
         System.out.println("remedial");
        }
        

      }else {
        System.out.println("gagal");
      }
      
    }
}
