import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.println("\n=== HASIL METHOD STRING ===");

        // 1. Menghitung jumlah karakter
        System.out.println("Panjang nama: " + nama.length());

        // 2. Mengubah menjadi huruf kapital
        System.out.println("Huruf besar: " + nama.toUpperCase());

        // 3. Mengubah menjadi huruf kecil
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        // 4. Membandingkan String
        System.out.println("Apakah nama Ririn? " + nama.equals("Ririn"));

        // 5. Memeriksa isi String
        System.out.println("Mengandung kata Rin? " + nama.contains("Rin"));

        // 6. Mengambil sebagian String
        if (nama.length() >= 3) {
            System.out.println("Tiga huruf pertama: " + nama.substring(0, 3));
        }

        // 7. Mengganti karakter
        System.out.println("Mengganti a menjadi o: " + nama.replace('a', 'o'));

        // 8. Menghapus spasi awal dan akhir
        System.out.println("Tanpa spasi luar: " + nama.trim());

      
    }
}
