public class Crema extends BebidaDecorador {
    public Crema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", Crema";
    }

    @Override
    public double obtenerCosto() {
        return bebida.obtenerCosto() + 4.0;
    }
}
