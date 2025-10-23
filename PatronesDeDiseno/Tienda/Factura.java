package PatronesDeDiseno.Tienda;

import java.util.Date;

public class Factura {
    private int numeroFactura;
    private Pedido pedido;
    private Date fechaEmision;
    private double total;

    public Factura(int numeroFactura, Pedido pedido) {
        this.numeroFactura = numeroFactura;
        this.pedido = pedido;
        this.fechaEmision = new Date();
        this.total = calcularTotal();
    }

    private double calcularTotal() {
       
        return pedido.getProductos().length * 100.0;
    }

    public void imprimirFactura() {
        System.out.println("\n========== FACTURA ==========");
        System.out.println("Factura N°: " + numeroFactura);
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("\nProductos comprados:");
        for (Producto p : pedido.getProductos()) {
            p.mostrarInfo();
        }
        System.out.println("\nTotal a pagar: $" + total);
        System.out.println("=============================");
    }
}
