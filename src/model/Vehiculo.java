package model;

public class Vehiculo {
    private String placa;
    private String tipo; // Ambulancia, CamionBomba, Moto, etc.
    private String estado; // Disponible, En servicio, Mantenimiento
    private int capacidad;

    public Vehiculo() {}

    public Vehiculo(String placa, String tipo, String estado, int capacidad) {
        this.placa = placa;
        this.tipo = tipo;
        this.estado = estado;
        this.capacidad = capacidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
