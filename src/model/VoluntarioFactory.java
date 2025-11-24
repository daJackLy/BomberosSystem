package model;

public class VoluntarioFactory {

    public static Voluntario crearVoluntario(String tipo) {
        switch (tipo.toLowerCase()) {
            case "nuevo" -> {
                return new VoluntarioNuevo();
            }
            case "reingreso" -> {
                return new VoluntarioReingreso();
            }
            case "joven" -> {
                return new VoluntarioJoven();
            }
            default -> throw new IllegalArgumentException("Tipo de voluntario no válido: " + tipo);
        }
    }
}

