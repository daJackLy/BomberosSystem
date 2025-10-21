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
            case "traslado" -> {
                return new VoluntarioTraslado();
            }
            case "juvenil" -> {
                return new VoluntarioJoven();
            }
            default -> throw new IllegalArgumentException("No reconocido");
        }
    }
}
