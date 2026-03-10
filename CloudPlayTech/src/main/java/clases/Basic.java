package clases;

import java.util.List;

public abstract class Basic extends Plan {
    public Basic (int velocidad_max, int partidas_activas, List<String> catalogo) {
        super(velocidad_max, partidas_activas, catalogo);
    }
}
