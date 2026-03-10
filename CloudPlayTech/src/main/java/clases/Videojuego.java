package clases;

public class Videojuego {

    protected String nombre;
    protected enum Genero;
    protected int velocidad_min_func;

    public Videojuego(String nombre, int velocidad_min_func) {
        this.nombre = nombre;
        this.velocidad_min_func = velocidad_min_func;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad_min_func() {
        return velocidad_min_func;
    }

    public void setVelocidad_min_func(int velocidad_min_func) {
        this.velocidad_min_func = velocidad_min_func;
    }
}
