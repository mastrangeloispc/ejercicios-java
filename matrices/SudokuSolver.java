import java.util.Scanner;
 public class SudokuSolver {
    private static int[][] sudoku = {
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
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
         do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar sudoku");
            System.out.println("2. Probar valor");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
             switch (opcion) {
                case 1:
                    mostrarSudoku();
                    break;
                case 2:
                    probarValor(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 3);
    }
     private static void mostrarSudoku() {
        System.out.println("Sudoku:");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
                if ((j + 1) % 3 == 0 && j != 8) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i != 8) {
                System.out.println("---------------------");
            }
        }
    }
     private static void probarValor(Scanner scanner) {
        int i, j, valor;
         System.out.print("Ingrese la fila (0-8): ");
        i = scanner.nextInt();
        System.out.print("Ingrese la columna (0-8): ");
        j = scanner.nextInt();
         if (i < 0 || i > 8 || j < 0 || j > 8) {
            System.out.println("Coordenadas inválidas. Intente de nuevo.");
            return;
        }
         if (sudoku[i][j] != 0) {
            System.out.println("La celda [" + i + "," + j + "] ya tiene un valor asignado.");
            return;
        }
         System.out.print("Ingrese un valor (1-9): ");
        valor = scanner.nextInt();
         if (valor < 1 || valor > 9) {
            System.out.println("Valor inválido. Intente de nuevo.");
            return;
        }
         if (existeEnFila(i, valor)) {
            System.out.println("El número " + valor + " ya existe en la fila " + i + ".");
            return;
        }
         if (existeEnColumna(j, valor)) {
            System.out.println("El número " + valor + " ya existe en la columna " + j + ".");
            return;
        }
         if (existeEnBloque(i, j, valor)) {
            System.out.println("El número " + valor + " ya existe en el bloque.");
            return;
        }
         System.out.println("El número " + valor + " es una solución posible para la celda [" + i + "," + j + "].");
    }
     private static boolean existeEnFila(int fila, int valor) {
        for (int j = 0; j < sudoku[fila].length; j++) {
            if (sudoku[fila][j] == valor) {
                return true;
            }
        }
        return false;
    }
     private static boolean existeEnColumna(int columna, int valor) {
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][columna] == valor) {
                return true;
            }
        }
        return false;
    }
     private static boolean existeEnBloque(int fila, int columna, int valor) {
        int bloqueFila = fila / 3;
        int bloqueColumna = columna / 3;
         for (int i = bloqueFila * 3; i < bloqueFila * 3 + 3; i++) {
            for (int j = bloqueColumna * 3; j < bloqueColumna * 3 + 3; j++) {
                if (sudoku[i][j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }
}