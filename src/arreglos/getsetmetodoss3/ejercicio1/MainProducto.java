package arreglos.getsetmetodoss3.ejercicio1;

public class Main {
    public static void main(String[] args) {

        ProductoDigital[] productos = new ProductoDigital[3];

        productos[0] = new ProductoDigital("Laptop", 850.50, 10);
        productos[1] = new ProductoDigital("Mouse", 25.00, 15);
        productos[2] = new ProductoDigital("Teclado", 40.00, 20);

        System.out.println("LISTA DE PRODUCTOS");

        for(int i = 0; i < productos.length; i++){
            productos[i].mostrarInfo();
        }
    }
}
