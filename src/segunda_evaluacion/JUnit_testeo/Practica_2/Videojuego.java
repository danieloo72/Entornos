package segunda_evaluacion.JUnit_testeo.Practica_2;

public class Videojuego {

    private int id;
    private String titulo;
    private String genero;
    private double nota;

    public Videojuego(int id, String titulo, String genero, double nota) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getNota() {
        return nota;
    }
}

