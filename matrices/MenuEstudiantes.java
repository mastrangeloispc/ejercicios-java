import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 public class MenuEstudiantes {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        HashMap<String, ArrayList<Estudiante>> cursos = new HashMap<>();
         int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar estudiantes");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Mostrar promedio general");
            System.out.println("4. Mostrar promedio por curso");
            System.out.println("5. Mostrar cantidad de estudiantes por curso");
            System.out.println("6. Salir");
             opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
             switch (opcion) {
                case 1:
                    mostrarEstudiantes(estudiantes);
                    break;
                case 2:
                    agregarEstudiante(estudiantes, cursos, sc);
                    break;
                case 3:
                    mostrarPromedioGeneral(estudiantes);
                    break;
                case 4:
                    mostrarPromedioPorCurso(cursos);
                    break;
                case 5:
                    mostrarCantidadPorCurso(cursos);
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }
     public static void mostrarEstudiantes(ArrayList<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante.toString());
            }
        }
    }
     public static void agregarEstudiante(ArrayList<Estudiante> estudiantes, HashMap<String, ArrayList<Estudiante>> cursos, Scanner sc) {
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el curso del estudiante:");
        String curso = sc.nextLine();
        System.out.println("Ingrese el puntaje del estudiante:");
        String puntajeStr = sc.nextLine();
         double puntaje;
        try {
            puntaje = Double.parseDouble(puntajeStr);
            if (puntaje < 0.0 || puntaje > 10.0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("El puntaje debe ser un número entre 0.00 y 10.00. Intente de nuevo.");
            return;
        }
         Estudiante estudiante = new Estudiante(nombre, puntaje, curso);
        estudiantes.add(estudiante);
        cursos.computeIfAbsent(curso, k -> new ArrayList<>()).add(estudiante);
         System.out.println("Estudiante agregado exitosamente.");
    }
     public static void mostrarPromedioGeneral(ArrayList<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            double sumaPuntajes = 0.0;
            for (Estudiante estudiante : estudiantes) {
                sumaPuntajes += estudiante.getPuntaje();
            }
            double promedio = sumaPuntajes / estudiantes.size();
            System.out.println("El promedio general es: " + promedio);
        }
    }
     public static void mostrarPromedioPorCurso(HashMap<String, ArrayList<Estudiante>> cursos) {
        if (cursos.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Promedio por curso:");
            for (String curso : cursos.keySet()) {
                double sumaPuntajes = 0.0;
                ArrayList<Estudiante> estudiantesCurso = cursos.get(curso);
                for (Estudiante estudiante : estudiantesCurso) {
                    sumaPuntajes += estudiante.getPuntaje();
                }
                double promedio = sumaPuntajes / estudiantesCurso.size();
                System.out.println(curso + ": " + promedio);
            }
        }
    }
     public static void mostrarCantidadPorCurso(HashMap<String, ArrayList<Estudiante>> cursos) {
        if (cursos.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Cantidad de estudiantes por curso:");
            for (String curso : cursos.keySet()) {
                ArrayList<Estudiante> estudiantesCurso = cursos.get(curso);
                System.out.println(curso + ": " + estudiantesCurso.size());
            }
        }
    }
}
 class Estudiante {
    private String nombre;
    private double puntaje;
    private String curso;
     public Estudiante(String nombre, double puntaje, String curso) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.curso = curso;
    }
     public String getNombre() {
        return nombre;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public double getPuntaje() {
        return puntaje;
    }
     public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
     public String getCurso() {
        return curso;
    }
     public void setCurso(String curso) {
        this.curso = curso;
    }
     @Override
    public String toString() {
        return nombre + " - " + puntaje + " - " + curso;
    }
}