import java.util.Scanner;
public class pert1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan Nama\t:");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM\t  :");
        String nim = input.nextLine();
        System.out.print("Masukkan Kelas\t :");
        char kelas = input.next().charAt(0);
        System.out.print("Masukkan Umur\t:");
        int umur = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Prodi\t : ");
        String prodi = input.nextLine();
        System.out.print("Masukkan IPK \t\t :");
        double ipk = input.nextDouble();
        System.out.print("Status Aktif\t  :");
        boolean Aktif = input.nextBoolean();

        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.println("Nama\t\t  :" + nama);
        System.out.println("NIM\t\t :" + nim);
        System.out.println("Kelas\t\t   :" + kelas);
        System.out.println("Umur\t\t  :" + umur + " Tahun");
        System.out.println("Prodi\t\t   :" + prodi);
        System.out.printf("IPK\t\t : %.2f%n" , ipk);
        System.out.println("Status Aktif\t  :" + Aktif);

    }
}
    

