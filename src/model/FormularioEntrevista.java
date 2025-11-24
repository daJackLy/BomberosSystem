package model;

public class FormularioEntrevista {

    private Voluntario voluntario;
    
    // Secciones del formulario
    private DatosPersonales datosPersonales;
    private Salud salud;
    private Experiencia experiencia;
    private Motivacion motivacion;

    public FormularioEntrevista(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

    public Voluntario getVoluntario() { return voluntario; }
    public void setVoluntario(Voluntario voluntario) { this.voluntario = voluntario; }

    public DatosPersonales getDatosPersonales() { return datosPersonales; }
    public void setDatosPersonales(DatosPersonales datosPersonales) { this.datosPersonales = datosPersonales; }

    public Salud getSalud() { return salud; }
    public void setSalud(Salud salud) { this.salud = salud; }

    public Experiencia getExperiencia() { return experiencia; }
    public void setExperiencia(Experiencia experiencia) { this.experiencia = experiencia; }

    public Motivacion getMotivacion() { return motivacion; }
    public void setMotivacion(Motivacion motivacion) { this.motivacion = motivacion; }
}
