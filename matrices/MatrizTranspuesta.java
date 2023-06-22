public class MatrizTranspuesta {
    public static void main(String[] args) {
        // Crear una matriz de 3x4
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        // Obtener las dimensiones de la matriz original
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;

        // Crear la matriz transpuesta intercambiando filas y columnas
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // Imprimir la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
