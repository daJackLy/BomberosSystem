package bomberossystem;

import factory.VehiculoFactory;
import model.Vehiculo;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = VehiculoFactory.crearVehiculo("ambulancia", "ABC-123", 4);
        Vehiculo v2 = VehiculoFactory.crearVehiculo("camionbomba", "CB-987", 6);
        Vehiculo v3 = VehiculoFactory.crearVehiculo("moto", "MOTO-01", 1);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
