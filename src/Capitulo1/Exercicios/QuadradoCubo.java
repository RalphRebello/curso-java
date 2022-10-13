package Capitulo1.Exercicios;

import java.util.Scanner;

public class QuadradoCubo
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor -> ");
        double valor = entrada.nextDouble();

        System.out.printf("Quadrado %.2f | Cubo %.2f",
                Math.pow(valor, 2),
                Math.pow(valor, 3));

        entrada.close();
    }
}
