// Ejercicio de divisibilidad: Escribir un programa que solicite al usuario un
// número y determine si es divisible por 5 y por 3, por ninguno de los dos o por
// ambos. Mostrar el resultado en pantalla.

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        boolean divisiblePorCinco = numero % 5 == 0;
        boolean divisiblePorTres = numero % 3 == 0;

        if (divisiblePorCinco && divisiblePorTres) {
            System.out.println("El número es divisible por 5 y por 3.");
        } else if (divisiblePorCinco) {
            System.out.println("El número es divisible por 5 pero no por 3.");
        } else if (divisiblePorTres) {
            System.out.println("El número es divisible por 3 pero no por 5.");
        } else {
            System.out.println("El número no es divisible ni por 5 ni por 3.");
        }
    }
}

// Este programa solicita al usuario un número, luego verifica si es divisible
// por 5 y por 3 utilizando el operador de módulo (%). Luego, utiliza una
// estructura de control if-else para determinar si el número es divisible por
// ambos, por uno solo o por ninguno de los dos. Finalmente, muestra el
// resultado en pantalla.