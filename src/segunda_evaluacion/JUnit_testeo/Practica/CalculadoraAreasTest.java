package segunda_evaluacion.JUnit_testeo.Practica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraAreasTest {
    @Test
    void CalculadoraAreaCirculo() {
        assertEquals(314.0, CalculadoraAreas.areaCirculo(10));
    }

    @Test
    void CalcularAreaRectangulo() {
        assertEquals(20, CalculadoraAreas.areaRectangulo(5, 4));
    }

    @Test
    void CalcularAreaMenu() {
//        assertEquals("Opcion invalida", CalculadoraAreas.menu("hola"));
    }
}