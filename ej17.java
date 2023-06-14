// Ejercicio de conversión de mayúsculas y minúsculas: Escribir un programa
// que solicite al usuario una cadena de texto y muestre en pantalla la misma
// cadena, pero con todos los caracteres en mayúsculas o minúsculas. Utilizar los
// métodos toUpperCase() y toLowerCase() de la clase String para realizar la
// conversión.

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = sc.nextLine();

        System.out.println("Cadena en mayúsculas: " + cadena.toUpperCase());
        System.out.println("Cadena en minúsculas: " + cadena.toLowerCase());
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario una cadena de
// texto, que se almacena en la variable cadena.

// Luego, se utiliza el método toUpperCase() de la clase String para convertir
// todos los caracteres de la cadena a mayúsculas. El resultado se muestra en
// pantalla utilizando System.out.println().

// A continuación, se utiliza el método toLowerCase() de la clase String para
// convertir todos los caracteres de la cadena a minúsculas. El resultado
// también se muestra en pantalla utilizando System.out.println().

// De esta manera, obtendrás la misma cadena de texto pero en mayúsculas y
// minúsculas respectivamente.
