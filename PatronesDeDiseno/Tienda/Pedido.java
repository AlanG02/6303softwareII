package PatronesDeDiseno.Tienda;

import java.util.Date;

public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, int numeroTarjetaCredito) {
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

    public int getNumeroTarjetaCredito() {
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

    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

   
    public void mostrarPedido() {
        System.out.println("=== Detalles del Pedido ===");
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de tarjeta: ****" + (numeroTarjetaCredito % 10000)); 
        System.out.println("Productos en el pedido:");
        for (Producto p : productos) {
            p.mostrarInfo(); 
        }
    }
}
