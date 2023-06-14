// Ejercicio de conversión de calificaciones: Escribir un programa que solicite al
// usuario una calificación numérica del 1 al 5 y muestre en pantalla la calificación
// correspondiente en letras, utilizando la siguiente escala:
// ○ 1: "Muy deficiente"
// ○ 2: "Deficiente"
// ○ 3: "Suficiente"
// ○ 4: "Notable"
// ○ 5: "Sobresaliente". Utilizar la estructura "switch" para implementar este
// programa.

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una calificación del 1 al 5: ");
        int calificacionNumerica = sc.nextInt();

        String calificacionLetras;

        switch (calificacionNumerica) {
            case 1:
                calificacionLetras = "Muy deficiente";
                break;
            case 2:
                calificacionLetras = "Deficiente";
                break;
            case 3:
                calificacionLetras = "Suficiente";
                break;
            case 4:
                calificacionLetras = "Notable";
                break;
            case 5:
                calificacionLetras = "Sobresaliente";
                break;
            default:
                calificacionLetras = "Calificación inválida";
                break;
        }

        System.out.println("La calificación correspondiente es: " + calificacionLetras);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario una
// calificación numérica del 1 al 5, que se almacena en la variable
// calificacionNumerica.

// Luego, se utiliza la estructura switch para evaluar el valor de
// calificacionNumerica y asignar la calificación correspondiente en letras a la
// variable calificacionLetras. Cada caso representa una calificación numérica
// del 1 al 5 y asigna la calificación en letras correspondiente. Si el número
// no se encuentra en ese rango, se asigna el mensaje "Calificación inválida".

// Finalmente, se muestra en pantalla la calificación correspondiente utilizando
// System.out.println().