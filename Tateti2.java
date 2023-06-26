import java.util.*;
 public class Tateti2 {
    static char[][] tablero = new char[3][3];
    static char jugador = 'X';
    static char computadora = 'O';
     public static void main(String[] args) {
        inicializarTablero();
        imprimirTablero();
        while (!juegoTerminado()) {
            if (jugador == 'X') {
                jugadaJugador();
            } else {
                jugadaComputadora();
            }
            imprimirTablero();
            cambiarJugador();
        }
        if (hayGanador()) {
            System.out.println("¡Felicidades! El jugador " + jugador + " ha ganado.");
        } else {
            System.out.println("¡Empate!");
        }
    }
     public static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }
     public static void imprimirTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
     public static void jugadaJugador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Es el turno del jugador " + jugador + ". Ingresa la fila y columna donde quieres jugar (ejemplo: 1 2): ");
        int fila = sc.nextInt() - 1;
        int columna = sc.nextInt() - 1;
        if (tablero[fila][columna] != '-') {
            System.out.println("Esa casilla ya está ocupada. Intenta de nuevo.");
            jugadaJugador();
        } else {
            tablero[fila][columna] = jugador;
        }
    }
     public static void jugadaComputadora() {
        Random rand = new Random();
        int fila = rand.nextInt(3);
        int columna = rand.nextInt(3);
        if (tablero[fila][columna] != '-') {
            jugadaComputadora();
        } else {
            tablero[fila][columna] = computadora;
        }
        System.out.println("La computadora ha jugado en la fila " + (fila+1) + " y columna " + (columna+1) + ".");
    }
     public static boolean juegoTerminado() {
        return hayGanador() || tableroLleno();
    }
     public static boolean hayGanador() {
        return (ganadorEnFila() || ganadorEnColumna() || ganadorEnDiagonal());
    }
     public static boolean ganadorEnFila() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true;
            }
        }
        return false;
    }
     public static boolean ganadorEnColumna() {
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] != '-' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                return true;
            }
        }
        return false;
    }
     public static boolean ganadorEnDiagonal() {
        return ((tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) ||
                (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]));
    }
     public static boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
     public static void cambiarJugador() {
        if (jugador == 'X') {
            jugador = 'O';
        } else {
            jugador = 'X';
        }
    }
}