package model;

public class Salud {
    private boolean entrenamientoRegular;
    private boolean natacion;
    private boolean escalada;
    private boolean marcha;
    private boolean tareasCargaPeso;

    public Salud(boolean entrenamientoRegular, boolean natacion, boolean escalada, boolean marcha, boolean tareasCargaPeso) {
        this.entrenamientoRegular = entrenamientoRegular;
        this.natacion = natacion;
        this.escalada = escalada;
        this.marcha = marcha;
        this.tareasCargaPeso = tareasCargaPeso;
    }

    // getters
    public boolean isEntrenamientoRegular() { return entrenamientoRegular; }
    public boolean isNatacion() { return natacion; }
    public boolean isEscalada() { return escalada; }
    public boolean isMarcha() { return marcha; }
    public boolean isTareasCargaPeso() { return tareasCargaPeso; }
}
