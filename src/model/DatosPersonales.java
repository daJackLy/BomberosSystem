package model;

public class DatosPersonales {
    private String nombres;
    private String apellidos;
    private int dni;
    private String fechaNacimiento;
    private int edad;
    private String sexo;
    private String correo;
    private int telefono;
    private boolean poseeLicencia;
    private String distrito;
    private String direccion;
    private String referencia;

    // constructor
    public DatosPersonales(String nombres, String apellidos, int dni, String fechaNacimiento,
                           int edad, String sexo, String correo, int telefono,
                           boolean poseeLicencia, String distrito, String direccion, String referencia) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.sexo = sexo;
        this.correo = correo;
        this.telefono = telefono;
        this.poseeLicencia = poseeLicencia;
        this.distrito = distrito;
        this.direccion = direccion;
        this.referencia = referencia;
    }

    // getters
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public int getDni() { return dni; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public int getEdad() { return edad; }
    public String getSexo() { return sexo; }
    public String getCorreo() { return correo; }
    public int getTelefono() { return telefono; }
    public boolean isPoseeLicencia() { return poseeLicencia; }
    public String getDistrito() { return distrito; }
    public String getDireccion() { return direccion; }
    public String getReferencia() { return referencia; }
}
