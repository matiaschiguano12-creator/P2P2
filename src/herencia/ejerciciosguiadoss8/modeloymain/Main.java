package herencia.ejerciciosguiadoss8.modeloymain;

import herencia.ejerciciosguiadoss8.clases.Administrador;
import herencia.ejerciciosguiadoss8.clases.Cliente;
import herencia.ejerciciosguiadoss8.clases.Desarrollador;
import herencia.ejerciciosguiadoss8.clases.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Administrador(
                "admin1",
                "admin@demo.com",
                1);

        Usuario u2 = new Desarrollador(
                "dev1",
                "dev@demo.com",
                "Java");

        Usuario u3 = new Cliente(
                "cliente1",
                "cliente@demo.com",
                "Premium");

        SistemaUsuarios sistema = new SistemaUsuarios();

        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);

        System.out.println("LISTA DE USUARIOS");
        System.out.println(sistema.mostrarUsuarios());

        System.out.println("BUSCAR USUARIO");
        Usuario encontrado = sistema.buscarUsuario("dev1");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        }

        System.out.println("ELIMINAR USUARIO");
        System.out.println(sistema.eliminarUsuario("cliente1"));

        System.out.println("LISTA ACTUALIZADA");
        System.out.println(sistema.mostrarUsuarios());
    }
}