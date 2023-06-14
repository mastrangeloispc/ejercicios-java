// Ejercicio de división segura: Escribe un programa que solicite al usuario dos
// números enteros y realice la división del primer número entre el segundo
// número. Utiliza un bloque "try-catch" para manejar la excepción en caso de que
// se intente realizar una división por cero. En caso de que se produzca la
// excepción, muestra un mensaje adecuado en pantalla.

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        try {
            double resultado = dividir(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }
    }

    public static double dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario dos números
// enteros, que se almacenan en las variables numero1 y numero2.

// Luego, se utiliza un bloque try-catch para realizar la división del primer
// número entre el segundo número utilizando el método dividir(). Si se produce
// una excepción de tipo ArithmeticException (división por cero), se captura la
// excepción en el bloque catch y se muestra un mensaje adecuado en pantalla.

// El método dividir() realiza la división del dividendo entre el divisor y
// devuelve el resultado.

// Si no se produce ninguna excepción, se muestra en pantalla el resultado de la
// división.

Es importante
destacar que
al realizar
una división
entre números enteros,
el resultado
será un
número entero
o una
excepción de
división por
cero.Si deseas
obtener un
resultado con decimales,
puedes utilizar
tipos de
datos como
double para
los números
o modificar
el código
en consecuencia
.
