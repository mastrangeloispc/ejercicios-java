// Ejercicio de verificación de día hábil: Escribir un programa que solicite al
// usuario un número del 1 al 7, representando un día de la semana, y determine si
// es un día hábil o un día no hábil. Mostrar el resultado en pantalla. Considerar
// que los días hábiles son del 1 al 5 (de lunes a viernes), y utilizar la estructura
// "switch" para implementar este programa.

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numeroDia = sc.nextInt();

        String resultado;

        switch (numeroDia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                resultado = "Día hábil";
                break;
            case 6:
            case 7:
                resultado = "Día no hábil";
                break;
            default:
                resultado = "Número de día inválido";
                break;
        }

        System.out.println("El resultado es: " + resultado);
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario un número del
// 1 al 7, que representa un día de la semana, y se almacena en la variable
// numeroDia.

// Luego, se utiliza la estructura switch para evaluar el valor de numeroDia. Si
// el número es 1, 2, 3, 4 o 5, se asigna el valor "Día hábil" a la variable
// resultado. Si el número es 6 o 7, se asigna el valor "Día no hábil". Si el
// número no se encuentra en ese rango, se asigna el mensaje "Número de día
// inválido".

// Finalmente, se muestra en pantalla el resultado utilizando
// System.out.println().

// Recuerda que en este ejemplo se considera que los días hábiles son del 1 al 5
// (de lunes a viernes).
