package model;

import java.time.LocalDate;

public class ReporteMantenimiento {
    
    private int id;
    private String descripcion;
    private LocalDate fecha;
    private String responsable;

    public ReporteMantenimiento() {}

    public ReporteMantenimiento(int id, String descripcion, LocalDate fecha, String responsable) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
