package PatronesDeDiseno.ObservadorSolucion;

import java.util.ArrayList;
import java.util.List;

class EstacionMeteorologica implements Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;
    private float humedad;
    private float presion;

    public void registrarObservador(Observador o) { observadores.add(o); }
    public void eliminarObservador(Observador o) { observadores.remove(o); }

    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura, humedad, presion);
        }
    }

      public void setMediciones(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        notificarObservadores();
    }
}