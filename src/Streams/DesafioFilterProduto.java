package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterProduto 
{
	public static void main(String[] args) 
	{
		Produto p1 = new Produto(123.65, "roteador", 0.1, true);
		Produto p2 = new Produto(67.98, "barbeador", 0.15, false);
		Produto p3 = new Produto(3210, "notebook", 0.2, true);
		Produto p4 = new Produto(14.50, "kit de canetas", 0.0, false);
		Produto p5 = new Produto(397.33, "raspbarry pi", 0.12, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> maisCaro = p -> p.preco >= 50;
		Predicate<Produto> freteGratis = p -> p.freteGratis;
		Predicate<Produto> maiorDesconto = p -> p.desconto >= 0.11;
		Function<Produto, String> informativo = p -> "Produto: " + p.nome +
													 " tem frete gratis";	
		
		produtos.stream()
			.filter(maisCaro)
			.filter(freteGratis)
			.filter(maiorDesconto)
			.map(informativo)
			.forEach(System.out::println);
	}
}
