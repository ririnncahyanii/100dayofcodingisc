
import java. util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai :");
        int nilai = input.nextInt();
        String hasil = (nilai >= 65)?
        "lulus" : "tidak lulus" ;
        System.out.println(hasil);
    }
}
