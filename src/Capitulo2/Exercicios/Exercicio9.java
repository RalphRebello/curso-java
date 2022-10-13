package Capitulo2.Exercicios;

import java.util.Scanner;

public class Exercicio9
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double numero = 0, maior = 0;

        for(int i = 0; i < 10; i++)
        {
            System.out.printf("Insira o %d° numero -> ", i+1);
            numero = entrada.nextDouble();

            if(numero >= maior)
            {
                maior = numero;
            }
        }
        System.out.println("Maior numero digitado é " + maior);

        entrada.close();
    }
}
