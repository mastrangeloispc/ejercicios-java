// Ejercicio de cálculo de descuento: Escribir un programa que solicite al usuario
// el precio de un producto y determine si tiene derecho a un descuento. Si el
// precio es mayor o igual a $100, aplicar un descuento del 10% y mostrar el nuevo
// precio. De lo contrario, mostrar el precio original sin descuento.

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        if (precio >= 100) {
            double descuento = precio * 0.1;
            double precioConDescuento = precio - descuento;
            System.out.println("Nuevo precio con descuento: $" + precioConDescuento);
        } else {
            System.out.println("Precio original sin descuento: $" + precio);
        }
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario el precio del
// producto, que se almacena en la variable precio.

// Luego, se utiliza una estructura de control if-else para determinar si el
// precio es mayor o igual a $100. Si cumple esta condición, se calcula el
// descuento como el 10% del precio original (precio * 0.1). A continuación, se
// calcula el nuevo precio con descuento restando el descuento al precio
// original (precio - descuento). El nuevo precio con descuento se muestra en
// pantalla.

// Si el precio es menor a $100, no se aplica descuento y se muestra el precio
// original sin modificaciones.