package model;

import java.time.LocalDate;


public abstract class Voluntario implements InterfaceVoluntario{
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected LocalDate fechaNac;
    protected int edad;
    protected String distrito;
    protected String telefono;
    protected String email;
    protected String especialidad;
    protected String direccion;
    protected String ocupacion;
    protected String tipoRegistro;
    protected String disponibilidad;

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }
    
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    
    public int getEdad() {
        return edad;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getDetalle() {
        return "Voluntario: " + (nombres != null ? nombres : "Vacío") + " " + (apellidos != null ? apellidos : "Vacío") + "\n" +
               "DNI: " + (dni != null ? dni : "Vacío") + "\n" +
               "Fecha de nacimiento: " + (fechaNac != null ? fechaNac : "Vacío") + "\n" +
               "Edad: " + (edad > 0 ? edad : 0) + "\n" +
               "Distrito: " + (distrito != null ? distrito : "Vacío") + "\n" +
               "Dirección: " + (direccion != null ? direccion : "Vacío") + "\n" +
               "Teléfono: " + (telefono != null ? telefono : "Vacío") + "\n" +
               "Email: " + (email != null ? email : "Vacío") + "\n" +
               "Ocupación: " + (ocupacion != null ? ocupacion : "Vacío") + "\n" +
               "Especialidad: " + (especialidad != null ? especialidad : "Vacío") + "\n" +
               "Tipo de registro: " + (tipoRegistro != null ? tipoRegistro : "Vacío") + "\n" +
               "Disponibilidad: " + (disponibilidad != null ? disponibilidad : "Vacío");
    }
}
