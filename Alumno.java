
package com.mycompany.alumno;

public class Alumno {

    // Atributos
    String nombre;
    double[] calificaciones;

    // Constructor
    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método para imprimir los resultados
    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método principal
    public static void main(String[] args) {

        String nombre = "Enrique Alvarado";

        double[] calificaciones = {85, 90, 78, 92, 88};

        Alumno alumno = new Alumno(nombre, calificaciones);

        double promedio = alumno.calcularPromedio(calificaciones);

        char calificacion = alumno.obtenerCalificacion(promedio);

        alumno.imprimirResultados(nombre, promedio, calificacion);
    }
}