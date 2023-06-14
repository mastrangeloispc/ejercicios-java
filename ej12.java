// Ejercicio de conversión de cadena a entero: Escribe un programa que solicite
// al usuario una cadena de caracteres que represente un número entero. Utiliza el
// método Integer.parseInt() para convertir la cadena a un número entero. Utiliza un
// bloque "try-catch" para manejar la excepción en caso de que la cadena
// ingresada no pueda ser convertida a un número entero. En caso de que se
// produzca la excepción, muestra un mensaje adecuado en pantalla.

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres que represente un número entero: ");
        String cadena = sc.nextLine();

        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("El número entero ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no puede ser convertida a un número entero");
        }
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario una cadena de
// caracteres, que se almacena en la variable cadena.

// Luego, se utiliza un bloque try-catch para intentar convertir la cadena a un
// número entero utilizando el método Integer.parseInt(). Si se produce una
// excepción de tipo NumberFormatException (la cadena no puede ser convertida a
// un número entero), se captura la excepción en el bloque catch y se muestra un
// mensaje adecuado en pantalla.

// Si no se produce ninguna excepción, se muestra en pantalla el número entero
// resultante de la conversión.

// Es importante mencionar que el método Integer.parseInt() lanzará una
// excepción si la cadena no representa un número entero válido. Si deseas
// utilizar un tipo de dato diferente al int, puedes ajustar el código en
// consecuencia.