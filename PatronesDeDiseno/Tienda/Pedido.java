package PatronesDeDiseno.Tienda;

import java.util.Date;

public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private String numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, String numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = new Date();
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("\n=== DETALLES DEL PEDIDO ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta: ****" + numeroTarjetaCredito.substring(numeroTarjetaCredito.length() - 4));
        System.out.println("\nProductos adquiridos:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
}

