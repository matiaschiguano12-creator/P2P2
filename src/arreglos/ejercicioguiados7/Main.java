package arreglos.ejercicioguiados7;

public class Main {

    public static void main(String[] args) {

        Desarrollador d1 =
                new Desarrollador("D01", "Ana",
                        "Backend", 20);

        Desarrollador d2 =
                new Desarrollador("D02", "Luis",
                        "Frontend", 15);

        Desarrollador d3 =
                new Desarrollador("D03", "Carlos",
                        "Base de Datos", 25);

        Proyecto proyecto =
                new Proyecto("Sistema de Ventas");

        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        System.out.println("=== EQUIPO ===");
        System.out.println(proyecto.mostrarEquipo());

        System.out.println("=== BUSCAR D02 ===");
        Desarrollador encontrado =
                proyecto.buscarDesarrollador("D02");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        }

        System.out.println("=== TOTAL HORAS ===");
        System.out.println(proyecto.calcularTotalHoras());

        System.out.println("=== ELIMINAR D02 ===");
        System.out.println(
                proyecto.eliminarDesarrollador("D02")
        );

        System.out.println("=== EQUIPO ACTUALIZADO ===");
        System.out.println(proyecto.mostrarEquipo());
    }
}
