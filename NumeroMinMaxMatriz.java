public class NumeroMinMaxMatriz {
    public static void main(String[] args) {
        // Crear una matriz de 3x3
        int[][] matriz = {
            {5, 10, 3},
            {8, 2, 6},
            {1, 9, 4}
        };

        // Encontrar el número más grande y más pequeño
        int maximo = matriz[0][0];
        int minimo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
        }

        // Mostrar el número más grande y más pequeño
        System.out.println("El número más grande en la matriz es: " + maximo);
        System.out.println("El número más pequeño en la matriz es: " + minimo);
    }
}


