package model;

public class UnidadEmergencia {
    private String codigo;
    private String tipo;

    public UnidadEmergencia(String codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("Unidad " + codigo + " - Tipo: " + tipo);
    }
}
