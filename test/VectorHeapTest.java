import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class VectorHeapTest {

    private VectorHeap<Paciente> heap;

    @Before
    public void setUp() {
        heap = new VectorHeap<>();
    }

    @Test
    public void shouldAddPatientsCorrectly() {
        Paciente p1 = new Paciente("Juan Perez", "fractura de pierna", "C", 0);
        Paciente p2 = new Paciente("Maria Ramirez", "apendicitis", "A", 1);

        heap.add(p1);
        heap.add(p2);

        assertFalse(heap.isEmpty());
    }

    @Test
    public void shouldBeRemovedOrderOfPriority() {
        Paciente p1 = new Paciente("Carlos", "Fractura", "C", 1);
        Paciente p2 = new Paciente("Beatriz", "Apendicitis", "A", 0);
        Paciente p3 = new Paciente("Daniel", "Resfriado", "D", 2);

        heap.add(p1);
        heap.add(p2);
        heap.add(p3);

        assertEquals(p2, heap.remove()); 
        assertEquals(p1, heap.remove()); 
        assertEquals(p3, heap.remove()); 
    }

    @Test
    public void shouldRemoveFistComerIfAreEquals() {
        Paciente p1 = new Paciente("Luis", "Dolor abdominal", "B", 0);
        Paciente p2 = new Paciente("Mario", "Dolor abdominal", "B", 1);

        heap.add(p1);
        heap.add(p2);

        assertEquals(p1, heap.remove()); // Llega primero
        assertEquals(p2, heap.remove());
    }

    @Test
    public void shouldCheckEmptyHeap() {
        assertTrue(heap.isEmpty());
        heap.add(new Paciente("Lina", "Fiebre", "C", 0));
        assertFalse(heap.isEmpty());
    }

    @Test
    public void shouldNotRemoveIfEmpty() {
        assertTrue(heap.isEmpty());
        assertNull(heap.remove());
        assertNull(heap.peek());
    }
}
