package PatronesDeDiseno.Observer1;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}