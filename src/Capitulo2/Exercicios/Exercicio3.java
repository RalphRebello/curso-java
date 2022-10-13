package Capitulo2.Exercicios;

import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double nota1 = 0, nota2 = 0, media = 0;

        System.out.print("Informe a primeira nota -> ");
        nota1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota -> ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2)/2;

        if(media >= 7)
        {
            System.out.println("Aprovado");
        }
        else if(7 > media && media > 4)
        {
            System.out.println("Recuperação");
        }
        else
        {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
