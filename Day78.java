import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userBenar, passBenar;
        String username, password;

        System.out.println("=== BUAT AKUN ===");

        System.out.print("Buat Username: ");
        userBenar = input.nextLine();

        System.out.print("Buat Password: ");
        passBenar = input.nextLine();

        System.out.println("\n=== LOGIN AKUN ===");

        while (true) {
            System.out.print("Masukkan Username: ");
            username = input.nextLine();

            System.out.print("Masukkan Password: ");
            password = input.nextLine();

            if (username.equals(userBenar) &&
                password.equals(passBenar)) {

                System.out.println("Login Berhasil!");
                break;

            } else {
                System.out.println("Username atau Password Salah!");
                System.out.println("Silakan Coba Lagi.\n");
            }
        }

        
    }
}
