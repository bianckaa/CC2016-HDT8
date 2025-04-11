public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String codigoEmergencia;
    private int ordenLlegada;

    public Paciente(String nombre, String sintoma, String codigoEmergencia, int ordenLlegada) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
        this.ordenLlegada = ordenLlegada;
    }

    @Override
    public int compareTo(Paciente otroPaciente) {
        int prioridad = this.codigoEmergencia.compareTo(otroPaciente.codigoEmergencia);
        if (prioridad != 0) {
            return prioridad;
        } else {
            return Integer.compare(this.ordenLlegada, otroPaciente.ordenLlegada);
        }
    }

    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigoEmergencia;
    }
}
