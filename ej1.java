// Ejercicio de calificación: Escribir un programa que solicite al usuario una
// puntuación entre 0 y 100. Luego, mostrar en pantalla la calificación
// correspondiente según la siguiente escala:
// ○ Si la puntuación está entre 90 y 100, muestra "A".
// ○ Si la puntuación está entre 80 y 89, muestra "B".
// ○ Si la puntuación está entre 70 y 79, muestra "C".
// ○ Si la puntuación está entre 60 y 69, muestra "D".
// ○ Si la puntuación es menor a 60, muestra "F".

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la puntuación: ");
        int puntuacion = scanner.nextInt();

        if (puntuacion >= 90 && puntuacion <= 100) {
            System.out.println("Calificación: A");
        } else if (puntuacion >= 80 && puntuacion <= 89) {
            System.out.println("Calificación: B");
        } else if (puntuacion >= 70 && puntuacion <= 79) {
            System.out.println("Calificación: C");
        } else if (puntuacion >= 60 && puntuacion <= 69) {
            System.out.println("Calificación: D");
        } else if (puntuacion < 60 && puntuacion >= 0) {
            System.out.println("Calificación: F");
        } else {
            System.out.println("Puntuación inválida. Debe estar entre 0 y 100.");
        }
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario una puntuación
// entre 0 y 100, que se almacena en la variable puntuacion.

// Luego, se utiliza una serie de estructuras if-else para determinar la
// calificación correspondiente según el rango de puntuaciones. Si la puntuación
// está entre 90 y 100, se asigna la calificación "A" a la variable
// calificacion. Si la puntuación está entre 80 y 89, se asigna la calificación
// "B", y así sucesivamente. Si la puntuación no se encuentra en ninguno de los
// rangos mencionados, se asume que la calificación es "F".

// Finalmente, se muestra en pantalla la calificación correspondiente utilizando
// System.out.println().

// Espero que este código te sea útil. Si tienes más preguntas o necesitas ayuda
// adicional, no dudes en preguntar.
