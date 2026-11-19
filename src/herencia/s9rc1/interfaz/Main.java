package herencia.s9rc1.interfaz;

import herencia.s9rc1.modelo.Inventario;
import herencia.s9rc1.modelo.Laptop;
import herencia.s9rc1.utilitario.Valida;

public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        int id = Valida.leerEntero("Ingrese ID");
        String nombre = Valida.leerString("Ingrese nombre");
        double precio = Valida.leerDouble("Ingrese precio");
        int stock = Valida.leerEntero("Ingrese stock");
        double peso = Valida.leerDouble("Ingrese peso en kg");

        Laptop laptop =
                new Laptop(id, nombre, precio, stock, peso);

        inventario.agregarProducto(laptop);

        System.out.println("\nPRODUCTOS REGISTRADOS");
        inventario.mostrarProductos();
    }
}
