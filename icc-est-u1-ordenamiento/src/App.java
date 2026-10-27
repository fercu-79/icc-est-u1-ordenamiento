import java.util.Arrays;
import java.util.Comparator;
import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        // runEjemplosPrimitivos();
        runEjemplosObjetos();
        runComparaciones();
    }

    private static void runComparaciones() {
        Integer [] original = { 5, 6, 4, 1, 2, 3};
        // Arrays.sort - Ordena arreglos por su orden natural (ascendente) y sirve solo para arreglos de tipos primitivos y objetos que implementen la interfaz Comparable
        Arrays.sort(original);
        for (int i = 0; i < original.length; i++)
            System.out.print(original[i] + " - " );

        // Ordena de manera descendente, pero solo sirve para arreglos de objetos que implementen la interfaz Comparable
        Arrays.sort(original, Comparator.reverseOrder());
        System.out.println("Orden descendente");
        for (int i = 0; i < original.length; i++)
            System.out.print(original[i] + " - " );
    }

    private static void runEjemplosObjetos() {
        
        Estudiante e1 = new Estudiante("Juan", 10);
        
        Estudiante[] estudiantes = {e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8),
        };

        // Instanciar la clase Bubble
        Bubble bubble = new Bubble();
        System.out.println("--- Bubble Sort ---");
        System.out.println("Original");
        printArregloEstudiantes(estudiantes);
        bubble.sortEstudiantesnota(estudiantes);
        System.out.println("Ordenado");
        printArregloEstudiantes(estudiantes);
    }

    private static void runEjemplosPrimitivos() {
        int [] original = { 5, 6, 4, 1, 2, 3};
        int [] b = original.clone();
        int [] c = original.clone();
        int [] d = original.clone();

        // USAR METODO DEL ARCHIVO (clase) BUBBLE
        // INSTANCIAR el archivo BUBBLE
        // INSTANCIAR la clase BUBBLE

        Bubble bubble = new Bubble();
        System.out.println("--- Bubble Sort ---");
        System.out.println("Original");
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        // Instanciar la clase Seleccion
        System.out.println("--- Selection Sort ---");
        System.out.println("Original");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        // Instanciar la clase Insertion
        System.out.println("--- Insertion Sort ---");
        System.out.println("Original");
        Insertion insertion = new Insertion();
        printArreglo(d);
        insertion.sort(d);
        printArreglo(d);
    }
    public static void printArreglo(int [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - " );
        System.out.println();            
   }
 

    public static void printArregloEstudiantes(Estudiante[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " - " );
        }
        
        System.out.println();            
    }
}


