package Capitulo2.IF;

import java.util.Scanner;

public class IF
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a media -> ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7.0)
        {
            System.out.println("Aluno Aprovado");
            System.out.println("Parabens!!!");
        }

        boolean criterioReprovacao = media < 7.0;

        if(criterioReprovacao)
        {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
