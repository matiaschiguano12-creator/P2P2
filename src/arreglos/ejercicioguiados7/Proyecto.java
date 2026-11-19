package arreglos.ejercicioguiados7;

import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    public void agregarDesarrollador(Desarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    public Desarrollador buscarDesarrollador(String identificacion) {

        for (Desarrollador desarrollador : desarrolladores) {
            if (desarrollador.getIdentificacion().equals(identificacion)) {
                return desarrollador;
            }
        }

        return null;
    }

    public boolean eliminarDesarrollador(String identificacion) {

        Desarrollador desarrollador =
                buscarDesarrollador(identificacion);

        if (desarrollador != null) {
            desarrolladores.remove(desarrollador);
            return true;
        }

        return false;
    }

    public double calcularTotalHoras() {

        double total = 0;

        for (Desarrollador desarrollador : desarrolladores) {
            total += desarrollador.getHorasAsignadas();
        }

        return total;
    }

    public String mostrarEquipo() {

        String resultado = "Proyecto: " + nombre + "\n";

        for (Desarrollador desarrollador : desarrolladores) {
            resultado += desarrollador.mostrarInformacion() + "\n";
        }

        return resultado;
    }

    public Desarrollador obtenerMayorCarga() {

        if (desarrolladores.isEmpty()) {
            return null;
        }

        Desarrollador mayor = desarrolladores.get(0);

        for (Desarrollador desarrollador : desarrolladores) {
            if (desarrollador.getHorasAsignadas() >
                    mayor.getHorasAsignadas()) {

                mayor = desarrollador;
            }
        }

        return mayor;
    }
}
