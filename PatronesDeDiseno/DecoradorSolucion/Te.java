public class Te implements Bebida {
    @Override
    public String obtenerDescripcion() {
        return "Té";
    }

    @Override
    public double obtenerCosto() {
        return 15.0;
    }
}
