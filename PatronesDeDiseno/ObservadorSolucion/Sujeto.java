package PatronesDeDiseno.ObservadorSolucion;

interface Sujeto {
    void registrarObservador(Observador o);
    void eliminarObservador(Observador o);
    void notificarObservadores();
}