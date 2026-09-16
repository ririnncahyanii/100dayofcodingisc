import java.util.Scanner;
public class Day15 {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    
import java.util.Scanner;
public class Day15 {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int jumlahKotak = input.nextInt();
    int apelPerKotak = input.nextInt();
    int jumlahTetangga = input.nextInt();
    System.out.println("jumlah kotak apel:" + jumlahKotak);                 
    System.out.println("jumlah apel disetiap kotak:" + apelPerKotak);
    System.out.println("jumlah tetangga:" + jumlahTetangga);

    int totalApel = jumlahKotak * apelPerKotak;
    int apelPerTetangga = totalApel / jumlahTetangga;

    System.out.println("\n---HASIL PERHITUNGAN ---");
      System.out.println("Total seluruh apel pak Budi:" + totalApel);
      System.out.println("setiap tetangga mendapatkan: " + apelperTetangga + "buah");
  }
}
  
    
