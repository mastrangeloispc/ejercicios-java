// Ejercicio de días de la semana: Escribir un programa que solicite al usuario un
// número del 1 al 7, representando un día de la semana, y muestre en pantalla el
// nombre correspondiente a ese día. Utilizar la estructura "switch" para
// implementar este programa.

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numeroDia = sc.nextInt();

        String nombreDia;

        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número de día inválido";
                break;
        }

        System.out.println("El día correspondiente es: " + nombreDia);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario un número del
// 1 al 7, que representa un día de la semana, y se almacena en la variable
// numeroDia.

// Luego, se utiliza la estructura switch para evaluar el valor de numeroDia y
// asignar el nombre correspondiente a la variable nombreDia. Cada caso
// representa un número del 1 al 7 y asigna el nombre del día correspondiente.
// Si el número no se encuentra en ese rango, se asigna el mensaje "Número de
// día inválido".

// Finalmente, se muestra en pantalla el nombre del día correspondiente
// utilizando System.out.println().