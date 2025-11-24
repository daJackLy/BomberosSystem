package factory;

import model.Ambulancia;
import model.CamionBomba;
import model.MotoRescate;
import model.Vehiculo;

public class VehiculoFactory {

    public static Vehiculo crearVehiculo(String tipo, String placa, int capacidad) {

        switch (tipo.toLowerCase()) {

            case "ambulancia":
                return new Ambulancia(placa, capacidad);

            case "camionbomba":
                return new CamionBomba(placa, capacidad);

            case "moto":
            case "motorescate":
                return new MotoRescate(placa, capacidad);

            default:
                throw new IllegalArgumentException("Tipo de vehículo no válido: " + tipo);
        }
    }
}
