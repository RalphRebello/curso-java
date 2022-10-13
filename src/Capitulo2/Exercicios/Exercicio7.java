package Capitulo2.Exercicios;

import java.util.Scanner;

public class Exercicio7
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double numero = 0, soma = 0;

        do
        {
            System.out.print("Insira um numero -> ");
            numero = entrada.nextDouble();

            if(numero >= 0)
            {
                soma += numero;
            }
            System.out.println("soma total -> " + soma);
        }
        while(numero >= 0);

        entrada.close();
    }
}
