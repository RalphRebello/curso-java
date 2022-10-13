package Capitulo2.Exercicios;

import java.util.Scanner;

public class Exercicio5
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num = 0, flag_primo = 0;

        System.out.print("Informe um numero -> ");
        num = entrada.nextInt();

        for(int i = 1; i <= num; i++)
        {
            int temp = num%i;

            if(temp == 0)
                flag_primo++;
        }

        switch(flag_primo)
        {
            case 2:
                System.out.println("Numero primo");
                break;
            default:
                System.out.println("Não é primo");
        }

        entrada.close();
    }
}
