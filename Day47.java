
import java. util.Scanner;
public class Day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== NAMA-NAMA HARI ===");
        System.out.println("1. SENIN");
        System.out.println("2. SELASA");
        System.out.println("3. RABU");
        System.out.println("4. KAMIS");
        System.out.println("5. JUMAT");
        System.out.println("6. SABTU");
        System.out.println("7. MINGGU");

        System.out.print("Pilih nomor hari: ");
        int hari = input.nextInt();

        switch (hari) {
            case 1:
                System.out.println("SENIN");
                break;
            case 2:
                System.out.println("SELASA");
                break;
            case 3:
                System.out.println("RABU");
                break;
            case 4:
                System.out.println("KAMIS");
                break;
            case 5:
                System.out.println("JUMAT");
                break;
            case 6:
                System.out.println("SABTU");
                break;
            case 7:
                System.out.println("MINGGU");
                break;
            default:
                System.out.println("Nomor hari tidak valid");
        }
  
    }
}
