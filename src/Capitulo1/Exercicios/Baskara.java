package Capitulo1.Exercicios;

public class Baskara
{
    public static void main(String[] args)
    {
        double a = 1, b = 12, c = -13;

        double delta = Math.pow(b, 2) - 4*a*c;

        double result_linha = (-b + Math.sqrt(delta))/2*a;
        double result_2linha = (-b - Math.sqrt(delta))/2*a;

        System.out.printf("Delta %.2f", delta);
        System.out.printf("\nResultado ' %.2f", result_linha);
        System.out.printf("\nResultado \" %.2f \"", result_2linha);
    }
}
