/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 8
 * Biancka Raxón 24960
 * 
 * Clase: PriorityQueueFactory.java
 * Clase que permite crear una cola de prioridad utilizando dos implementaciones: una propia basada en VectorHeap
 * o la implementación del Java Collection Framework PriorityQueue.
 * 
*/
import java.util.Scanner;

public class PriorityQueueFactory {
    /**
     * Crea y retorna una cola de prioridad según la opción ingresada por el usuario.
     * 
     * @return una implementación de IPriorityQueue que maneja objetos de tipo Paciente.
     */
    public static IPriorityQueue<Paciente> crearCola(Scanner scanner) {
        String opcion = "";
        boolean opcionValida = false;
    
        while (!opcionValida) {
            System.out.println("\nSeleccione el tipo de cola de prioridad a utilizar:");
            System.out.println("1. Implementación propia (VectorHeap)");
            System.out.println("2. Java Collection Framework (PriorityQueue)");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextLine();
    
            if (opcion.equals("1") || opcion.equals("2")) {
                opcionValida = true;  
            } else {
                System.out.println("Error: Por favor, ingrese 1 o 2.");
            }
        }
    
        if (opcion.equals("1")) {
            return new AdaptadorVectorHeap<Paciente>();
        } else {
            return new AdaptadorMyPriorityQueue<Paciente>();
        }
    }
    
}
