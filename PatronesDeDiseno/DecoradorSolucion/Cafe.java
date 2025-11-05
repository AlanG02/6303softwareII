public class Cafe implements Bebida {
    @Override
    public String obtenerDescripcion() {
        return "Café";
    }

    @Override
    public double obtenerCosto() {
        return 20.0;
    }
}