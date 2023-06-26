public class ImprimirNombreYEdad {
    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 30;
        imprimirNombreYEdad(nombre, edad);
    }
     public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}