package PatronesDeDiseno.ObservadorSolucion;

class PantallaActual implements Observador {
    public void actualizar(float temperatura, float humedad, float presion) {
        System.out.println("Pantalla Actual -> Temp: " + temperatura +
                           "°C | Hum: " + humedad + "% | Pres: " + presion + " hPa");
    }
}
