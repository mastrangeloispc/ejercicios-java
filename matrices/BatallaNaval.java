import java.util.Random;
import java.util.Scanner;
 public class BatallaNaval {
    public static void main(String[] args) {
        char[][] computadora = new char[4][4];
        char[][] jugador = new char[4][4];
        int barcosComputadora = 5;
        int barcosJugador = 5;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
         // Llenar matrices con símbolos aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (rand.nextInt(2) == 0) {
                    computadora[i][j] = '~';
                } else {
                    computadora[i][j] = '=';
                }
                jugador[i][j] = '~';
            }
        }
         // Colocar barcos en la matriz de la computadora
        int barcosColocados = 0;
        while (barcosColocados < 5) {
            int fila = rand.nextInt(4);
            int columna = rand.nextInt(4);
            if (computadora[fila][columna] == '=') {
                continue;
            }
            computadora[fila][columna] = '=';
            barcosColocados++;
        }
         // Juego
        while (barcosComputadora > 0 && barcosJugador > 0) {
            // Imprimir mapa de la computadora
            System.out.println("Mapa de la computadora:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (jugador[i][j] == 'X') {
                        System.out.print("X ");
                    } else if (jugador[i][j] == 'A') {
                        System.out.print("A ");
                    } else {
                        System.out.print("~ ");
                    }
                }
                System.out.println();
            }
             // Pedir coordenadas al jugador
            System.out.print("Ingrese las coordenadas de ataque (ejemplo: B2): ");
            String coordenadas = sc.nextLine();
            int fila = coordenadas.charAt(0) - 'A';
            int columna = Integer.parseInt(coordenadas.substring(1)) - 1;
             // Atacar a la computadora
            if (computadora[fila][columna] == '=') {
                System.out.println("¡Ataque exitoso!");
                computadora[fila][columna] = 'A';
                barcosComputadora--;
            } else {
                System.out.println("¡Ataque fallido!");
                computadora[fila][columna] = 'X';
            }
             // Atacar al jugador
            fila = rand.nextInt(4);
            columna = rand.nextInt(4);
            if (jugador[fila][columna] == '=') {
                System.out.println("La computadora ha atacado en " + (char)('A' + fila) + (columna + 1) + ". ¡Han impactado en tu barco!");
                jugador[fila][columna] = 'A';
                barcosJugador--;
            } else {
                System.out.println("La computadora ha atacado en " + (char)('A' + fila) + (columna + 1) + ". ¡Han fallado!");
                jugador[fila][columna] = 'X';
            }
        }
         // Imprimir mapas finales y resultado
        System.out.println("Mapa final de la computadora:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (computadora[i][j] == '=') {
                    System.out.print("= ");
                } else {
                    System.out.print("~ ");
                }
            }
            System.out.println();
        }
         System.out.println("Mapa final del jugador:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (jugador[i][j] == '=') {
                    System.out.print("= ");
                } else {
                    System.out.print("~ ");
                }
            }
            System.out.println();
        }
         if (barcosComputadora == 0) {
            System.out.println("¡Felicidades! Has ganado la partida.");
        } else {
            System.out.println("Lo siento, la computadora ha ganado la partida.");
        }
    }
}