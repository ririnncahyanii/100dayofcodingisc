 import Java.util.Scanner;
  public class day11{
   public static void main(String[]args) {
    Scanner sc = new Scanner (System.in);

  System.out.print(s:"nama:");
    String nama = sc.nextLine();
  System.out.print(s:"umur:");
    int umur = sc.nextInt();
  System.out.print(s:"tinggiBadan:");
    double tinggi = sc.nextDouble();
  System.out.print(s:"beratBadan:");
    float berat = sc.nextFloat();
  System.out.print(s:"jenisKelamin:");
    char jenisKelamin = sc.nextChar().charAt(0);
  System.out.print(s:"statusMahasiswa:");
    boolean status = sc.nextBoolean();
  System.out.print(s:"nomorDana:");
    long nomor dana = sc.nextLong();
  System.out.print(s:"tahunMasuk:");
    short tahunMasuk = sc.nextShort();
 System.out.print(s:"jumlahSodara:");
    byte jumlahSodara = sc.nextByte();

    System.out.println(\n=== DATA YANG DIMASUKKAN ===");

    System.out.println("nama:" + nama);
    System.out.println("umur:" + umur);
    System.out.println("tinggiBadan:" + tinggi);
    System.out.println("beratBadan:" + berat);
    System.out.println("jenisKelamin:" + jenisKelamin);
    System.out.println("statusMahasiswa:" + status);
    System.out.println("nomorDana:" + nomor dana);
    System.out.println("tahunMasuk:" + tahunMasuk);
    System.out.println("jumlahSodara:" + jumlahSodara);
    
   input.close();
   
  }
 }
