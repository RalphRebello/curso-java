package Capitulo4.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? -> ");
        int qtdAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? -> ");
        int qtdNotas = entrada.nextInt();

        double notasDaTurma[][] = new double[qtdAlunos][qtdNotas];
        double total = 0, media = 0;

        for(int i = 0; i < notasDaTurma.length; i++)
        {
            for(int j = 0; j < notasDaTurma[i].length; j++)
            {
                System.out.printf("Informe a nota %d do aluno %d -> ",
                        j+1, i+1);

                notasDaTurma[i][j] = entrada.nextDouble();
                total = total + notasDaTurma[i][j];
            }
        }

        System.out.println("\nTotal de notas");
        for(int i = 0; i < notasDaTurma.length; i++)
        {
            for(int j = 0; j < notasDaTurma[i].length; j++)
            {
                if(j+1 < notasDaTurma[j].length)
                    System.out.print(notasDaTurma[i][j] + " | ");
                else
                    System.out.println(notasDaTurma[i][j]);
            }
        }

        System.out.println("\nTotal de notas IMPRESSÃO NOVA");

        for(double[] notasGeral: notasDaTurma)
        {
            System.out.println(Arrays.toString(notasGeral));
        }

        media = total / (qtdAlunos * qtdNotas);
        System.out.println("\nA media da turma é " + media);

        entrada.close();
    }
}
