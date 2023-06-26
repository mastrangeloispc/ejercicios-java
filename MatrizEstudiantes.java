import java.util.Scanner;
 public class MatrizEstudiantes {
    public static void main(String[] args) {
        // Definir la matriz de estudiantes
        String[][] estudiantes = {
            {"Juan", "8.5", "Matemáticas"},
            {"María", "9.0", "Historia"},
            {"Pedro", "7.0", "Matemáticas"},
            {"Ana", "8.0", "Historia"}
        };
         // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
         // Mostrar el menú y solicitar la opción del usuario
        int opcion = 0;
        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar estudiantes");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Mostrar promedio general");
            System.out.println("4. Mostrar promedio por curso");
            System.out.println("5. Mostrar cantidad de estudiantes por curso");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
             switch(opcion) {
                case 1:
                    // Mostrar estudiantes
                    System.out.println("Listado de estudiantes:");
                    for (int i = 0; i < estudiantes.length; i++) {
                        System.out.println(estudiantes[i][0] + " - " + estudiantes[i][1] + " - " + estudiantes[i][2]);
                    }
                    break;
                case 2:
                    // Agregar estudiante
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el puntaje del estudiante: ");
                    String puntajeStr = sc.next();
                    Double puntaje = null;
                    try {
                        puntaje = Double.parseDouble(puntajeStr);
                        if (puntaje < 0.00 || puntaje > 10.00) {
                            System.out.println("El puntaje debe estar entre 0.00 y 10.00");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("El puntaje debe ser un número válido");
                        break;
                    }
                    System.out.print("Ingrese el curso del estudiante: ");
                    String curso = sc.next();
                    String[] nuevoEstudiante = {nombre, puntaje.toString(), curso};
                    String[][] nuevaMatriz = new String[estudiantes.length + 1][3];
                    for (int i = 0; i < estudiantes.length; i++) {
                        nuevaMatriz[i] = estudiantes[i];
                    }
                    nuevaMatriz[estudiantes.length] = nuevoEstudiante;
                    estudiantes = nuevaMatriz;
                    System.out.println("Estudiante agregado correctamente");
                    break;
                case 3:
                    // Mostrar promedio general
                    Double sumaPuntajes = 0.0;
                    for (int i = 0; i < estudiantes.length; i++) {
                        sumaPuntajes += Double.parseDouble(estudiantes[i][1]);
                    }
                    Double promedioGeneral = sumaPuntajes / estudiantes.length;
                    System.out.println("El promedio general es: " + promedioGeneral);
                    break;
                case 4:
                    // Mostrar promedio por curso
                    Double sumaPuntajesMatematicas = 0.0;
                    Double sumaPuntajesHistoria = 0.0;
                    int cantidadMatematicas = 0;
                    int cantidadHistoria = 0;
                    for (int i = 0; i < estudiantes.length; i++) {
                        if (estudiantes[i][2].equals("Matemáticas")) {
                            sumaPuntajesMatematicas += Double.parseDouble(estudiantes[i][1]);
                            cantidadMatematicas++;
                        } else if (estudiantes[i][2].equals("Historia")) {
                            sumaPuntajesHistoria += Double.parseDouble(estudiantes[i][1]);
                            cantidadHistoria++;
                        }
                    }
                    Double promedioMatematicas = sumaPuntajesMatematicas / cantidadMatematicas;
                    Double promedioHistoria = sumaPuntajesHistoria / cantidadHistoria;
                    System.out.println("El promedio de Matemáticas es: " + promedioMatematicas);
                    System.out.println("El promedio de Historia es: " + promedioHistoria);
                    break;
                case 5:
                    // Mostrar cantidad de estudiantes por curso
                    int cantidadEstudiantesMatematicas = 0;
                    int cantidadEstudiantesHistoria = 0;
                    for (int i = 0; i < estudiantes.length; i++) {
                        if (estudiantes[i][2].equals("Matemáticas")) {
                            cantidadEstudiantesMatematicas++;
                        } else if (estudiantes[i][2].equals("Historia")) {
                            cantidadEstudiantesHistoria++;
                        }
                    }
                    System.out.println("La cantidad de estudiantes en Matemáticas es: " + cantidadEstudiantesMatematicas);
                    System.out.println("La cantidad de estudiantes en Historia es: " + cantidadEstudiantesHistoria);
                    break;
                case 6:
                    // Salir
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 6);
         // Cerrar el objeto Scanner
        sc.close();
    }
}