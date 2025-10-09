package PatronesDeDiseno.Tienda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRO DE CLIENTE ===");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = sc.nextLine();

        Cliente cliente = new Cliente(nombre, cedula);

       
        System.out.println("\n=== REGISTRO DE PRODUCTOS ===");
        System.out.print("¿Cuántos productos desea agregar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 

        Producto[] productos = new Producto[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nProducto #" + (i + 1));
            System.out.print("¿Qué tipo de producto desea agregar (camara/impresion)? ");
            String tipo = sc.nextLine().toLowerCase();

            System.out.print("Ingrese el número del producto: ");
            int numero = sc.nextInt();
            sc.nextLine(); 

            if (tipo.equals("camara")) {
                System.out.print("Ingrese la marca de la cámara: ");
                String marca = sc.nextLine();

                System.out.print("Ingrese el modelo de la cámara: ");
                String modelo = sc.nextLine();

                productos[i] = new Camara(numero, marca, modelo);

            } else if (tipo.equals("impresion")) {
                System.out.print("Ingrese el color de la impresión: ");
                String color = sc.nextLine();

                System.out.print("¿Cuántas fotos desea agregar a esta impresión? ");
                int numFotos = sc.nextInt();
                sc.nextLine(); 

                Foto[] fotos = new Foto[numFotos];
                for (int j = 0; j < numFotos; j++) {
                    System.out.print("Ingrese el nombre del archivo de la foto #" + (j + 1) + ": ");
                    String fichero = sc.nextLine();
                    fotos[j] = new Foto(fichero);
                }

                productos[i] = new Impresion(numero, color, fotos);
            } else {
                System.out.println("Tipo de producto no válido. Se omitirá.");
                i--;
            }
        }

   
        System.out.println("\n=== DATOS DE PAGO ===");
    System.out.print("Ingrese el número de la tarjeta de crédito (solo números): ");
    String numeroTarjeta = sc.nextLine();

      
    Pedido pedido = new Pedido(cliente, productos, numeroTarjeta);

      
        System.out.println("\n\n===== RESUMEN DEL PEDIDO =====");
        pedido.mostrarPedido();

        sc.close();
    }
}
