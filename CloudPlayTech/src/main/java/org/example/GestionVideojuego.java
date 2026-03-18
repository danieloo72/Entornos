package org.example;

import clases.Videojuego;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class GestionVideojuego {

    private List<Videojuego> catalogo = new ArrayList<>();

    public void añadirVideojuego(Videojuego videojuego) throws VideojuegoInvalidException {
        if (videojuego == null || videojuego.getNombre().isEmpty()) throw new VideojuegoInvalidException("Juego no válido");
        catalogo.add(videojuego);
    }

    public Videojuego buscarVideojuego(String nombre) {
        for (Videojuego videojuego : catalogo) {
            if (videojuego.getNombre().equalsIgnoreCase(nombre)) return videojuego;
        }
        return null;
    }

    public boolean comprobarCatalogo() throws CatalogoInvalidException {
        if (catalogo.isEmpty()) throw new CatalogoInvalidException("Catálogo vacío");
        return true;
    }
}