import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Estudiante;

public class Comparators {

    private List<Estudiante> estList;
    private Estudiante [] estArray;

    public Comparators() {
        Estudiante e1 = new Estudiante("Juan", 10);
        estArray = new Estudiante[] {e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 7),
            new Estudiante("Pedro", 6.8),
        };
        estList = new ArrayList<>(List.of(estArray));

        //Lamadas a los ejemplos
        ejemplo1();
        System.out.println("------------------------------------------");
        ejemplo2();
        System.out.println("------------------------------------------");
        ejemplo3();
        System.out.println("------------------------------------------");
        ejemplo4();
        System.out.println("------------------------------------------");
        ejemplo5();
        System.out.println("------------------------------------------");
        ejemplo6();
        System.out.println("------------------------------------------");
        ejemplo7();
        System.out.println("------------------------------------------");
        ejemplo8();
        System.out.println("------------------------------------------");
        ejemplo9();
        System.out.println("------------------------------------------");
        ejemplo10();
        System.out.println("------------------------------------------");
        ejemplo11();

    }

    // Imprimir
    private void print(List<Estudiante> list){
        // for est in list:
        for(Estudiante e : list ){
            System.out.println(e);
        }

    }

    /**
    * Ordenar por nota Ascendentemente 
    * Comparator -> por Valor
    * Lambda extractora directa: nota ascendente
    */
    public void ejemplo1(){
        System.out.println("Ejemplo 1");
        // copiar el arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        //Comparator -> Obj != (Envolvente de primitivo ni String)
        Comparator<Estudiante> comparador = Comparator.comparingDouble(x -> x.getNota());
        lista.sort(comparador);
        // Imprimir
        print(lista);
    }

    /**
     * Ordenar por nota Ascendentemente
     * Comparator -> por Valor
     * Referencia
     */
    public void ejemplo2(){
        System.out.println("Ejemplo 2");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante::getNota);
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nota Descendentemente
     * Comparator -> por Valor
     * Referencia
     */
    public void ejemplo3(){
        System.out.println("Ejemplo 3");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante::getNota).reversed();
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por Nombre Descendentemente
     * Comparator -> por Valor
     * Referencia
     */
    public void ejemplo4(){
        System.out.println("Ejemplo 4");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante::getNombre).reversed();
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nota Ascendentemente
     * Comparator -> compara DOS ITEMS
     * Lambda
     */
    public void ejemplo5(){
        System.out.println("Ejemplo 5");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1,e2) -> Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nombre Ascendentemente
     * Comparator -> compara DOS ITEMS
     * Lambda
     */
    public void ejemplo6(){
        System.out.println("Ejemplo 6");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1,e2) -> e1.getNombre().compareTo (e2.getNombre());
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nota Descendentemente
     * Comparator -> compara DOS ITEMS
     * Lambda
     */
    public void ejemplo7(){
        System.out.println("Ejemplo 7");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1,e2) -> Double.compare(e2.getNota(), e1.getNota());
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nota Ascendentemente y NOMBRE Descendente
     * Comparator -> compara DOS ITEMS
     * Lambda
     */
    public void ejemplo8(){
        System.out.println("Ejemplo 8");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1,e2) -> {
            int comparacionNota = Double.compare(e1.getNota(),e2.getNota());
            if (comparacionNota != 0) {
                return comparacionNota;
            } else {
                return e2.getNombre().compareTo (e1.getNombre());
            }};

        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nota Ascendentemente y NOMBRE Ascendente
     * Comparator -> por valor
     * Referencia
     */
    public void ejemplo9(){
        System.out.println("Ejemplo 9");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator =  Comparator
                .comparingDouble(Estudiante::getNota)
                .thenComparing(Comparator.comparing(Estudiante::getNombre).reversed());
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nota Descendentemente y NOMBRE Ascendente
     * Comparator -> por valor
     * 1 comparador lamda
     * 2 comparador referencia
     */
    public void ejemplo10(){
        System.out.println("Ejemplo 10");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
                .<Estudiante>comparingDouble(e -> e.getNota())
                .reversed()
                .thenComparing(Estudiante::getNombre);
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nota ajustada Ascendentemente y NOMBRE Descendente
     * Sumar 2 puntos si la nota es menor que 7
     * La nota maxima permitida es 10
     * Comparator -> por valor calculado
     * 1 comparador lamda con bloque de instrucciones
     * 2 comparador referencia con orden inverso
     */
    
    public void ejemplo11(){
        System.out.println("Ejemplo 11");
        List<Estudiante> lista = new ArrayList<>();
        for (Estudiante e : estList) {
            lista.add(new Estudiante(e.getNombre(), e.getNota()));
        }
        Comparator<Estudiante> comparator = Comparator
                .comparingDouble((Estudiante e) -> { 
                    double nota = e.getNota();
                    if (nota < 7){
                        nota += 2;
                    } 
                    if (nota > 10){
                        nota = 10;
                    }
                    return nota;
                })           
                .thenComparing(Comparator.comparing(Estudiante::getNombre).reversed());

        lista.sort(comparator);

        for (Estudiante e : lista) {
            double nota = e.getNota();
            if (nota < 7){
                nota += 2;
            } 
            if (nota > 10){
                nota = 10;
            }
            e.setNota(nota);
        }

        print(lista);
    }
    
}


