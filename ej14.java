// Ejercicio de concatenación de cadenas: Escribir un programa que solicite al
// usuario su nombre y apellido por separado, y luego muestre en pantalla el
// nombre completo utilizando el método concat() de la clase String.

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("El nombre completo es: " + nombreCompleto);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario su nombre y
// apellido por separado, que se almacenan en las variables nombre y apellido
// respectivamente.

// Luego, se utiliza el método concat() de la clase String para concatenar el
// nombre y el apellido, separados por un espacio en blanco. El resultado se
// almacena en la variable nombreCompleto.

// Finalmente, se muestra en pantalla el nombre completo utilizando
// System.out.println().