import java. util.Scanner;
public class Day46 {
    public static void main (String[]args){
Scanner input = new Scanner ( System.in);
   System.out.println("=== MENU MAKANNAN ===");
   System.out.println("1.Nasi goreng");
   System.out.println("2.Bakso");
   System.out.println("3.Mie goreng");
   System.out.println("pilih menu (1-3)");
   int pilihan = input.nextInt();
   switch (pilihan) {
    case 1:
      System.out.println("anda memilih Nasi goreng");
        break;
     case 2:
        System.out.println("anda memilih Bakso");
        break;
        case 3:
            System.out.println("anda memilih Mie goreng");
            break;
    default:
        System.out.println("pilihan tidak tersedia");
        break;
   }
    }
}
