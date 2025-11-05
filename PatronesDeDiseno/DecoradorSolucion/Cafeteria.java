import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bebida pedido = null;

        System.out.println("=== Bienvenido a la Cafetería ===");
        System.out.println("Elija su bebida base:");
        System.out.println("1. Café");
        System.out.println("2. Té");
        System.out.print("Opción: ");
        int base = scanner.nextInt();

        if (base == 1) {
            pedido = new Cafe();
        } else if (base == 2) {
            pedido = new Te();
        } else {
            System.out.println("Opción no válida, se seleccionará Café por defecto.");
            pedido = new Cafe();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nAgregue ingredientes:");
            System.out.println("1. Leche (+$5)");
            System.out.println("2. Chocolate (+$7)");
            System.out.println("3. Crema (+$4)");
            System.out.println("4. Finalizar pedido");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pedido = new Leche(pedido);
                    break;
                case 2:
                    pedido = new Chocolate(pedido);
                    break;
                case 3:
                    pedido = new Crema(pedido);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        System.out.println("\n=== Resumen de tu pedido ===");
        System.out.println("Orden: " + pedido.obtenerDescripcion());
        System.out.println("Costo total: $" + pedido.obtenerCosto());
        System.out.println("============================");

        scanner.close();
    }
}
