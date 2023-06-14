import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.print("Ingrese la unidad de medida (Celsius - C / Fahrenheit - F): ");
        String unidadMedida = sc.next();

        double temperaturaConvertida;

        if (unidadMedida.equalsIgnoreCase("C")) {
            // Convertir de Celsius a Fahrenheit
            temperaturaConvertida = (temperatura * 9 / 5) + 32;
            System.out.println("Temperatura convertida a Fahrenheit: " + temperaturaConvertida + "°F");
        } else if (unidadMedida.equalsIgnoreCase("F")) {
            // Convertir de Fahrenheit a Celsius
            temperaturaConvertida = (temperatura - 32) * 5 / 9;
            System.out.println("Temperatura convertida a Celsius: " + temperaturaConvertida + "°C");
        } else {
            System.out.println("Unidad de medida inválida. Por favor, ingrese 'C' o 'F'.");
        }
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario una
// temperatura y una unidad de medida. La temperatura se almacena en la variable
// temperatura y la unidad de medida en la variable unidadMedida.

// Luego, se verifica la unidad de medida ingresada por el usuario. Si es "C"
// (Celsius), se realiza la conversión a Fahrenheit utilizando la fórmula
// (temperatura * 9 / 5) + 32. El resultado se muestra en pantalla.

// Si la unidad de medida es "F" (Fahrenheit), se realiza la conversión a
// Celsius utilizando la fórmula (temperatura - 32) * 5 / 9. El resultado se
// muestra en pantalla.

// Si se ingresa una unidad de medida diferente a "C" o "F", se muestra un
// mensaje de error indicando que la unidad de medida es inválida.
