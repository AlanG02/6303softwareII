package PatronesDeDiseno.JuegoLuchapoo;

public abstract class Personaje {
    private String nombre;
    private int puntoDeVida;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntoDeVida = 100;
    }


    public abstract void atacar(Personaje oponente);

    public void recibirDano(int dano) {
        this.puntoDeVida -= dano;
        if (this.puntoDeVida < 0) {
            this.puntoDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntoDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntoDeVida() {
        return puntoDeVida;
    }
}

