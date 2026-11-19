package arreglos.ejercicioguiados6;

public class Main {
    public static void main(String[] args) {

        Modulo[] modulos = new Modulo[5];

        modulos[0] = new Modulo("Autenticación", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Facturación", "Python", 90, false);
        modulos[3] = new Modulo("Reportes", "C#", 100, true);
        modulos[4] = new Modulo("Seguridad", "JavaScript", 60, false);

        AnalizadorProyecto analizador =
                new AnalizadorProyecto(modulos);

        System.out.println("=== LISTA DE MODULOS ===");
        System.out.println(analizador.listarModulos());

        System.out.println("Terminados: "
                + analizador.contarTerminados());

        System.out.println("Progreso promedio: "
                + analizador.calcularProgresoPromedio() + "%");

        Modulo encontrado =
                analizador.buscarModulo("Autenticación");

        if (encontrado != null) {
            System.out.println("Modulo encontrado:");
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Modulo no encontrado");
        }

        Modulo noExiste =
                analizador.buscarModulo("Pagos");

        if (noExiste == null) {
            System.out.println("El modulo 'Pagos' no existe.");
        }

        Modulo menor = analizador.obtenerMenorProgreso();

        if (menor != null) {
            System.out.println("Modulo con menor progreso:");
            System.out.println(menor.mostrarInformacion());
        }
    }
}
