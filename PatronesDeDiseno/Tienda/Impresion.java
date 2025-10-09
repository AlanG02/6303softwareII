package PatronesDeDiseno.Tienda;

public class Impresion extends Producto {

    private String color;
    private Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Foto[] getFotos() {
        return fotos;
    }

    public void setFotos(Foto[] fotos) {
        this.fotos = fotos;
    }

   
    @Override
    public void mostrarInfo() {
        System.out.println("Impresión #" + getNumero() + " - Color: " + color);
        System.out.println("Fotos incluidas:");
        for (Foto f : fotos) {
            System.out.println(" - " + f.getFichero());
        }
    }
}
