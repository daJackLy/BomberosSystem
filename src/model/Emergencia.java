package bombersystem.model;

public class Emergencia {
    private String tipo;
    private String ubicacion;

    public Emergencia(String tipo, String ubicacion) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
    }

    public void mostrarEmergencia() {
        System.out.println("Emergencia: " + tipo + " en " + ubicacion);
    }
}
