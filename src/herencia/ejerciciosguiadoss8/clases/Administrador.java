package herencia.ejerciciosguiadoss8.clases;

public class Administrador extends Usuario {

    private int nivelAdministracion;

    public Administrador(String username, String correo, int nivelAdministracion) {
        super(username, correo);
        this.nivelAdministracion = nivelAdministracion;
    }

    @Override
    public String obtenerPermisos() {
        return "Acceso total al sistema";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                ", Tipo: Administrador" +
                ", Nivel: " + nivelAdministracion;
    }
}