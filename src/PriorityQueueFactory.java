import java.util.Scanner;

public class PriorityQueueFactory {
    public static IPriorityQueue<Paciente> crearCola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de cola de prioridad:");
        System.out.println("1. Implementación propia (VectorHeap)");
        System.out.println("2. Java Collections (PriorityQueue)");
        System.out.print("Opción: ");
        String opcion = scanner.nextLine();
        scanner.close();
        
        if (opcion.equals("1")) {
            return new AdaptadorVectorHeap<Paciente>();
        } else {
            return new AdaptadorMyPriorityQueue<Paciente>();
        }
    }
}
