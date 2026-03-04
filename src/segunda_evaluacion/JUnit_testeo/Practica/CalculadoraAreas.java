package segunda_evaluacion.JUnit_testeo.Practica;

import java.util.Scanner;

import static java.lang.System.in;

public class CalculadoraAreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        System.out.println("--- GeoCalc v1.0 (Java Edition) ---");
        System.out.print("Seleccione (1) Círculo o (2) Rectángulo: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Introduce el radio: ");
            double radio = sc.nextDouble();
            // Especificación dice: Pi * r * r
            double area = 3.14 * radio * radio;
            System.out.println("Resultado: " + area);

        } else if (opcion == 2) {
            System.out.print("Introduce la base: ");
            double base = sc.nextDouble();
            System.out.print("Introduce la altura: ");
            double altura = sc.nextDouble();
            // Especificación dice: base * altura
            double area = base + altura;
            System.out.println("Resultado: " + area);
        }
    }

    public static double areaCirculo(double radio) {
            double area = 3.14 * radio * radio;
            System.out.println("Resultado: " + area);
            return area;
    }

    public static double areaRectangulo(double base, double altura) {
        double area = base + altura;
        System.out.println("Resultado: " + area);
        return area;
    }

    public static void menu(Scanner sc) {
        int opcion = sc.nextInt();
        if (opcion == 1) {
            areaCirculo(10);
        } else if (opcion == 2) {
            areaRectangulo(5, 4);
        } else {
            System.out.println("Opcion invalida");
        }
    }
}
