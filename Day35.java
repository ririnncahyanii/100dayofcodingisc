 import java . util.Scanner;
 public class Day35 {

     public static void main(String[]args) {
         Scanner input = new Scanner (System.in);
         int nilai = input.nextInt();
         int kehadiran = input.nextInt();
         if (nilai >= 75){
            if (kehadiran >= 75){
                System.out.println("boleh mengikuti ujian");
            
         }else {
            System.out.println("Tidak boleh,kehadiran kurang");
         }
         } else {
            System.out.println("Tidak boleh,nilai kurang");
         }
         
       
     }    
     }
