// Ejercicio de búsqueda de caracteres: Escribir un programa que solicite al
// usuario una palabra y un carácter, y determine si el carácter ingresado se
// encuentra en la palabra utilizando el método indexOf() de la clase String. Mostrar
// un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en
// la palabra.

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Ingrese un carácter: ");
        char caracter = sc.next().charAt(0);

        int indice = palabra.indexOf(caracter);

        if (indice != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la palabra.");
        } else {
            System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
        }
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario una palabra,
// que se almacena en la variable palabra.

// Luego, se solicita al usuario un carácter utilizando char caracter =
// sc.next().charAt(0);. El método next() de Scanner se utiliza para leer una
// cadena, y charAt(0) se utiliza para obtener el primer carácter de esa cadena.

// Se utiliza el método indexOf() de la clase String para obtener el índice del
// carácter en la palabra. Si el carácter se encuentra en la palabra, el método
// indexOf() devuelve el índice correspondiente. Si no se encuentra, devuelve
// -1.

// Finalmente, se muestra en pantalla un mensaje adecuado indicando si el
// carácter se encuentra o no en la palabra.