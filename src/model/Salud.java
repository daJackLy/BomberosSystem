package model;

public class Salud {

    private boolean entrenamientoRegular;
    private boolean natacion;
    private boolean escalada;
    private boolean tareasCargaPeso;
    private String impedimentoFisico;

    public Salud() {}

    public Salud(boolean entrenamientoRegular, boolean natacion, boolean escalada, boolean tareasCargaPeso, String impedimentoFisico) {
        this.entrenamientoRegular = entrenamientoRegular;
        this.natacion = natacion;
        this.escalada = escalada;
        this.tareasCargaPeso = tareasCargaPeso;
        this.impedimentoFisico = impedimentoFisico;
    }

    // getters y setters
    public boolean isEntrenamientoRegular() { return entrenamientoRegular; }
    public void setEntrenamientoRegular(boolean entrenamientoRegular) { this.entrenamientoRegular = entrenamientoRegular; }

    public boolean isNatacion() { return natacion; }
    public void setNatacion(boolean natacion) { this.natacion = natacion; }

    public boolean isEscalada() { return escalada; }
    public void setEscalada(boolean escalada) { this.escalada = escalada; }

    public boolean isTareasCargaPeso() { return tareasCargaPeso; }
    public void setTareasCargaPeso(boolean tareasCargaPeso) { this.tareasCargaPeso = tareasCargaPeso; }

    public String getImpedimentoFisico() { return impedimentoFisico; }
    public void setImpedimentoFisico(String impedimentoFisico) { this.impedimentoFisico = impedimentoFisico; }
}
