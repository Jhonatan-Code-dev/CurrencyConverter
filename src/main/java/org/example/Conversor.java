package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Conversor {

    public static void mostrarMenu() throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        ServicioConversion servicio = new ServicioConversion();
        ParserJson parser = new ParserJson();

        while (true) {
            System.out.println("\n=== Conversor de Monedas ===");
            System.out.println("1) USD → PEN");
            System.out.println("2) PEN → USD");
            System.out.println("3) USD → ARS");
            System.out.println("4) ARS → USD");
            System.out.println("5) USD → CLP");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opción: ");

            String entrada = teclado.nextLine();

            if (!entrada.matches("\\d+")) {
                System.out.println("Ingresa solo números. Inténtalo de nuevo.");
                continue;
            }

            int opcion = Integer.parseInt(entrada);

            if (opcion == 6) {
                System.out.println("Finalizando el programa...");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            String montoEntrada = teclado.nextLine();

            if (!montoEntrada.matches("\\d+(\\.\\d+)?")) {
                System.out.println("Ingresa un monto válido. Inténtalo de nuevo.");
                continue;
            }

            double monto = Double.parseDouble(montoEntrada);

            String base = "";
            String destino = "";

            switch (opcion) {
                case 1 -> { base = "USD"; destino = "PEN"; }
                case 2 -> { base = "PEN"; destino = "USD"; }
                case 3 -> { base = "USD"; destino = "ARS"; }
                case 4 -> { base = "ARS"; destino = "USD"; }
                case 5 -> { base = "USD"; destino = "CLP"; }
                default -> {
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    continue;
                }
            }

            String json = servicio.solicitarConversion(base, destino, monto);
            double resultado = parser.obtenerResultado(json);

            System.out.printf("\n✅ Resultado: %.2f %s → %.2f %s\n",
                    monto, base, resultado, destino);
        }
    }
}
