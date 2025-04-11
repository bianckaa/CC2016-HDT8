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

public class Main {
    /** 
    * Método principal.
    * 
    * @param args Argumentos de línea de comando
    */
    public static void main(String[] args) {
        IPriorityQueue<Paciente> cola = PriorityQueueFactory.crearCola();

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
            return;
        }

        System.out.println("Atención de pacientes:");
        while (!cola.isEmpty()) {
            System.out.println(cola.remove());
        }
    }
}
