package Capitulo1.Exercicios;

import java.util.Scanner;

public class AreaTriangulo
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da base -> ");
        double base = entrada.nextDouble();

        System.out.print("Informe o valor da altura -> ");
        double altura = entrada.nextDouble();

        System.out.printf("A area do triangulo e %.2f",
                          base*altura / 2.0);

        entrada.close();
    }
}
