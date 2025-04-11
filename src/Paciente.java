/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 8
 * Biancka Raxón 24960
 * 
 * Clase: Paciente.java
 * Clase que implementa la interfaz Comparable para ordenar pacientes por su código de emergencia
 * 
*/

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String codigoEmergencia;
    private int ordenLlegada;

    /**
     * Constructor para crear un paciente con la información proporcionada.
     * 
     * @param nombre el nombre del paciente.
     * @param sintoma el síntoma que presenta el paciente.
     * @param codigoEmergencia el código de emergencia del paciente.
     * @param ordenLlegada el orden de llegada del paciente.
     */
    public Paciente(String nombre, String sintoma, String codigoEmergencia, int ordenLlegada) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
        this.ordenLlegada = ordenLlegada;
    }

    /**
     * Compara dos pacientes por su código de emergencia y, en caso de empate, por el orden de llegada.
     * 
     * @param otroPaciente el otro paciente con el que comparar.
     * @return un valor negativo si el paciente actual tiene mayor prioridad, 
     *         un valor positivo si el otro paciente tiene mayor prioridad, 
     *         o cero si son iguales en prioridad.
     */
    @Override
    public int compareTo(Paciente otroPaciente) {
        int prioridad = this.codigoEmergencia.compareTo(otroPaciente.codigoEmergencia);
        if (prioridad != 0) {
            return prioridad;
        } else {
            return Integer.compare(this.ordenLlegada, otroPaciente.ordenLlegada);
        }
    }

    /**
     * Devuelve una representación en formato de cadena del paciente.
     * 
     * @return una cadena que representa al paciente con su nombre, síntoma y código de emergencia.
     */
    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigoEmergencia;
    }
}
