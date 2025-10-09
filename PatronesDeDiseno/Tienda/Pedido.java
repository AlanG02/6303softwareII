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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("=== Detalles del Pedido ===");
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);

        if (numeroTarjetaCredito != null && numeroTarjetaCredito.length() >= 4) {
            System.out.println(
                    "Número de tarjeta: ****" + numeroTarjetaCredito.substring(numeroTarjetaCredito.length() - 4));
        } else {
            System.out.println("Número de tarjeta: ****");
        }
        System.out.println("Productos en el pedido:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
}
