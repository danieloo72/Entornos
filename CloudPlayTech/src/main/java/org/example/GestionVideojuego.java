package org.example;

import clases.Videojuego;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class GestionVideojuego {

    private List<Videojuego> catalogo = new ArrayList<>();

    public void añadirVideojuego(Videojuego v) throws VideojuegoInvalidException {
        if (v == null || v.getNombre().isEmpty()) throw new VideojuegoInvalidException("Juego no válido");
        catalogo.add(v);
    }

    public Videojuego buscarVideojuego(String nombre) {
        for (Videojuego v : catalogo) {
            if (v.getNombre().equalsIgnoreCase(nombre)) return v;
        }
        return null;
    }

    public boolean comprobarCatalogo() throws CatalogoInvalidException {
        if (catalogo.isEmpty()) throw new CatalogoInvalidException("Catálogo vacío");
        return true;
    }
}