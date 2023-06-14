// Ejercicio de verificación de contraseña: Escribir un programa que solicite al
// usuario una contraseña y verifique si coincide con una contraseña predefinida. Si
// la contraseña ingresada es correcta, mostrar un mensaje de "Acceso concedido".
// De lo contrario, mostrar un mensaje de "Acceso denegado".

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Contraseña predefinida
        String contrasenaPredefinida = "contrasena123";

        System.out.print("Ingrese la contraseña: ");
        String contrasenaIngresada = sc.nextLine();

        if (contrasenaIngresada.equals(contrasenaPredefinida)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}

// En este programa, se define una contraseña predefinida utilizando la variable
// contrasenaPredefinida. Luego, se solicita al usuario que ingrese una
// contraseña utilizando Scanner y se almacena en la variable
// contrasenaIngresada.

// Después, se utiliza el método equals() para comparar si la contraseña
// ingresada coincide con la contraseña predefinida. Si coinciden, se muestra el
// mensaje "Acceso concedido". De lo contrario, se muestra el mensaje "Acceso
// denegado".

// Ten en cuenta que en este ejemplo la contraseña predefinida es
// "contrasena123". Puedes cambiarla por cualquier otra que desees.