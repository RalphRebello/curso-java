package Capitulo1.Funcionalidades;

import java.util.Scanner;

public class Console
{
    public static void main(String[] args)
    {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
        System.out.printf("\nSalario: %.1f", 1234.5678);
        System.out.printf("\nNome: %s\n\n", "João");

        Scanner entrada = new Scanner(System.in); //define var entrada

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); //faz a captura da entrada

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine(); //faz a captura da entrada

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); //faz a captura da entrada

        System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);

        entrada.close();
    }
}
