import models.Estudiante;

public class Bubble {

    public void sort( int [] arreglo) {
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Pasada: " + i);
            boolean combinaciones = false;
            // FOR J
            for (int j = 1; j < arreglo.length - i; j++) {
                // contador de comparaciones
                comparaciones++;
                // COMPARACION IF
                if (arreglo[j - 1] > arreglo[j]) {
                    // contador de cambios
                    cambios++;
                    // INTERCAMBIO
                    combinaciones = true;
                    int aux = arreglo [j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
            if (!combinaciones) {
                break;
            }
            System.out.println("Cambios: " + cambios); 
            System.out.println("Comparaciones: " + comparaciones);
        }
        System.out.println("Cambios: " + cambios); 
        System.out.println("Comparaciones: " + comparaciones); 
    } 
    
    public void sortEstudiantesnota(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            boolean combinaciones = false;
            for (int j = 0; j < estudiantes.length - i - 1; j++) {
                if (estudiantes[j].getNota() > estudiantes[j + 1].getNota()) {
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                    combinaciones = true;
                }
            }
            if (!combinaciones) {
                break;
            }
        }
    }

    public void sortEstudiantesnombre(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            boolean combinaciones = false;
            for (int j = 0; j < estudiantes.length - i - 1; j++) {
                if (estudiantes[j].getNombre().compareTo(estudiantes[j + 1].getNombre()) > 0) {
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                    combinaciones = true;
                }
            }
            if (!combinaciones) {
                break;
            }
        }
    }
}
