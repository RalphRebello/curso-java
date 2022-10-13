package Capitulo2.While;

import java.util.Scanner;

public class DesafioWhile
{
    public static void main(String[] args)
    {
        //media da nota dos alunos, não sei quantos
        //notas entre 0 e 10, variavel total, notas validas, media
        //sair digitando -1

        Scanner entrada = new Scanner(System.in);

        double nota = 0, total = 0, media = 0;
        int notas_validas = 0;

        while(nota != -1)
        {
            System.out.print("Informe a nota ou -1 para sair -> ");
            nota = entrada.nextDouble();

            if(0 <= nota && nota <= 10)
            {
                total = total + nota;
                notas_validas = notas_validas + 1;
            }
            else if(nota != -1)
            {
                System.out.println("Nota digita é incorreta");
            }
        }

        media = total / notas_validas;

        System.out.printf("\nContabilizadas %d notas válidas", notas_validas);
        System.out.printf("\nA média das notas válidas é %.2f", media);

        entrada.close();
    }
}
