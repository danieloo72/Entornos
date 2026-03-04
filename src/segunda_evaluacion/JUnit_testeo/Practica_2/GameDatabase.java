package segunda_evaluacion.JUnit_testeo.Practica_2;

import java.util.ArrayList;
import java.util.List;

public class GameDatabase {

    private List<Videojuego> juegos = new ArrayList<>();

    public void addGame(Videojuego game) {
        if (game != null && getGameById(game.getId()) == null) {
            juegos.add(game);
        }
    }

    public boolean removeGameById(int id) {
        return juegos.removeIf(g -> g.getId() == id);
    }

    public Videojuego getGameById(int id) {
        for (Videojuego g : juegos) {
            if (g.getId() == id) {
                return g;
            }
        }
        return null;
    }

    public List<Videojuego> getGamesByGenre(String genero) {
        List<Videojuego> resultado = new ArrayList<>();
        for (Videojuego g : juegos) {
            if (g.getGenero().equalsIgnoreCase(genero)) {
                resultado.add(g);
            }
        }
        return resultado;
    }

    public int getTotalGames() {
        return juegos.size();
    }

    public boolean isEmpty() {
        return juegos.isEmpty();
    }

    public void clear() {
        juegos.clear();
    }
}

