import java. util.Scanner;
public class Day42 {

    public static void main (String[]args){
Scanner input = new Scanner ( System.in);
      

        double gajiPokok, potongan, gajiBersih;

        System.out.print("Masukkan gaji pokok: Rp ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan potongan: Rp ");
        potongan = input.nextDouble();

        if (potongan <= gajiPokok) {
            gajiBersih = gajiPokok - potongan;
            System.out.println("Gaji bersih: Rp " + gajiBersih);
        } else {
            System.out.println("Potongan tidak boleh lebih besar dari gaji pokok!");
        }

        input.close();
    

      
      
    }
}
