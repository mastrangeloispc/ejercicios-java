// Ejercicio de extracción de subcadena: Escribir un programa que solicite al
// usuario una frase y dos números enteros, representando un índice inicial y un
// índice final. Utilizar el método substring() de la clase String para extraer la
// subcadena que se encuentra entre los índices ingresados por el usuario, y
// mostrar la subcadena resultante en pantalla.

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingrese el índice inicial: ");
        int indiceInicial = sc.nextInt();

        System.out.print("Ingrese el índice final: ");
        int indiceFinal = sc.nextInt();

        String subcadena = frase.substring(indiceInicial, indiceFinal);
        System.out.println("La subcadena resultante es: " + subcadena);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario una frase, que
// se almacena en la variable frase.

// Luego, se solicitan al usuario los índices inicial y final, que representan
// la posición de inicio y fin de la subcadena que se desea extraer.

// Se utiliza el método substring() de la clase String para extraer la subcadena
// de la frase, utilizando los índices proporcionados por el usuario. El
// resultado se almacena en la variable subcadena.

// Finalmente, se muestra en pantalla la subcadena resultante utilizando
// System.out.println().