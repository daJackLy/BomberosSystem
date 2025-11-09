package bombersystem.model;

public class Inventario {
    private String item;
    private int cantidad;

    public Inventario(String item, int cantidad) {
        this.item = item;
        this.cantidad = cantidad;
    }

    public void mostrarInventario() {
        System.out.println(item + ": " + cantidad + " unidades");
    }
}
