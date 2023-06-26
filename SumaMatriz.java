public class SumaMatriz {
    public static void main(String[] args) {
        // Crear una matriz de 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Calcular la suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        
        // Imprimir la suma de los elementos de la matriz
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}
