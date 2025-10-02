package PatronesDeDiseno.JuegoLuchapoo;

import java.util.Random;

public class Mago extends Personaje {
    private final int MIN_DANO = 15;
    private final int MAX_DANO = 40;
    private Random rand = new Random();

    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = rand.nextInt(MAX_DANO - MIN_DANO + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(getNombre() + " (Mago) lanza un hechizo a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}
