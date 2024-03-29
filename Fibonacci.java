import java.util.Scanner;
 public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la posición de un número en la serie de Fibonacci: ");
    int n = sc.nextInt();
    int a = 0, b = 1, c;
    if (n == 0) {
      System.out.println("Posición 0: 0");
    } else if (n == 1) {
      System.out.println("Posición 1: 1");
    } else {
      for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
      }
      System.out.println("Posición " + n + ": " + b);
    }
  }
}