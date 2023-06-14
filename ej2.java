// Ejercicio de números positivos y negativos: Escribir un programa que solicite
// al usuario un número y determine si es positivo, negativo o cero. Mostrar el
// resultado en pantalla.

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario un número, que
// se almacena en la variable numero.

// Luego, se utiliza una serie de estructuras if-else para determinar si el
// número es positivo, negativo o cero. Si el número es mayor que cero, se
// asigna el valor "Positivo" a la variable resultado. Si el número es menor que
// cero, se asigna el valor "Negativo". Si ninguna de las condiciones anteriores
// se cumple, se asume que el número es cero.

// Finalmente, se muestra en pantalla el resultado utilizando
// System.out.println().

// Es importante tener en cuenta que en este ejemplo se asume que el número
// ingresado por el usuario es de tipo double. Si deseas utilizar un tipo
// diferente, puedes ajustar el código en consecuencia.