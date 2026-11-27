import java.util.Scanner;

public class Day87 {
     public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
     
     int[] angka = new int[5];

     // mengisi array
     for(int i = 0; i < 5; i++){
      System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
        angka[i] = input.nextInt();
     }

     // menampilkan array awal
     System.out.println("\nData awal: ");
      for(int i = 0; i < 5; i++ ){
         System.out.print(angka[i] + " ");

      }

      // mengubah data array
      System.out.print("\nMasukkan indeks yang ingin diubah (0-4): ");
      int indeks = input.nextInt();

      System.out.print("Masukkan angka baru: ");
      int baru = input.nextInt();

      angka[indeks] = baru;

      // menampilkkan hasil perubahan
      System.out.println("\ndata setelah di ubah:");
      for(int i = 0; i < 5; i++){
         System.out.print(angka[i] + " ");
      }
      }
     }
