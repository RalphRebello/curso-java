package Capitulo2.Exercicios;

import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
//      1. Criar um programa que receba um número
//		e verifique se ele está entre 0 e 10 e é par;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um numero -> ");
        double numero = entrada.nextDouble();

        if(0 <= numero && numero <= 10 && numero%2 == 0)
            System.out.println("Numero entre 0 e 10 | Numero par");

        entrada.close();
    }
}
