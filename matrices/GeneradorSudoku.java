import java.util.Random;
 public class GeneradorSudoku {
    private static final int TAMANIO = 9;
    private static final int INCOGNITAS_POR_BLOQUE = 3;
    private static int[][] sudoku = new int[TAMANIO][TAMANIO];
     public static void main(String[] args) {
        generarSudoku();
        mostrarSudoku();
    }
     private static void generarSudoku() {
        Random random = new Random();
        // Generar los bloques
        for (int i = 0; i < TAMANIO; i += 3) {
            for (int j = 0; j < TAMANIO; j += 3) {
                // Generar los números del bloque
                int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                for (int k = 0; k < INCOGNITAS_POR_BLOQUE; k++) {
                    int indice = random.nextInt(numeros.length);
                    sudoku[i + k / 3][j + k % 3] = numeros[indice];
                    // Eliminar el número del array
                    int[] numerosTemp = new int[numeros.length - 1];
                    int contador = 0;
                    for (int l = 0; l < numeros.length; l++) {
                        if (l != indice) {
                            numerosTemp[contador++] = numeros[l];
                        }
                    }
                    numeros = numerosTemp;
                }
            }
        }
        // Resolver el Sudoku
        resolverSudoku(0, 0);
    }
     private static boolean resolverSudoku(int fila, int columna) {
        // Si se llega al final del Sudoku, se ha resuelto
        if (fila == TAMANIO) {
            return true;
        }
        // Si se llega al final de la fila, se pasa a la siguiente fila
        if (columna == TAMANIO) {
            return resolverSudoku(fila + 1, 0);
        }
        // Si la celda ya tiene un valor, se pasa a la siguiente celda
        if (sudoku[fila][columna] != 0) {
            return resolverSudoku(fila, columna + 1);
        }
        // Probar los números del 1 al 9
        for (int i = 1; i <= 9; i++) {
            if (esValido(fila, columna, i)) {
                sudoku[fila][columna] = i;
                if (resolverSudoku(fila, columna + 1)) {
                    return true;
                }
                sudoku[fila][columna] = 0;
            }
        }
        return false;
    }
     private static boolean esValido(int fila, int columna, int numero) {
        // Comprobar la fila
        for (int i = 0; i < TAMANIO; i++) {
            if (sudoku[fila][i] == numero) {
                return false;
            }
        }
        // Comprobar la columna
        for (int i = 0; i < TAMANIO; i++) {
            if (sudoku[i][columna] == numero) {
                return false;
            }
        }
        // Comprobar el bloque
        int bloqueFila = fila / 3 * 3;
        int bloqueColumna = columna / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[bloqueFila + i][bloqueColumna + j] == numero) {
                    return false;
                }
            }
        }
        return true;
    }
     private static void mostrarSudoku() {
        System.out.println("Sudoku:");
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                System.out.print(sudoku[i][j] + " ");
                if ((j + 1) % 3 == 0 && j != 8) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i != 8) {
                System.out.println("------|-------|------");
            }
        }
    }
}