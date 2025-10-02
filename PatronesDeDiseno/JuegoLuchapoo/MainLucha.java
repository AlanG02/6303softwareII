package PatronesDeDiseno.JuegoLuchapoo;

import java.util.Scanner;

public class MainLucha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        Personaje jugador1 = new Guerrero(nombre1);
        Personaje jugador2 = new Mago(nombre2);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();

        scanner.close();
    }
}
