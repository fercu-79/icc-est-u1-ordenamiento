public class App {
    public static void main(String[] args) throws Exception {
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
}
