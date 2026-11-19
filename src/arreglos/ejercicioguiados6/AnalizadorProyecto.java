package arreglos.ejercicioguiados6;

public class AnalizadorProyecto {

    private Modulo[] modulos;

    public AnalizadorProyecto(Modulo[] modulos) {
        this.modulos = modulos;
    }

    public String listarModulos() {
        String resultado = "";

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                resultado += modulos[i].mostrarInformacion() + "\n";
            }
        }

        return resultado;
    }

    public int contarTerminados() {
        int contador = 0;

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && modulos[i].isTerminado()) {
                contador++;
            }
        }

        return contador;
    }

    public double calcularProgresoPromedio() {
        int suma = 0;
        int cantidad = 0;

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                suma += modulos[i].getProgreso();
                cantidad++;
            }
        }

        if (cantidad == 0) {
            return 0;
        }

        return (double) suma / cantidad;
    }

    public Modulo buscarModulo(String nombre) {
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null &&
                    modulos[i].getNombre().equals(nombre)) {
                return modulos[i];
            }
        }

        return null;
    }

    // Desafío adicional
    public Modulo obtenerMenorProgreso() {

        Modulo menor = null;

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {

                if (menor == null ||
                        modulos[i].getProgreso() < menor.getProgreso()) {

                    menor = modulos[i];
                }
            }
        }

        return menor;
    }
}
