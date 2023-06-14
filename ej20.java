// Ejercicio de generación de números aleatorios: Escribir un programa que
// genere y muestre en pantalla un número aleatorio en el rango del 1 al 100
// utilizando el método random() de la clase Math. Puedes utilizar el método floor()
// para redondear el número aleatorio hacia abajo.

public class ej20 {
    public static void main(String[] args) {
        double numeroAleatorio = Math.random() * 100; // Genera un número aleatorio entre 0 y 100

        int numeroRedondeado = (int) Math.floor(numeroAleatorio); // Redondea hacia abajo el número aleatorio

        System.out.println("Número aleatorio: " + numeroRedondeado);
    }
}

// En este programa, se utiliza el método random() de la clase Math para generar
// un número aleatorio entre 0 (incluido) y 1 (excluido). Luego, se multiplica
// por 100 para obtener un número aleatorio en el rango del 0 al 100.

// Después, se utiliza el método floor() de la clase Math para redondear hacia
// abajo el número aleatorio obtenido. Se hace un casting a int para obtener un
// número entero.

// Finalmente, se muestra en pantalla el número aleatorio redondeado utilizando
// System.out.println().

// Cabe mencionar que el número aleatorio generado será un número de punto
// flotante en el rango de 0 a 100, pero se redondea hacia abajo para obtener un
// número entero en el rango de 1 a 100.