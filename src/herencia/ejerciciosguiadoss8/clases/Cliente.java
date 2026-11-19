package herencia.ejerciciosguiadoss8.clases;

public class Cliente extends Usuario {

    private String plan;

    public Cliente(String username, String correo, String plan) {
        super(username, correo);
        this.plan = plan;
    }

    @Override
    public String obtenerPermisos() {
        return "Uso de servicios del sistema";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                ", Tipo: Cliente" +
                ", Plan: " + plan;
    }
}
