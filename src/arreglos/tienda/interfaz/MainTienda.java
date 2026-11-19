package arreglos.tienda.interfaz;

import arreglos.tienda.modelo.AppStore;
import arreglos.tienda.modelo.Juego;
import arreglos.tienda.utilitario.Valida;

import javax.swing.*;
import java.util.Scanner;

public class MainTienda {
    private static Scanner sc = new Scanner(System.in);
    private static AppStore tienda = new AppStore();

    static void main() {
        int opc;
        tienda.cargarDatos();
        do {
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1: {
                    ingresarJuegos();
                }
                break;
                case 2: {
                    mostrarJuegos();
                }
                break;
                case 3: {
                    buscarJuegos();
                }
                break;
                case 4: {
                    comprar();
                }
                break;
                case 5: {
                    vender();
                }
                break;
                case 6: {
                    juegoMasVendido();
                }
                break;
                case 7: {
                    System.out.println("Gracias por usar.");
                }
                break;
            }
        } while (opc != 7);
    }

    public static void menu() {
        System.out.println("**********Appstore UDLA*********");
        System.out.println("1. Ingresar Juego");
        System.out.println("2. Mostar Juegos");
        System.out.println("3. Buscar Juego");
        System.out.println("4. Comprar");
        System.out.println("5. Vender");
        System.out.println("6. Juego mas vendido");
        System.out.println("7. Salir");
        System.out.println("Seleccionar Opcion: ");
    }

    public static void ingresarJuegos() {
        System.out.println("**********Ingreso de datos**********");

        String nombre = Valida.leerString("Ingrese el nombre");

        String categoria = Valida.leerString("Ingrese la categoria");

        int tamano = Valida.leerInteger("Ingrese la tamano");

        double precio = Valida.leerDouble("Ingresar el precio");

        int licenciasDisponibles = Valida.leerInteger("Ingresar stock inicial");

        if (tienda.agregarJuego(new Juego(nombre, categoria, tamano, precio, licenciasDisponibles))){
            JOptionPane.showMessageDialog(null, "Juego agregado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "El juego no pudo ser agregado");
        }
    }

    public static void mostrarJuegos() {
        Juego juegos[] = tienda.getJuegos();
        if(tienda.getIndice() >= 0) {
            for (int i = 0; i <= tienda.getIndice(); i++) {
                System.out.println(juegos[i]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay juegos dentro de la Appstore");
        }
    }

    public static void buscarJuegos() {
        String nombre = Valida.leerString("Ingrese el nombre del juego:");

        Juego juego = tienda.buscarJuego(nombre);

        if (juego != null) {
            JOptionPane.showMessageDialog(null, juego);
        } else {
            JOptionPane.showMessageDialog(null, "Juego no encontrado");
        }
    }

    public static void comprar() {
        String nombre = Valida.leerString("Ingrese el nombre del juego");
        int cantidad = Valida.leerInteger("Ingrese la cantidad a agregar al stock");

        if (tienda.comprar(nombre, cantidad)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Stock actualizado correctamente"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No se pudo actualizar el stock"
            );
        }
    }

    public static void vender() {
        String nombre = Valida.leerString("Ingrese el nombre del juego");
        int cantidad = Valida.leerInteger("Ingrese la cantidad de licencias a vender");

        double total = tienda.vender(nombre, cantidad);

        if (total > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "Venta realizada correctamente.\nTotal: $" + total
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No se pudo realizar la venta."
            );
        }
    }

    public static void juegoMasVendido() {
        String nombre = tienda.masVendido();

        if (!nombre.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Juego más vendido: " + nombre
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No hay juegos registrados."
            );
        }
    }

}