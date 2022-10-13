package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Comsumidor 
{
	public static void main(String[] args) 
	{
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("caneta", 12.34, 0.9);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("notebook", 2987.99, 0.25);
		Produto p3 = new Produto("caderno", 19.90, 0.03);
		Produto p4 = new Produto("borracha", 7.80, 0.18);
		Produto p5 = new Produto("lapis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
