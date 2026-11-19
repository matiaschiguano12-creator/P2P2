package herencia.tiendaelectronica.modelo;

public class Dispositivo {
    private int codigo;
    private String marca;
    private boolean estado;

    public Dispositivo(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
        estado = true;
    }

    public String prender() {
        if (estado == false) {
            estado = true;
            return "Prendido";
        }
        return "Apagado";
    }

    public String apagar() {
        if (estado) {
            estado = false;
            return "Se ha apagado";
        }
        return "El dispositivo ya esta apagado";
    }

    public void mostrarInfo() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Marca: " + this.marca);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEstado() {
        return estado;
    }
}
