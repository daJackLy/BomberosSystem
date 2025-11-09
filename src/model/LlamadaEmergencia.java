package bombersystem.model;

public class LlamadaEmergencia {
    private String nombreCiudadano;
    private String mensaje;

    public LlamadaEmergencia(String nombreCiudadano, String mensaje) {
        this.nombreCiudadano = nombreCiudadano;
        this.mensaje = mensaje;
    }

    public void mostrarLlamada() {
        System.out.println("Llamada de " + nombreCiudadano + ": " + mensaje);
    }
}
