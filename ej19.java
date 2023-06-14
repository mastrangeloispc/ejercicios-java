// Ejercicio de redondeo de números: Escribir un programa que solicite al
// usuario un número decimal y muestre en pantalla su valor redondeado utilizando
// el método round() de la clase Math.

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double numero = sc.nextDouble();

        long valorRedondeado = Math.round(numero);

        System.out.println("El valor redondeado de " + numero + " es: " + valorRedondeado);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario un número
// decimal, que se almacena en la variable numero.

// Luego, se utiliza el método round() de la clase Math para obtener el valor
// redondeado del número ingresado. El resultado se almacena en la variable
// valorRedondeado.

// El método round() de la clase Math redondea el número al entero más cercano.
// Si el número decimal es exactamente equidistante entre dos enteros, se
// redondea hacia el entero par más cercano.

// Finalmente, se muestra en pantalla el valor redondeado del número utilizando
// System.out.println().