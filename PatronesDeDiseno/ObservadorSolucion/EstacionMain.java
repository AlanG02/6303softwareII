package PatronesDeDiseno.ObservadorSolucion;

public class EstacionMain {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();
        Observador actual = new PantallaActual();
        Observador estadistica = new PantallaEstadistica();

        estacion.registrarObservador(actual);
        estacion.registrarObservador(estadistica);

        estacion.setMediciones(25.3f, 65f, 1013f);
        estacion.setMediciones(27.8f, 70f, 1012f);
        estacion.setMediciones(29.1f, 63f, 1010f);
    }
}