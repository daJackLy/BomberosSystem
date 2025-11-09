package bombersystem.model;

public class Ciudadano {
    private String nombre;
    private String telefono;

    public Ciudadano(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void mostrarCiudadano() {
        System.out.println(nombre + " - Tel: " + telefono);
    }
}
