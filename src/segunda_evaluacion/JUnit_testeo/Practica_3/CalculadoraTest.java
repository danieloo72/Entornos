package segunda_evaluacion.JUnit_testeo.Practica_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    void dividirB0() {
        assertThrows(ArithmeticException.class, () -> {calculadora.dividir(4, 0);});
    }

    @Test
    void dividirNegativo() {
        assertEquals(2,calculadora.dividir(-6, -3));
    }

    @Test
    void arrayNull() {
        assertThrows(NullPointerException.class, () -> {calculadora.ObtenerElemento(null,0);});
    }

    @Test
    void arrayPosicion() {
        int[] array = {1, 2, 3};
        assertThrows(IndexOutOfBoundsException.class, () -> {calculadora.ObtenerElemento(array, 8);});
    }

    @Test
    void numPar() {
        assertTrue(calculadora.esPar(8));
    }

    @Test
    void numImpar() {
        assertFalse(calculadora.esPar(3));
    }

    @Test
    void numNegativo() {
        assertTrue(calculadora.esPar(-6));
        assertFalse(calculadora.esPar(-7));
    }

}