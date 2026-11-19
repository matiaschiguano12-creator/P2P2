package herencia.ejerciciosguiadoss8.clases;

public class Desarrollador extends Usuario {

    private String lenguaje;

    public Desarrollador(String username, String correo, String lenguaje) {
        super(username, correo);
        this.lenguaje = lenguaje;
    }

    @Override
    public String obtenerPermisos() {
        return "Gestionar y modificar código";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                ", Tipo: Desarrollador" +
                ", Lenguaje: " + lenguaje;
    }
}
