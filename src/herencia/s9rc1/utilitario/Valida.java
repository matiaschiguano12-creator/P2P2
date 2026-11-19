package herencia.s9rc1.utilitario;

import java.util.Scanner;

import java.util.Scanner;

public class Valida {

    private static Scanner sc = new Scanner(System.in);

    public static String leerString(String mensaje) {

        String valor;

        do {
            System.out.print(mensaje + ": ");
            valor = sc.nextLine();

            if (valor == null || valor.trim().isEmpty()) {
                System.out.println("Error. El dato no puede estar vacio.");
            }

        } while (valor == null || valor.trim().isEmpty());

        return valor;
    }

    public static int leerEntero(String mensaje) {

        int valor;

        do {

            System.out.print(mensaje + ": ");

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese un numero entero valido.");
                sc.next();
                System.out.print(mensaje + ": ");
            }

            valor = sc.nextInt();
            sc.nextLine();

            if (valor <= 0) {
                System.out.println("El numero debe ser mayor que cero.");
            }

        } while (valor <= 0);

        return valor;
    }

    public static double leerDouble(String mensaje) {

        double valor;

        do {

            System.out.print(mensaje + ": ");

            while (!sc.hasNextDouble()) {
                System.out.println("Ingrese un numero valido.");
                sc.next();
                System.out.print(mensaje + ": ");
            }

            valor = sc.nextDouble();
            sc.nextLine();

            if (valor <= 0) {
                System.out.println("El numero debe ser mayor que cero.");
            }

        } while (valor <= 0);

        return valor;
    }
}