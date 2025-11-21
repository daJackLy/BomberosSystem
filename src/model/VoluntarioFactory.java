package model;

public class VoluntarioFactory {

    public static Voluntario crearVoluntario(String tipo) {
        tipo = tipo.toLowerCase();
        switch (tipo) {
            case "nuevo":
                return new Voluntario("Nuevo Voluntario", "Activo");
            case "reingreso":
                return new Voluntario("Voluntario Reingresado", "Activo");
            case "traslado":
                return new Voluntario("Voluntario Trasladado", "Pendiente");
            case "juvenil":
                return new Voluntario("Voluntario Juvenil", "En formación");
            default:
                throw new IllegalArgumentException("Tipo no reconocido: " + tipo);
        }
    }
}
