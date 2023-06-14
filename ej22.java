// Ejercicio de cálculo de raíz cuadrada: Escribir un programa que solicite al
// usuario un número positivo y calcule su raíz cuadrada utilizando el método sqrt()
// de la clase Math. Si el número ingresado es negativo, mostrar un mensaje
// adecuado en pantalla.

import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        double numero = sc.nextDouble();

        if (numero >= 0) {
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        } else {
            System.out.println("El número ingresado es negativo. No se puede calcular la raíz cuadrada.");
        }
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario un número, que
// se almacena en la variable numero.

// Luego, se verifica si el número ingresado es mayor o igual a cero. Si es así,
// se calcula la raíz cuadrada del número utilizando el método sqrt() de la
// clase Math, y se muestra en pantalla el resultado.

// Si el número ingresado es negativo, se muestra un mensaje indicando que no se
// puede calcular la raíz cuadrada de un número negativo.
