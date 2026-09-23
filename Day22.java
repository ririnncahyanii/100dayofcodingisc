public class belajarjava {
    public static void main(String[] args) {
      int a = 10;
      int b = 20;
      int sementara;

      System.out.println("sebelum ditukar:");
      System.out.println("a =" + a);
      System.out.println("b = " + b);
      //menukar nilai
      sementara = a;
      a = b;
      b = sementara;
      System.out.println("\n===setelah ditukar===");
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      


    }
}
