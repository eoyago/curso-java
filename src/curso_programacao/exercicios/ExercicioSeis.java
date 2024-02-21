package curso_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = 3.14159 * c * c;
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        input.close();
    }
}
