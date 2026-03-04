package segunda_evaluacion.JUnit_testeo;

public class TiendaDescuentos {

    /**
     * Calcula el precio aplicando descuentos por volumen:
     * - 10 o más artículos: 10% de descuento.
     * - 50 o más artículos: 25% de descuento.
     */
    public double calcularPrecioFinal(double precioUnitario, int cantidad) {
        double total = precioUnitario * cantidad;

        if (cantidad >= 10 && cantidad < 50) {
            total = total * 0.90; // Aplica 10%
        } else if (cantidad >= 50) {
            total = total * 0.75; // Aplica 25%
        }

        return total;
    }
}

