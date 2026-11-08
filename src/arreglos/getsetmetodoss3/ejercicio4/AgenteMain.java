package arreglos.getsetmetodoss3.ejercicio4;

public class AgenteMain {
    public static void main(String[] args) {

        Agente[] agentes = new Agente[3];

        agentes[0] = new Agente("Alpha", 80, "Activo");
        agentes[1] = new Agente("Beta", 65, "Activo");
        agentes[2] = new Agente("Gamma", 40, "Inactivo");

        for(int i = 0; i < agentes.length; i++){
            agentes[i].mostrarEstado();
        }
    }
}
