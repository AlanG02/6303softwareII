package PatronesDeDiseno.Tienda;

public class FotoFactory {

    private String fichero;

    public FotoFactory(String fichero) {
        this.fichero = fichero;
    }

    public Foto crearFoto() {
        return new Foto(fichero);
    }
}
