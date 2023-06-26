

public class matrices {
    public static void main(String[] args) {
        // int[][] matriz = { { 5, 3, 2 }, { 8, 1, 5} };
        // // Accedemos al primer elemento (que es otro array):
        // System.out.println(Arrays.toString(matriz[0])); // [5, 3, 2]
        // // Accedemos al segundo elemento (que es otro array):
        // System.out.println(Arrays.toString(matriz[1])); // [8, 1, 5]
        // // Accedemos al segundo elemento del primer array:
        // System.out.println(matriz[0][4]); // 3
        // // Accedemos al primer elemento del segundo array:
        // System.out.println(matriz[1][0]); // 8

        // for (int i = 0; i < matriz.length; i++) {
        // for (int j = 0; j < matriz[i].length; j++) {
        // matriz[i][j] = (int) (Math.random() * (6) + 1);

        // System.out.println(Arrays.toString(matriz[i]));
        // }
        // }

        // break y continue

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 0, 8, 9 },
                { 1, 0, 2 },
                { 4, 6, 7 }
        };
        // Programa que imprime sólo los números impares de cada fila hasta encontrar
        // el primer 0.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = matriz[i][j];
                // Ejemplo de uso de continue
                if (valor != 0 && valor % 2 == 0) {
                    continue; // Salta a la siguiente iteración sin ejecutar el

                    // código restante dentro del bucle interno

                }
                // Ejemplo de uso de break
                if (valor == 0) {
                    System.out.println("Se encontró el número 0 se detiene el bucle que recorre la fila i=" + i);

                    break; // Sale del bucle interno y continúa con la siguiente

                    // iteración del bucle externo

                }
                System.out.println("posición: [" + i + "," + j + "] Valor: " + valor);
            }
        }

    }
}
