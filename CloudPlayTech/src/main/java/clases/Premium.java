package clases;

import java.util.List;

public abstract class Premium extends Plan {
    public Premium(int velocidad_max, int partidas_activas, List<String> catalogo) {
        super(velocidad_max, partidas_activas, catalogo);
    }
}
