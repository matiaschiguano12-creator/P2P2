package herencia.s9rc1.modelo;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    public void mostrarProductos() {

        if (productos.isEmpty()) {
            System.out.println("No existen productos registrados.");
            return;
        }

        for (Producto p : productos) {
            p.mostrarInformacion();
            System.out.println("----------------------");
        }
    }

    public Producto buscarProducto(int id) {

        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }
}
