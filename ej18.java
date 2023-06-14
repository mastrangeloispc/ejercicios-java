// Ejercicio de cálculo del valor absoluto: Escribir un programa que solicite al
// usuario un número entero y muestre en pantalla su valor absoluto utilizando el
// método abs() de la clase Math.

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int valorAbsoluto = Math.abs(numero);

        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario un número
// entero, que se almacena en la variable numero.

// Luego, se utiliza el método abs() de la clase Math para obtener el valor
// absoluto del número ingresado. El resultado se almacena en la variable
// valorAbsoluto.

// Finalmente, se muestra en pantalla el valor absoluto del número utilizando
// System.out.println().

// El método abs() de la clase Math devuelve el valor absoluto de un número, es
// decir, su valor sin signo. Si el número es positivo, el valor absoluto es el
// mismo número. Si el número es negativo, el valor absoluto es el número
// multiplicado por -1.