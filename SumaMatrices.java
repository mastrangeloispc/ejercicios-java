public class SumaMatrices {
     public static void main(String[] args) {
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizB = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[][] matrizC = new int[3][3];
         // Suma de matrices
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
         // Imprimir matriz resultante
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
}