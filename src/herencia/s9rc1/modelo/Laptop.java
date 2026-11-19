package herencia.s9rc1.modelo;

public class Laptop extends Producto {

    private double peso;

    public Laptop(int id, String nombre, double precio, int stock, double peso) {
        super(id, nombre, precio, stock);
        this.peso = peso;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Peso: " + peso + " kg");
    }
}
