package model;

public class Conductor {
    private String nombre;
    private String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void mostrarConductor() {
        System.out.println("Conductor: " + nombre + " - Licencia: " + licencia);
    }
}
