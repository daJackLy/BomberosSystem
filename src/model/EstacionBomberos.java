package model;

import java.util.ArrayList;
import java.util.List;

public class EstacionBomberos {
    private String nombre;
    private String direccion;
    private List<UnidadEmergencia> unidades = new ArrayList<>();

    public EstacionBomberos(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarUnidad(UnidadEmergencia unidad) {
        unidades.add(unidad);
    }

    public void mostrarDatos() {
        System.out.println("Estación: " + nombre + " - Dirección: " + direccion);
        System.out.println("Unidades asignadas: " + unidades.size());
    }
}
