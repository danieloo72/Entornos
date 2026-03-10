package clases;

import java.util.List;

public class Plan {

    private int velocidad_max;
    private int partidas_activas;
    private List<String> catalogo;

    public Plan(int velocidad_max, int partidas_activas, List<String> catalogo) {
        this.velocidad_max = velocidad_max;
        this.partidas_activas = partidas_activas;
        this.catalogo = catalogo;
    }

    public int getVelocidad_max() {
        return velocidad_max;
    }

    public void setVelocidad_max(int velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    public int getPartidas_activas() {
        return partidas_activas;
    }

    public void setPartidas_activas(int partidas_activas) {
        this.partidas_activas = partidas_activas;
    }

    public List<String> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<String> catalogo) {
        this.catalogo = catalogo;
    }
}
