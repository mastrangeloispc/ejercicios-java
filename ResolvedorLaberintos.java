import java.util.Scanner;
 public class ResolvedorLaberintos {
    public static void main(String[] args) {
        String[][] laberinto = {
                {"1", "1", "1", "1", "1"},
                {"1", "X", "0", "0", "S"},
                {"1", "1", "1", "1", "1"},
        };
        mostrarLaberinto(laberinto);
        resolverLaberinto(laberinto, 1, 1);
    }
     private static void resolverLaberinto(String[][] laberinto, int x, int y) {
        // Si se llega a la salida, se ha resuelto el laberinto
        if (laberinto[x][y].equals("S")) {
            mostrarLaberinto(laberinto);
            System.out.println("¡Felicidades, has resuelto el laberinto!");
            return;
        }
        // Marcar la posición actual como visitada
        laberinto[x][y] = "-";
        // Mover hacia la derecha
        if (y < laberinto[0].length - 1 && laberinto[x][y + 1].equals("0")) {
            resolverLaberinto(laberinto, x, y + 1);
        }
        // Mover hacia abajo
        if (x < laberinto.length - 1 && laberinto[x + 1][y].equals("0")) {
            resolverLaberinto(laberinto, x + 1, y);
        }
        // Mover hacia arriba
        if (x > 0 && laberinto[x - 1][y].equals("0")) {
            resolverLaberinto(laberinto, x - 1, y);
        }
        // Mover hacia la izquierda
        if (y > 0 && laberinto[x][y - 1].equals("0")) {
            resolverLaberinto(laberinto, x, y - 1);
        }
        // Desmarcar la posición actual como visitada
        laberinto[x][y] = "0";
        // Mostrar el laberinto después de cada movimiento
        mostrarLaberinto(laberinto);
    }
     private static void mostrarLaberinto(String[][] laberinto) {
        for (String[] fila : laberinto) {
            for (String celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
     private static void interactuarConUsuario(String[][] laberinto) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        int y = 1;
        while (!laberinto[x][y].equals("S")) {
            mostrarLaberinto(laberinto);
            System.out.println("¿Hacia dónde quieres moverte? (arriba=a, abajo=b, izquierda=i, derecha=d)");
            String direccion = scanner.nextLine();
            switch (direccion) {
                case "a":
                    if (x > 0 && laberinto[x - 1][y].equals("0")) {
                        laberinto[x][y] = "0";
                        x -= 1;
                    }
                    break;
                case "b":
                    if (x < laberinto.length - 1 && laberinto[x + 1][y].equals("0")) {
                        laberinto[x][y] = "0";
                        x += 1;
                    }
                    break;
                case "i":
                    if (y > 0 && laberinto[x][y - 1].equals("0")) {
                        laberinto[x][y] = "0";
                        y -= 1;
                    }
                    break;
                case "d":
                    if (y < laberinto[0].length - 1 && laberinto[x][y + 1].equals("0")) {
                        laberinto[x][y] = "0";
                        y += 1;
                    }
                    break;
                default:
                    System.out.println("Dirección no válida");
                    break;
            }
        }
        mostrarLaberinto(laberinto);
        System.out.println("¡Felicidades, has llegado a la salida!");
    }
}