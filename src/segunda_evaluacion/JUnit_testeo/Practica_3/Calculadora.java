package segunda_evaluacion.JUnit_testeo.Practica_3;

import java.lang.reflect.Array;

public class Calculadora {

    public double dividir(int a, int b) {
        return a / b;
    }

    public int ObtenerElemento(int[] array, int posicion) {
        if (array == null) {
            System.out.println("Array nulo");
        }
        if (posicion < 0 || posicion >= array.length) {
            System.out.println("Fuera de rango");
        }
        return array[posicion];
    }

    public boolean esPar(int numero) {
        if  (numero % 2 == 0) {
            System.out.println("El número es par");
            return true;
        } else {
            System.out.println("El número no es par");
            return false;
        }
    }
}
