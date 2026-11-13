
import java.util.Scanner;

public class Main Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Penjumlahan");
                    break;

                case 2:
                    System.out.println("Anda memilih Pengurangan");
                    break;

                case 3:
                    System.out.println("Anda memilih Perkalian");
                    break;

                case 4:
                    System.out.println("Anda memilih Pembagian");
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

            System.out.println();

        } while (pilihan != 5);

    }
}
