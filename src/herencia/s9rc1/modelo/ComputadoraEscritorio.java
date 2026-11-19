package herencia.s9rc1.modelo;

public class ComputadoraEscritorio extends Producto {

    private String tipoGabinete;

    public ComputadoraEscritorio(int id, String nombre, double precio,
                                 int stock, String tipoGabinete) {

        super(id, nombre, precio, stock);
        this.tipoGabinete = tipoGabinete;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Gabinete: " + tipoGabinete);
    }
}