package model;

public class Motivacion {

    private String preguntaMotivacion;
    private String preguntaAporte;
    private String preguntaPresion;
    private String horarioColaborar;

    public Motivacion() {}

    public Motivacion(String preguntaMotivacion, String preguntaAporte, String preguntaPresion, String horarioColaborar) {
        this.preguntaMotivacion = preguntaMotivacion;
        this.preguntaAporte = preguntaAporte;
        this.preguntaPresion = preguntaPresion;
        this.horarioColaborar = horarioColaborar;
    }

    // getters y setters
    public String getPreguntaMotivacion() { return preguntaMotivacion; }
    public void setPreguntaMotivacion(String preguntaMotivacion) { this.preguntaMotivacion = preguntaMotivacion; }

    public String getPreguntaAporte() { return preguntaAporte; }
    public void setPreguntaAporte(String preguntaAporte) { this.preguntaAporte = preguntaAporte; }

    public String getPreguntaPresion() { return preguntaPresion; }
    public void setPreguntaPresion(String preguntaPresion) { this.preguntaPresion = preguntaPresion; }

    public String getHorarioColaborar() { return horarioColaborar; }
    public void setHorarioColaborar(String horarioColaborar) { this.horarioColaborar = horarioColaborar; }
}
