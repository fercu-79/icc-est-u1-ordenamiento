public class Selection {

    public void sort (int [] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        for ( int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + " - ");
            int min = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;

                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            if (min != i){ 
                int temp = arreglo[min]; 
                arreglo[min] = arreglo[i]; 
                arreglo[i] = temp;
                cambios++;
            System.out.println("Pasada= " + i + " " + "|" + "Cambios= " + arreglo[min] + "<->" + arreglo[i]);
            
            }

        }
        System.out.println("Cambios: " + cambios); 
        System.out.println("Comparaciones: " + comparaciones); 
        System.out.println("Ordenado Asc");
        
    }
}
