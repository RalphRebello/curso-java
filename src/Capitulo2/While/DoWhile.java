package Capitulo2.While;

import java.util.Scanner;

public class DoWhile
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String palavra = "";

        do
        {
            System.out.print("Fale a palavra magica para sair -> ");
            palavra = entrada.nextLine();
        }
        while(!palavra.equalsIgnoreCase("sair"));

        entrada.close();
    }
}
