package model;

public class Motivacion {
    private String preguntaMotivacion;
    private String preguntaAporte;
    private String preguntaPresion;
    private boolean participacionCapacitacionesIniciales;

    public Motivacion(String preguntaMotivacion, String preguntaAporte, String preguntaPresion,
                      boolean participacionCapacitacionesIniciales) {
        this.preguntaMotivacion = preguntaMotivacion;
        this.preguntaAporte = preguntaAporte;
        this.preguntaPresion = preguntaPresion;
        this.participacionCapacitacionesIniciales = participacionCapacitacionesIniciales;
    }

    // getters
    public String getPreguntaMotivacion() { return preguntaMotivacion; }
    public String getPreguntaAporte() { return preguntaAporte; }
    public String getPreguntaPresion() { return preguntaPresion; }
    public boolean isParticipacionCapacitacionesIniciales() { return participacionCapacitacionesIniciales; }
}
