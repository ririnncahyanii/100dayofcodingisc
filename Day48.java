
import java. util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("=== Kalkulator switc-case ===")
      System.out.print("masukkan angka 1 :");
      double angka1 = input.nextDouble();
      System.out.print("masukkan operator (+,-,*,/) :");
      char operator = input.next().charAt(0);
      System.out.print("masukkan angka 2 :");
      double angka2 = input.nextDouble();
      double hasil;
      switch (operator) {
        case '+':
            hasil = angka1 + angka2;
            System.out.println("hasil =" + hasil);
            break;
        case '-':
            hasil = angka1 - angka2;
            System.out.println("hasil =" + hasil);
            break;
            case '*':
                           hasil = angka1 * angka2;
                System.out.println("hasil =" + hasil);
                break;
                case '/':
                    if (angka2 != 0){
                    hasil = angka1 / angka2;
                    System.out.println("hasil =" + hasil);
                    }else {
                        System.out.println("tidak bisa dibagi nol!");
                    }break;
        default:
            System.out.println("operator tidak valid!");
            break;
      }
       
    }
}
