// Escribir un programa que solicite al usuario que ingrese una contraseña y verifique si
// cumple con los siguientes criterios para considerarse segura:
// ● La contraseña debe tener al menos 8 caracteres.
// ● La contraseña debe contener al menos una letra mayúscula y una letra
// minúscula.
// ● La contraseña debe contener al menos un número.
// ● La contraseña debe contener al menos un carácter especial (por ejemplo, !, @,
// #, $).
// El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según
// los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada
// uno de los criterios.

import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();

        boolean cumpleLongitud = contrasena.length() >= 8;
        boolean cumpleMayuscula = contrasena.matches(".*[A-Z].*");
        boolean cumpleMinuscula = contrasena.matches(".*[a-z].*");
        boolean cumpleNumero = contrasena.matches(".*\\d.*");
        boolean cumpleCaracterEspecial = contrasena.matches(".*[!@#$].*");

        if (cumpleLongitud && cumpleMayuscula && cumpleMinuscula && cumpleNumero && cumpleCaracterEspecial) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no cumple con los criterios de seguridad.");
        }
    }
}

// En este programa, se utiliza Scanner para solicitar al usuario que ingrese
// una contraseña, que se almacena en la variable contrasena.

// Luego, se verifican los criterios de seguridad de la contraseña utilizando
// métodos de la clase String:

// cumpleLongitud verifica si la contraseña tiene al menos 8 caracteres.
// cumpleMayuscula verifica si la contraseña contiene al menos una letra
// mayúscula.
// cumpleMinuscula verifica si la contraseña contiene al menos una letra
// minúscula.
// cumpleNumero verifica si la contraseña contiene al menos un número.
// cumpleCaracterEspecial verifica si la contraseña contiene al menos un
// carácter especial (como !, @, #, $).
// Finalmente, se verifica si todos los criterios se cumplen. Si es así, se
// muestra un mensaje indicando que la contraseña es segura. De lo contrario, se
// muestra un mensaje indicando que la contraseña no cumple con los criterios de
// seguridad.