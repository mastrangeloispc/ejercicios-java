import java.util.Scanner;
 public class Tateti {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jugadorActual = 'X';
        boolean juegoTerminado = false;
         while (!juegoTerminado) {
            // Imprimir el tablero
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
             // Pedir al jugador que seleccione una posición
            System.out.print("Jugador " + jugadorActual + ", elige una posición (fila columna) separada por un espacio: ");
            int fila = sc.nextInt();
            int columna = sc.nextInt();
             // Verificar si la posición está disponible
            if (tablero[fila][columna] != ' ') {
                System.out.println("Posición ocupada, intenta de nuevo.");
                continue;
            }
             // Colocar la ficha del jugador en la posición seleccionada
            tablero[fila][columna] = jugadorActual;
             // Verificar si el jugador actual ha ganado
            if (verificarGanador(tablero, jugadorActual)) {
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                juegoTerminado = true;
            }
             // Verificar si hay empate
            if (!juegoTerminado && verificarEmpate(tablero)) {
                System.out.println("¡Empate!");
                juegoTerminado = true;
            }
             // Cambiar el jugador actual
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
    }
     public static boolean verificarGanador(char[][] tablero, char jugador) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
        }
         // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador) {
                return true;
            }
        }
         // Verificar diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
         return false;
    }
     public static boolean verificarEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}