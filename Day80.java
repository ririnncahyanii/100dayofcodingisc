import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka indeks " + i + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nIsi Array:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Indeks " + i + " = " + angka[i]);
        }

        
    }
}
