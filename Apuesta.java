import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Apuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] apuesta = new int[5];
        int[] sorteo = new int[5];
        int aciertos = 0;
        String nombre;
        // Preguntar el nombre del jugador
        System.out.print("Ingresa tu nombre: ");
        nombre = scanner.nextLine();
        // Pedir al jugador que haga su apuesta
        System.out.println("Bienvenido " + nombre + ". Haz tu apuesta para los 5 números (del 1 al 36):");
        for (int i = 0; i < apuesta.length; i++) {
            System.out.print("Número " + (i+1) + ": ");
            apuesta[i] = scanner.nextInt();
        }
        // Realizar el sorteo
        for (int i = 0; i < sorteo.length; i++) {
            int numeroSorteado;
            do {
                numeroSorteado = random.nextInt(36) + 1;
            } while (Arrays.asList(sorteo).contains(numeroSorteado));
            sorteo[i] = numeroSorteado;
        }
        // Mostrar los resultados del sorteo
        System.out.println("Los números sorteados son: " + Arrays.toString(sorteo));
        // Comparar los resultados con la apuesta
        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < sorteo.length; j++) {
                if (apuesta[i] == sorteo[j]) {
                    aciertos++;
                }
            }
        }
        // Mostrar los resultados de la apuesta
        System.out.println("Tuviste " + aciertos + " aciertos en tu apuesta.");
    }
}   