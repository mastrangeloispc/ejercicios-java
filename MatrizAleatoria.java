import java.util.Scanner;
 public class MatrizAleatoria {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano, maximo, minimo;
         System.out.print("Ingrese el tamaño deseado de la matriz: ");
        tamano = sc.nextInt();
         System.out.print("Ingrese el valor máximo permitido para los elementos: ");
        maximo = sc.nextInt();
         System.out.print("Ingrese el valor mínimo permitido para los elementos: ");
        minimo = sc.nextInt();
         int[][] matriz = crearMatriz(tamano, maximo, minimo);
         mostrarMenu(matriz);
    }
     public static int[][] crearMatriz(int tamano, int maximo, int minimo) {
        int[][] matriz = new int[tamano][tamano];
         for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
            }
        }
         return matriz;
    }
     public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
     public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
         return suma;
    }
     public static int buscarMaximo(int[][] matriz) {
        int maximo = matriz[0][0];
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }
         return maximo;
    }
     public static int buscarMinimo(int[][] matriz) {
        int minimo = matriz[0][0];
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
        }
         return minimo;
    }
     public static int contarPares(int[][] matriz) {
        int cantidad = 0;
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    cantidad++;
                }
            }
        }
         return cantidad;
    }
     public static int contarImpares(int[][] matriz) {
        int cantidad = 0;
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    cantidad++;
                }
            }
        }
         return cantidad;
    }
     public static int[][] invertirMatriz(int[][] matriz) {
        int[][] matrizInvertida = new int[matriz.length][matriz[0].length];
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizInvertida[i][j] = matriz[matriz.length - 1 - i][matriz[i].length - 1 - j];
            }
        }
         return matrizInvertida;
    }
     public static int[][] transponerMatriz(int[][] matriz) {
        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
         return matrizTranspuesta;
    }
     public static void mostrarMenu(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        int opcion;
         do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Generar matriz.");
            System.out.println("2. Mostrar matriz.");
            System.out.println("3. Sumar todos los elementos de la matriz.");
            System.out.println("4. Imprimir número más grande.");
            System.out.println("5. Imprimir número más pequeño.");
            System.out.println("6. Imprimir cantidad de números pares.");
            System.out.println("7. Imprimir cantidad de números impares.");
            System.out.println("8. Imprimir una matriz en orden inverso.");
            System.out.println("9. Imprimir transposición de la matriz.");
            System.out.println("10. Salir.");
            System.out.print("Ingrese la opción deseada: ");
            opcion = sc.nextInt();
             switch (opcion) {
                case 1:
                    matriz = crearMatriz(matriz.length, 10, 1);
                    System.out.println("Matriz generada.");
                    break;
                case 2:
                    mostrarMatriz(matriz);
                    break;
                case 3:
                    System.out.println("La suma de todos los elementos de la matriz es: " + sumarMatriz(matriz));
                    break;
                case 4:
                    System.out.println("El número más grande de la matriz es: " + buscarMaximo(matriz));
                    break;
                case 5:
                    System.out.println("El número más pequeño de la matriz es: " + buscarMinimo(matriz));
                    break;
                case 6:
                    System.out.println("La cantidad de números pares en la matriz es: " + contarPares(matriz));
                    break;
                case 7:
                    System.out.println("La cantidad de números impares en la matriz es: " + contarImpares(matriz));
                    break;
                case 8:
                    mostrarMatriz(invertirMatriz(matriz));
                    break;
                case 9:
                    mostrarMatriz(transponerMatriz(matriz));
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 10);
    }
 }