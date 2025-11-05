public class Chocolate extends BebidaDecorador {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", Chocolate";
    }

    @Override
    public double obtenerCosto() {
        return bebida.obtenerCosto() + 7.0;
    }
}
