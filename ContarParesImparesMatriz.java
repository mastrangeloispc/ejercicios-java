public class ContarParesImparesMatriz {
    public static void main(String[] args) {
        // Crear una matriz de 3x3
        int[][] matriz = {
            {5, 10, 3},
            {8, 2, 6},
            {1, 9, 4}
        };

        // Contar números pares e impares
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }
        }

        // Mostrar el resultado
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
    }
}
