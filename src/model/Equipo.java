package model;

public class Equipo {
    private String nombre;
    private int cantidad;

    public Equipo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void mostrarEquipo() {
        System.out.println(nombre + " (Cantidad: " + cantidad + ")");
    }
}
