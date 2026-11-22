import java.util.Scanner; 

public class pert2 {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
// segitiga pertama
int n = input.nextInt();
for(int i = 1; i <= n; i++){
    for(int j = 1; j <= i ; j++){
        System.out.print(j);
    }
    System.out.println();
}
System.out.println();

// segitiga kedua

for(int i = 1; i <= n; i++){
    for(int j = 1; j <= n - i; j++){
        System.out.print(" ");
    }
    for(int j = n - i + 1; j <= n; j++){
        System.out.print(j);
    }
    System.out.println();
}
}
}
