package segunda_evaluacion.JUnit_testeo.Practica_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameDatabaseTest {
    private GameDatabase db;
    @BeforeEach
    void setUp() {
        db = new GameDatabase();
        db.addGame(new Videojuego(1,"The Legend of Zelda", "Aventura", 9.2));
        db.addGame(new Videojuego(2,"Age of Empires", "Estrategia", 8.5));
        db.addGame(new Videojuego(3,"Hollow Knight", "Aventura", 7.2));
    }
    @Test
    void addGame() {
        db.addGame(new Videojuego(4,"Resident Evil", "Terror", 9.1));
        assertEquals(4, db.getTotalGames());
    }
    @Test
    void removeGame() {
        db.removeGameById(2);
        assertNotEquals(3, db.getTotalGames());
    }
    @Test
    void EmptyArray() {
        db.clear();
        assertTrue(db.isEmpty());
    }
    @Test
    void getGenero() {
        db.getGamesByGenre("Aventura");
        assertFalse(db.getGamesByGenre("Estrategia").isEmpty());
    }
    @Test
    void noExistGame() {
        db.removeGameById(2);
        assertNull(db.getGameById(2));
    }
    @Test
    void getTotalGames() {
        db.getTotalGames();
        assertNotNull(db.getTotalGames());
    }
    @Test
    void testeo() {
        db.addGame(new Videojuego(2, "Age of Empires", "Estrategia", 8.5));
        assertTrue(db.getTotalGames() == 3);
    }
    @Test
    void testeo2() {
        db.removeGameById(5);
        assertNull(db.getGameById(5));
    }
    @Test
    void testeo3() {
        assertNull(db.getGameById(9));
    }
}