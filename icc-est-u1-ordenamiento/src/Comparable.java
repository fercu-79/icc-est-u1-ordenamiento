import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Estudiante;

public class Comparable {
    
    private List<Estudiante> estList;
    private Estudiante [] estArray;

    public Comparable() {
        Estudiante e1 = new Estudiante("Juan", 10);
        estArray = new Estudiante[] {e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 7),
            new Estudiante("Pedro", 6.8),
        };
        estList = new ArrayList<>(List.of(estArray));

       //ejemplo1();
       ejemplo2();
       ejemplo3();
    }

    private void ejemplo1() {
        System.out.println("Ejemplo 1: ");
        int x = 10;  int y = 20;
        int compInt = Integer.compare(x, y);
        String a = "Hola"; String b = "hola";
        int compStr = a.compareTo(b);
        Estudiante e1 = estList.get(0);
        Estudiante e2 = estList.get(1);
        int compEst = e1.compareTo(e2);
        estList.sort(null);
    }
    
    // Orden Natural Ascendente
    private void ejemplo2() {
        System.out.println("Ejemplo 2: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        lista.sort(null);
        print(lista);
                
    }
    private void print(List<Estudiante> lista) {
        for (Estudiante e : lista) {
            System.out.println(e);
        }
    }
    
    // Orden Natural Descendente
    // Comparable -> Orden Natural invertido
    private void ejemplo3() {
        System.out.println("Ejemplo 3: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        lista.sort(Comparator.reverseOrder());
        print(lista);

    }

}
