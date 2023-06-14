// Ejercicio de cálculo de potencia: Escribir un programa que solicite al usuario
// dos números enteros, representando la base y el exponente, y calcular el
// resultado de elevar la base al exponente utilizando el método pow() de la clase
// Math. Mostrar el resultado en pantalla.

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese el exponente: ");
        double exponente = sc.nextDouble();

        double resultado = Math.pow(base, exponente);

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario dos números
// enteros, la base y el exponente. Estos valores se almacenan en las variables
// base y exponente, respectivamente.

// Luego, se utiliza el método pow() de la clase Math para calcular la potencia
// de la base elevada al exponente. El resultado se almacena en la variable
// resultado.

// Finalmente, se muestra en pantalla el resultado de la potencia utilizando
// System.out.println().