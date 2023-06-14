// Ejercicio de longitud de cadena: Escribir un programa que solicite al usuario
// una cadena de texto y muestre en pantalla la longitud de la cadena utilizando el
// método length() de la clase String.

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = sc.nextLine();

        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es: " + longitud);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario una cadena de
// texto, que se almacena en la variable cadena.

// Luego, se utiliza el método length() de la clase String para obtener la
// longitud de la cadena. El resultado se almacena en la variable longitud.

// Finalmente, se muestra en pantalla la longitud de la cadena utilizando
// System.out.println().

// Es importante tener en cuenta que el método length() devuelve el número de
// caracteres en la cadena, incluyendo espacios en blanco y otros caracteres
// especiales.