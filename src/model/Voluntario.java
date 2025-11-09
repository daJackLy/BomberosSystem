package model;

public class Voluntario {
    private String nombre;
    private String estado;

    public Voluntario(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Estado: " + estado);
    }
}
