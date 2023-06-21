public class matriz {
    public static void main(String[] args) {
        // Crear una matriz de 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Mostrar contenido de la matriz en formato de matriz
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Mostrar contenido de la matriz en formato de arreglo
        System.out.println("\nContenido de la matriz en formato de arreglo:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
