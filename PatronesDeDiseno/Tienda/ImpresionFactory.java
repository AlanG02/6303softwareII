package PatronesDeDiseno.Tienda;

public class ImpresionFactory extends ProductoFactory {

    private int numero;
    private String color;
    private FotoFactory[] fotoFactories; 

    public ImpresionFactory(int numero, String color, FotoFactory[] fotoFactories) {
        this.numero = numero;
        this.color = color;
        this.fotoFactories = fotoFactories;
    }

    @Override
    public Producto crearProducto() {
        // Crear las fotos usando sus fábricas correspondientes
        Foto[] fotos = new Foto[fotoFactories.length];
        for (int i = 0; i < fotoFactories.length; i++) {
            fotos[i] = fotoFactories[i].crearFoto();
        }

    
        return new Impresion(numero, color, fotos);
    }
}
