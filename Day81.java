import java.util.Scanner;

public class Day81 {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

System.out.print("Masukkan jumlah angka :");
int n = input.nextInt();

int[] angka = new int[n];

// mengisi elemen array
for(int i = 0; i < n; i++){
    System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
    angka[i] = input.nextInt();

}

// Menampilkan semua elemen array

System.out.println("\nisi array:");

for(int i = 0; i < n; i++){
    System.out.println("angka ke-" + (i + 1) + ": " + angka[i]);
}
}
}
    
