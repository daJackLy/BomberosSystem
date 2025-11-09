package bombersystem.model;

public class ReporteEmergencia {
    private String fecha;
    private String descripcion;

    public ReporteEmergencia(String fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public void mostrarReporte() {
        System.out.println("Reporte [" + fecha + "]: " + descripcion);
    }
}
