package Lambdas;

import java.util.List;
import java.util.Arrays;

public class ForEach 
{
	public static void main(String[] args) 
	{
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional: ");
		for(String nome: aprovados)
			System.out.println(nome);
		
		System.out.println("\nLambda v1: ");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference v1: ");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda v2: ");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference v2: ");
		aprovados.forEach(ForEach::meuImprimir);
	}
	
	static void meuImprimir(String nome)
	{
		System.out.println("Oi! Meu nome é " + nome);
	}
}
