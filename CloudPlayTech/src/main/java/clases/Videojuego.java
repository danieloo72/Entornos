package clases;

import enums.Genero;

public class Videojuego {
    protected String nombre;
    protected Genero genero;
    protected int velocidad_min_func;

    public Videojuego(String nombre, Genero genero, int velocidad_min_func) {
        this.nombre = nombre;
        this.genero = genero;
        this.velocidad_min_func = velocidad_min_func;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getVelocidad_min_func() {
        return velocidad_min_func;
    }

    public void setVelocidad_min_func(int velocidad_min_func) {
        this.velocidad_min_func = velocidad_min_func;
    }
}