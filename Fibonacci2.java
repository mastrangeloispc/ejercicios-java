import java.util.Scanner;
 public class Fibonacci2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la posición de un número en la serie de Fibonacci: ");
        int n = sc.nextInt();
        int resultado = fibonacciIterativo(n);
        System.out.println("Posición " + n + ": " + resultado);
        resultado = fibonacciRecursivo(n);
        System.out.println("Posición " + n + " (Recursivo): " + resultado);
    }
     public static int fibonacciIterativo(int n) {
        int a = 0, b = 1, c;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
     public static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}