import Java. util.Scanner;
public class biodata day12 {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);

  System.out.println("=== BIODATA ===");

  System.out.print("Nama:");
    String nama = input.nextLine();
  System.out.print("Umur:");
    byte umur = input.nextByte();
  System.out.print("Jumlah Saudara:");
    Short saudara = input.nextShort();
  System.out.print("Tahun Lahir:");
    int tahunLahir = input.nextInt();
  System.out.print("Nomor Mahasiswa:");
    long nim = input.nextLong();
  System.out.print("Berat Badan (kg) :");
    float berat = input.nextFloat();
  System.out.print("Tinggi Badan:");
    double tinggi = input.nextdouble();
  System.out.print("Jenis Kelamin (L/P) :");
    char jk = input.next().chartAt(0);
  System.out.print("Apakah Mahasiswa Aktif? (true/false):");
    boolean aktif = input.nextBoolean();

    System.out.println("\n=== HASIL BIODATA ANDA ===");

    System.out.println("Nama:" + nama);
    System.out.println("Umur:" + tahun);
    System.out.println("Saudara:" + saudara + "orang");
    System.out.println("Tahun Lahir:" + tahunLahir);
    System.out.println("NIM:" + nim);
    System.out.println("Berat:" + berat + "kg");
    System.out.println("Tinggi:" + tinggi +"cm");
    System.out.println("Jenis Kelamin:" + jk);
    System.out.println("Mahasiswa Aktif:" + aktif);

       input.close();
  }
}
    
    
    
    
    
    
    
