import java.util.Scanner;

public class Day88 {

    static void tampilkanNama(String nama, int umur) {
        System.out.println("Nama saya: " + nama);
        System.out.println("Umur saya: " + umur + " tahun");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        tampilkanNama(nama, umur);

      
    }
}
