package model;

public class Experiencia {

    private boolean voluntarioAnteriormente;
    private String experienciaPrevia;
    private String participacionEnProgramas;

    public Experiencia() {}

    public Experiencia(boolean voluntarioAnteriormente, String experienciaPrevia, String participacionEnProgramas) {
        this.voluntarioAnteriormente = voluntarioAnteriormente;
        this.experienciaPrevia = experienciaPrevia;
        this.participacionEnProgramas = participacionEnProgramas;
    }

    // getters y setters
    public boolean isVoluntarioAnteriormente() { return voluntarioAnteriormente; }
    public void setVoluntarioAnteriormente(boolean voluntarioAnteriormente) { this.voluntarioAnteriormente = voluntarioAnteriormente; }

    public String getExperienciaPrevia() { return experienciaPrevia; }
    public void setExperienciaPrevia(String experienciaPrevia) { this.experienciaPrevia = experienciaPrevia; }

    public String getParticipacionEnProgramas() { return participacionEnProgramas; }
    public void setParticipacionEnProgramas(String participacionEnProgramas) { this.participacionEnProgramas = participacionEnProgramas; }
}
