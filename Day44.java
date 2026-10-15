import java. util.Scanner;
public class Day44 {
    public static void main (String[]args){
Scanner input = new Scanner ( System.in);
    System.out.println(" MASUKKAN NILAI:");  
int nilai = input.nextInt();
if (nilai >= 90 && nilai <= 100){
    System.out.println("Predikat : (A)");
} else if ( nilai >= 80){
    System.out.println("Predikat : (B)");
}else if (nilai >= 70){
    System.out.println("Predikat : (C)");
}else if (nilai >= 60){
    System.out.println("Predikat : (D)");
}else if (nilai >= 0){
    System.out.println("Predikat : (E)");
}else {
    System.out.println("Nilai Tidak Valid");
}
            
    }
}
