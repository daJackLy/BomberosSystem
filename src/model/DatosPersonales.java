package model;

public class DatosPersonales {

    private String direccion;
    private String distrito;
    private String referencia;
    private String correo;
    private int telefono;

    public DatosPersonales() {}

    public DatosPersonales(String direccion, String distrito, String referencia, String correo, int telefono) {
        this.direccion = direccion;
        this.distrito = distrito;
        this.referencia = referencia;
        this.correo = correo;
        this.telefono = telefono;
    }

    // getters y setters
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }
}
