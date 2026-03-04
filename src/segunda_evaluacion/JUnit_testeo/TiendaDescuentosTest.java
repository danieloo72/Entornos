package segunda_evaluacion.JUnit_testeo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TiendaDescuentosTest {
    TiendaDescuentos tienda = new TiendaDescuentos();

    @Test
    void testVentaNormal() {
        // 2 unidades a 10€ = 20€
        assertEquals (20.0, tienda.calcularPrecioFinal(10.0, 2));
    }

    @Test
    void testDescuento10() {
        //12 unidades a 10€ = 12€ con 10% descuento. Precio final 108€
        assertEquals(108.0, tienda.calcularPrecioFinal(10.0, 12));
    }

    @Test
    void testDescuento25() {
        //50 unidades a 10€ = 500€ con 25% descuento. Precio final 375€
        assertEquals(375.0, tienda.calcularPrecioFinal(10.0, 50));
    }
}
