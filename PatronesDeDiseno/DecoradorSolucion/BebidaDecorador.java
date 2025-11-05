public abstract class BebidaDecorador implements Bebida {
       protected Bebida bebida;

    public BebidaDecorador(Bebida bebida) {
        this.bebida = bebida;
    }
}
