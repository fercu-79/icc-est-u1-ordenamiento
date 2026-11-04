package models;

import java.util.Comparator;

public class Estudiante implements Comparable<Estudiante> {

    private String nombre;
    private double nota;

    //Constructor lleno
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Constructor vacio
    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // @Override
    // public String toString() {
    //     return "Estudiante [" + nombre + ", " + nota +"]";
    // }
    /**
    * Orden Natural
    * 1. Nota Ascendente
    * 2. Nombre Ascendente en el caso de que las notas sean iguales
    * @param o obbjeto tipo estudiante con el cual voy a comparar
    * @return indice de comparacion ( + , - , 0)
    */
    // @Override
    // public int compareTo(Estudiante e2) {
    //     int comparacionNota = Double.compare(this.getNota(), e2.getNota());
    //     if (comparacionNota != 0) 
    //         return comparacionNota;
    //    return this.getNombre().compareTo(e2.getNombre());
    // }

    /**
     * Orden Natural
    * 1. Nota Ascendente
    * 2. Nombre Ascendente en el caso de que las notas sean iguales
    * @param o obbjeto tipo estudiante con el cual voy a comparar
    * @return indice de comparacion ( + , - , 0)
    */
    @Override
    public int compareTo(Estudiante e2) {
        return Comparator
                .comparingDouble(Estudiante::getNota)
                .thenComparing(Estudiante::getNombre)
                .compare(this, e2);
    }

}





