// Ejercicio de selección de figura geométrica: Escribir un programa que solicite
// al usuario un número del 1 al 3 para seleccionar una figura geométrica (1:
// círculo, 2: cuadrado, 3: triángulo). Luego, mostrar en pantalla el área
// correspondiente a la figura seleccionada. Utilizar la estructura "switch" para
// implementar este programa.

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.print("Ingrese un número del 1 al 3: ");
        int opcion = sc.nextInt();

        double area;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = sc.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = sc.nextDouble();
                area = Math.pow(lado, 2);
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = sc.nextDouble();
                area = (base * altura) / 2;
                break;
            default:
                System.out.println("Opción inválida");
                return; // Salir del programa si la opción es inválida
        }

        System.out.println("El área correspondiente es: " + area);
    }
}

// En este programa, se presenta al usuario un menú de opciones para seleccionar
// una figura geométrica. Luego, se utiliza Scanner para capturar la opción
// seleccionada y se almacena en la variable opcion.

// Después, se utiliza la estructura switch para evaluar el valor de opcion y
// calcular el área correspondiente a la figura seleccionada. Cada caso
// representa una opción y solicita los datos necesarios para el cálculo del
// área. El cálculo se realiza utilizando fórmulas matemáticas adecuadas para
// cada figura.

// Si el usuario selecciona una opción inválida, se muestra el mensaje "Opción
// inválida" y el programa finaliza utilizando return.

// Finalmente, se muestra en pantalla el área correspondiente utilizando
// System.out.println().
