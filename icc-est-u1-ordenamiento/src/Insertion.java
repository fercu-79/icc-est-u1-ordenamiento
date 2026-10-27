public class Insertion {

    public void sort (int[] a){
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] < key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            if ((j + 1) != i){
                System.out.println("El aux = " + key + "se inserta en la posición " + (j + 1));
            }

            
        
        }
        System.out.println("Ordenado Descendente");
    }
}
 