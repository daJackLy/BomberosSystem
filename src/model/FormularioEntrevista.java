package model;

public class FormularioEntrevista {
    private DatosPersonales datosPersonales;
    private Salud salud;
    private Experiencia experiencia;
    private Motivacion motivacion;

    public FormularioEntrevista(DatosPersonales datosPersonales, Salud salud,
                                Experiencia experiencia, Motivacion motivacion) {
        this.datosPersonales = datosPersonales;
        this.salud = salud;
        this.experiencia = experiencia;
        this.motivacion = motivacion;
    }

    // getters
    public DatosPersonales getDatosPersonales() { return datosPersonales; }
    public Salud getSalud() { return salud; }
    public Experiencia getExperiencia() { return experiencia; }
    public Motivacion getMotivacion() { return motivacion; }
}
