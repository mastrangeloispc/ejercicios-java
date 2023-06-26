import java.util.Scanner;

public class Laberinto {
    public static void main(String[] args) {
        String[][] laberinto1 = {
            {"1", "1", "1", "1", "1"},
            {"1", "X", "0", "0", "E"},
            {"1", "1", "1", "1", "1"}
        };
        int filaActual = 1;
        int columnaActual = 1;

        Scanner scanner = new Scanner(System.in);

        while (!laberinto1[filaActual][columnaActual].equals("E")) {
            // Muestra la matriz actualizada en la consola
            for (String[] fila : laberinto1) {
                for (String casilla : fila) {
                    System.out.print(casilla + " ");
                }
                System.out.println();
            }

            // Lee la tecla que el usuario presiona
            String tecla = scanner.nextLine();

            // Mueve al jugador según la tecla presionada
            switch (tecla) {
                case "A":
                    // Mueve al jugador a la izquierda
                    if (columnaActual > 0 && (laberinto1[filaActual][columnaActual - 1].equals("0") || laberinto1[filaActual][columnaActual - 1].equals("E"))) {
                        laberinto1[filaActual][columnaActual] = "-";
                        columnaActual--;
                        laberinto1[filaActual][columnaActual] = "X";
                    }
                    break;
                case "W":
                    // Mueve al jugador hacia arriba
                    if (filaActual > 0 && (laberinto1[filaActual - 1][columnaActual].equals("0") || laberinto1[filaActual - 1][columnaActual].equals("E"))) {
                        laberinto1[filaActual][columnaActual] = "-";
                        filaActual--;
                        laberinto1[filaActual][columnaActual] = "X";
                    }
                    break;
                case "S":
                    // Mueve al jugador hacia abajo
                    if (filaActual < laberinto1.length - 1 && (laberinto1[filaActual + 1][columnaActual].equals("0") || laberinto1[filaActual + 1][columnaActual].equals("E"))) {
                        laberinto1[filaActual][columnaActual] = "-";
                        filaActual++;
                        laberinto1[filaActual][columnaActual] = "X";
                    }
                    break;
                case "D":
                    // Mueve al jugador a la derecha
                    if (columnaActual < laberinto1[0].length - 1 && (laberinto1[filaActual][columnaActual + 1].equals("0") || laberinto1[filaActual][columnaActual + 1].equals("E"))) {
                        laberinto1[filaActual][columnaActual] = "-";
                        columnaActual++;
                        laberinto1[filaActual][columnaActual] = "X";
                    }
                    break;
            }
        }

        // Muestra la matriz final en la consola
        for (String[] fila : laberinto1) {
            for (String casilla : fila) {
                System.out.print(casilla + " ");
            }
            System.out.println();
       
