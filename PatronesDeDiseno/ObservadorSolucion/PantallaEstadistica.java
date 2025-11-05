package PatronesDeDiseno.ObservadorSolucion;

import java.util.ArrayList;
import java.util.List;

public class PantallaEstadistica implements Observador {
    private List<Float> temperaturas = new ArrayList<>();

    public void actualizar(float temperatura, float humedad, float presion) {
        temperaturas.add(temperatura);
        float promedio = (float) temperaturas.stream().mapToDouble(Float::doubleValue).average().orElse(0);
        System.out.println("Pantalla Estadística -> Promedio temp: " + promedio + "°C");
    }
}