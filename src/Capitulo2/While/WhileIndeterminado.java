package Capitulo2.While;

import java.util.Scanner;

public class WhileIndeterminado
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        String palavra = "inicio";

        while(!palavra.equalsIgnoreCase("sair"))
        {
            System.out.print("Digite a palavra -> ");
            palavra = entrada.nextLine();
            System.out.println("Palavra escrita -> " + palavra);

        }

        entrada.close();
    }
}
