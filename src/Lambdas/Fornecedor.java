package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor 
{
	public static void main(String[] args) 
	{									//quando não tem nenhum parametro usa ()
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println(umaLista.get());
	}
}
