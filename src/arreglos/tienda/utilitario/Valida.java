package arreglos.tienda.utilitario;

import java.util.Scanner;

public class Valida {
    private static Scanner sc = new Scanner(System.in);

    public static String leerString(String mensaje) {
        String valor;
        do {
            System.out.println(mensaje + ": ");
            valor = sc.nextLine();
            if (valor == null || valor.trim().isEmpty()) {
                System.out.println("El dato no puede estar vacio, Ingrese Nuevamente: ");
            }
        }while(valor == null || valor.trim().isEmpty());
        return valor;
    }


    //Completar las demas validaciones
    public static int leerInteger(String mensaje) {
        int valor = 0;
        do {
            System.out.println(mensaje + ": ");
            valor = sc.nextInt();
            if (valor < 0) {
                System.out.println("Dato incorrecto, Ingrese Nuevamente: ");
            }

        }while(valor <= 0);
        return valor;
    }

    public static double leerDouble(String mensaje) {
        double valor = 0;
        do {
            System.out.println(mensaje + ": ");
            valor = sc.nextDouble();
            if (valor <= 0) {
                System.out.println("Dato incorrecto, Ingrese Nuevamente: ");
            }
        }while(valor <= 0);
        return valor;
    }


}
