package arreglos.getsetmetodoss3.ejercicio2scanner;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX = 3;
        Usuario[] usuarios = new Usuario[MAX];

        int indice = 0;
        int opc;

        do {

            System.out.println("\n--- MENU USUARIOS ---");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Mostrar usuario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {

                case 1:

                    if (indice < MAX) {

                        System.out.print("Nombre de usuario: ");
                        String nombre = sc.nextLine();

                        System.out.print("Correo: ");
                        String correo = sc.nextLine();

                        System.out.print("Contraseña: ");
                        String contra = sc.nextLine();

                        usuarios[indice] = new Usuario();
                        usuarios[indice].setNombreUsuario(nombre);
                        usuarios[indice].setCorreo(correo);
                        usuarios[indice].setContrasena(contra);

                        indice++;

                        System.out.println("Usuario agregado.");

                    } else {
                        System.out.println("No hay mas espacio en el arreglo.");
                    }

                    break;

                case 2:

                    System.out.print("Ingrese el indice (0 a " + (indice - 1) + "): ");
                    int pos = Integer.parseInt(sc.nextLine());

                    if (pos >= 0 && pos < indice) {
                        usuarios[pos].mostrarDatos();
                    } else {
                        System.out.println("Indice invalido.");
                    }

                    break;

                case 3:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opcion incorrecta.");

            }

        } while (opc != 3);

        sc.close();
    }
}
