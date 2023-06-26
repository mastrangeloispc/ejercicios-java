import java.util.Scanner;
 public class sudoku {
     public static void main(String[] args) {
        int[][] sudoku = {
            {0, 4, 5, 0, 2, 0, 1, 7, 0},
            {7, 2, 6, 0, 5, 0, 9, 0, 3},
            {0, 9, 1, 0, 7, 3, 6, 0, 2},
            {4, 0, 9, 0, 0, 5, 2, 0, 0},
            {1, 0, 0, 7, 0, 0, 0, 9, 0},
            {5, 0, 8, 2, 1, 0, 4, 0, 0},
            {9, 1, 0, 0, 0, 8, 0, 0, 4},
            {0, 8, 0, 0, 4, 2, 5, 0, 0},
            {2, 0, 4, 0, 9, 7, 3, 0, 0}
        };
         Scanner scanner = new Scanner(System.in);
         while (true) {
            // Mostrar el tablero actual
            System.out.println("Tablero actual:");
            imprimirTablero(sudoku);
             // Pedir la casilla y el número al usuario
            System.out.print("Ingrese la fila (1-9): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Ingrese la columna (1-9): ");
            int columna = scanner.nextInt() - 1;
            System.out.print("Ingrese el número (1-9): ");
            int numero = scanner.nextInt();
             // Verificar que la casilla esté vacía
            if (sudoku[fila][columna] != 0) {
                System.out.println("Esta casilla ya está ocupada. Por favor, seleccione otra.");
                continue;
            }
             // Verificar que el número sea válido
            if (!esValido(sudoku, fila, columna, numero)) {
                System.out.println("Este número no es válido para esta casilla. Por favor, seleccione otro.");
                continue;
            }
             // Colocar el número en la casilla
            sudoku[fila][columna] = numero;
             // Verificar si se completó el tablero
            if (completo(sudoku)) {
                System.out.println("¡Felicidades, has completado el Sudoku!");
                break;
            }
        }
         scanner.close();
    }
     // Función para imprimir el tablero
    public static void imprimirTablero(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
                if ((j+1) % 3 == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if ((i+1) % 3 == 0) {
                System.out.println();
            }
        }
    }
     // Función para verificar si un número es válido para una casilla
    public static boolean esValido(int[][] sudoku, int fila, int columna, int numero) {
        // Verificar que el número no esté repetido en la misma fila
        for (int j = 0; j < 9; j++) {
            if (sudoku[fila][j] == numero) {
                return false;
            }
        }
         // Verificar que el número no esté repetido en la misma columna
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][columna] == numero) {
                return false;
            }
        }
         // Verificar que el número no esté repetido en el mismo bloque
        int filaInicio = (fila / 3) * 3;
        int columnaInicio = (columna / 3) * 3;
        for (int i = filaInicio; i < filaInicio + 3; i++) {
            for (int j = columnaInicio; j < columnaInicio + 3; j++) {
                if (sudoku[i][j] == numero) {
                    return false;
                }
            }
        }
         // Si llegamos hasta aquí, el número es válido
        return true;
    }
     // Función para verificar si el tablero está completo
    public static boolean completo(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
 }