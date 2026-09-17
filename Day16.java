import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah kelereng:");
        int kelereng = input.nextInt();

        int sisa = kelereng %3;

        System.out.println("Sisa kelereng :" + sisa);

    }
}
