package PatronesDeDiseno.Herencia;

public class Trabajador {

    private int id;
    private String nombre;

    public Trabajador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public double pagar() {
        return 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
