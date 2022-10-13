package Capitulo4.Desafios;

import java.util.Scanner;

public class DesafioArrayNotas
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas -> ");
        int qtdNotas = entrada.nextInt();
        double notasAluno[] = new double[qtdNotas], total = 0;

        for(int i = 0; i < notasAluno.length; i++)
        {
            System.out.printf("Informe a %dª nota -> ", i+1);
            notasAluno[i] = entrada.nextDouble();
        }

        for(double nota: notasAluno)
        {
            total += nota;
        }

        System.out.println("Media -> " + total/notasAluno.length);

        entrada.close();
    }
}
