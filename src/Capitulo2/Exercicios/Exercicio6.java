package Capitulo2.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int tentativa = 0;
        Random numeroAleatorio = new Random();

        int numeroSorteado = numeroAleatorio.nextInt(101);

        for(int i = 10; i >= 1; i--)
        {
            System.out.println("Numero de tentativas -> " + i);
            System.out.printf("Adivinhe o numero -> ");
            tentativa = entrada.nextInt();

            if(tentativa == numeroSorteado)
            {
                System.out.println("PARABÉNS ACERTOUUU!!!" + numeroSorteado);
                break;
            }
            else if(tentativa > numeroSorteado)
            {
                System.out.println("Numero maior que o numero secreto\n");
            }
            else
            {
                System.out.println("Numero menor que o numero secreto\n");
            }
        }

        System.out.println(numeroSorteado);

        entrada.close();
    }
}
