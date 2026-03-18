package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import clases.Videojuego;
import enums.Genero;
import exceptions.CatalogoInvalidException;
import exceptions.VideojuegoInvalidException;

class GestionVideojuegoTest {

    private GestionVideojuego gestion;
    private Videojuego juegoValido;

    @BeforeEach
    void setUp() {
        gestion = new GestionVideojuego();
        juegoValido = new Videojuego("Elden Ring", Genero.RPG, 50);
    }


    @Test
    void testAñadirVideojuegoExito() throws VideojuegoInvalidException {
        assertDoesNotThrow(() -> gestion.añadirVideojuego(juegoValido));
        assertEquals(juegoValido, gestion.buscarVideojuego("Elden Ring"));
    }

    @Test
    void testAñadirVideojuegoNullLanzaExcepcion() {
        assertThrows(VideojuegoInvalidException.class, () -> {
            gestion.añadirVideojuego(null);
        });
    }

    @Test
    void testAñadirVideojuegoNombreVacioLanzaExcepcion() {
        Videojuego juegoVacio = new Videojuego("", Genero.ACCION, 10);
        assertThrows(VideojuegoInvalidException.class, () -> {
            gestion.añadirVideojuego(juegoVacio);
        });
    }


    @Test
    void testBuscarVideojuegoEncontrado() throws VideojuegoInvalidException {
        gestion.añadirVideojuego(juegoValido);
        Videojuego encontrado = gestion.buscarVideojuego("Elden Ring");

        assertNotNull(encontrado);
        assertEquals("Elden Ring", encontrado.getNombre());
    }

    @Test
    void testBuscarVideojuegoNoEncontrado() {
        Videojuego encontrado = gestion.buscarVideojuego("Minecraft");
        assertNull(encontrado);
    }

    @Test
    void testBuscarVideojuegoIgnoraMayusculas() throws VideojuegoInvalidException {
        gestion.añadirVideojuego(juegoValido);
        assertNotNull(gestion.buscarVideojuego("elden ring"));
    }


    @Test
    void testComprobarCatalogoVacioLanzaExcepcion() {
        assertThrows(CatalogoInvalidException.class, () -> {
            gestion.comprobarCatalogo();
        });
    }

    @Test
    void testComprobarCatalogoConElementos() throws VideojuegoInvalidException, CatalogoInvalidException {
        gestion.añadirVideojuego(juegoValido);
        assertTrue(gestion.comprobarCatalogo());
    }
}