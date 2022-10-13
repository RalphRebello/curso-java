package Capitulo2.Exercicios;

import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o ano para validar se é bissexto -> ");
        int ano = entrada.nextInt();

        if(ano%4 == 0 && ano%100 != 0)
        {
            System.out.printf("O ano %d é bissexto", ano);
        }
        else if(ano%400 == 0)
        {
            System.out.printf("O ano %d é bissexto", ano);
        }
        else
        {
            System.out.printf("O ano %d não é bissexto", ano);
        }

        entrada.close();
    }
}
