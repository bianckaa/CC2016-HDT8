/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 8
 * Biancka Raxón 24960
 * 
 * Clase: Main.java
 * Clase que lee los datos de los pacientes desde un archivo de texto,
 * los agrega a una cola de prioridad y los atiende en orden de prioridad.
 * 
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    /** 
    * Método principal.
    * 
    * @param args Argumentos de línea de comando
    */
    public static void main(String[] args) {
        System.out.println("\n¡Bienvenido al programa de atención de emergencias del Hospital Curitas!");
    
        Scanner scanner = new Scanner(System.in); 
        IPriorityQueue<Paciente> cola = PriorityQueueFactory.crearCola(scanner);
    
        try (BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"))) {
            String linea;
            int orden = 0;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    cola.add(new Paciente(partes[0].trim(), partes[1].trim(), partes[2].trim(), orden++));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            scanner.close();
            return;
        }
    
        String opcion = "";
        while (!opcion.equals("2") && !cola.isEmpty()) {
            System.out.println("\nSeleccione lo que desea hacer a continuación: ");
            System.out.println("1. Atender siguiente paciente");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextLine();
    
            if (opcion.equals("1")) {
                Paciente paciente = cola.remove();
                System.out.println("Atendiendo a: " + paciente);
            } else if (!opcion.equals("2")) {
                System.out.println("Opción no válida.");
            }
        }
    
        if (cola.isEmpty()) {
            System.out.println("Ya no hay pacientes en espera.");
            System.out.println("Saliendo del programa...");
        }
    
        scanner.close();
    }    
}