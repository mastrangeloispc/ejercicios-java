public class MatrizOrdenInverso {
    public static void main(String[] args) {
        // Crear una matriz de 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz en orden inverso
        System.out.println("Matriz en orden inverso:");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

