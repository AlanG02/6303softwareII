package PatronesDeDiseno.JuegoLuchapoo;

import java.util.Random;

public class Guerrero extends Personaje {
    private final int MIN_DANO = 10;
    private final int MAX_DANO = 30;
    private Random rand = new Random();

    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = rand.nextInt(MAX_DANO - MIN_DANO + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(getNombre() + " (Guerrero) golpea a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}
