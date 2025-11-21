package model;

public class Capacitacion {
    private String tema;
    private String fecha;

    public Capacitacion(String tema, String fecha) {
        this.tema = tema;
        this.fecha = fecha;
    }

    public void mostrarCapacitacion() {
        System.out.println("Capacitación: " + tema + " (" + fecha + ")");
    }
}
