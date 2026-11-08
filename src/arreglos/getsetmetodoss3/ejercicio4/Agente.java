package arreglos.getsetmetodoss3.ejercicio4;

public class Agente {

    private String nombre;
    private int nivelEnergia;
    private String estado;

    public Agente(String nombre, int nivelEnergia, String estado) {
        this.nombre = nombre;
        this.nivelEnergia = nivelEnergia;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Energia: " + nivelEnergia);
        System.out.println("Estado: " + estado);
        System.out.println();
    }
}
