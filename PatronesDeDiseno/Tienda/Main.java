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
            System.out.print("¿Qué tipo de producto desea agregar (camara / impresion)? ");
            String tipo = sc.nextLine().toLowerCase();

            System.out.print("Ingrese el número del producto: ");
            int numero = sc.nextInt();
            sc.nextLine();

            ProductoFactory factory = null;

            switch (tipo) {

                case "camara":
                    System.out.print("Ingrese la marca de la cámara: ");
                    String marca = sc.nextLine();

                    System.out.print("Ingrese el modelo de la cámara: ");
                    String modelo = sc.nextLine();

                    // Usamos la fábrica de cámaras
                    factory = new CamaraFactory(numero, marca, modelo);
                    break;

                case "impresion":
                    System.out.print("Ingrese el color de la impresión: ");
                    String color = sc.nextLine();

                    System.out.print("¿Cuántas fotos desea incluir? ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    
                    FotoFactory[] fotoFactories = new FotoFactory[n];
                    for (int j = 0; j < n; j++) {
                        System.out.print("Nombre del archivo de la foto #" + (j + 1) + ": ");
                        String fichero = sc.nextLine();
                        fotoFactories[j] = new FotoFactory(fichero);
                    }

                  
                    factory = new ImpresionFactory(numero, color, fotoFactories);
                    break;

                default:
                    System.out.println("Tipo no válido. Intente de nuevo.");
                    i--;
                    continue;
            }

            productos[i] = factory.crearProducto();
        }

        System.out.println("\n=== DATOS DE PAGO ===");
        System.out.print("Ingrese el número de la tarjeta de crédito: ");
        String numeroTarjeta = sc.nextLine();

        Pedido pedido = new Pedido(cliente, productos, numeroTarjeta);

    
        System.out.println("\n=== RESUMEN DEL PEDIDO ===");
        pedido.mostrarPedido();


        Factura factura = new Factura(1, pedido);
        factura.imprimirFactura();

        sc.close();
    }
}
