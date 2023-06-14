// Ejercicio de selección de opción: Escribir un programa que muestre un menú
// con las siguientes opciones:
// ○ Opción 1: "Guardar"
// ○ Opción 2: "Cargar"
// ○ Opción 3: "Salir" Solicitar al usuario que ingrese un número del 1 al 3
// para seleccionar una opción. Utilizar la estructura "switch" para
// implementar este programa y mostrar en pantalla el mensaje
// correspondiente a la opción seleccionada

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");
        System.out.print("Ingrese un número del 1 al 3: ");
        int opcion = sc.nextInt();

        String mensaje;

        switch (opcion) {
            case 1:
                mensaje = "Opción seleccionada: Guardar";
                break;
            case 2:
                mensaje = "Opción seleccionada: Cargar";
                break;
            case 3:
                mensaje = "Opción seleccionada: Salir";
                break;
            default:
                mensaje = "Opción inválida";
                break;
        }

        System.out.println(mensaje);
    }
}

// En este programa, se muestra un menú con opciones utilizando
// System.out.println(). Luego, se utiliza Scanner para solicitar al usuario que
// ingrese un número del 1 al 3, que se almacena en la variable opcion.

// Después, se utiliza la estructura switch para evaluar el valor de opcion y
// asignar el mensaje correspondiente a la opción seleccionada a la variable
// mensaje. Cada caso representa una opción y se asigna el mensaje
// correspondiente. Si el número no se encuentra en ese rango, se asigna el
// mensaje "Opción inválida".

// Finalmente, se muestra en pantalla el mensaje correspondiente utilizando
// System.out.println().
