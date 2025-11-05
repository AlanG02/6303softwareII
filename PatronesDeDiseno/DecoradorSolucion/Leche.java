public class Leche extends BebidaDecorador {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", Leche";
    }

    @Override
    public double obtenerCosto() {
        return bebida.obtenerCosto() + 5.0;
    }
}
