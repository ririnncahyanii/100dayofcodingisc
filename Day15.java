import java.util.Scanner;
public class day15 {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int jumlahKotak = input.nextInt();
    int apelPerKotak = input.nextInt();
    int jumlahTetangga = input.nextint();
    System.out.println("jumlah kotak apel:");
    System.out.println("jumlah apel disetiap kotak:");
    System.out.println("jumlah tetangga:");

    int totalApel = jumlahKotak * apelPerKotak;
    int apelPerTetanggga = totalApel / jumlahTetangga;

    System.out.println("\n---HASIL PERHITUNGAN ---")
      System.out.println("Total seluruh apel pak Budi:" + totalApel);
      System.out.println("setiap tetangga mendapatkan: " + apelperTetangga "buah");
  }
}
    
  
    
