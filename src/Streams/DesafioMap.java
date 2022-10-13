package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap 
{
	public static void main(String[] args) 
	{
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Consumer<Integer> printInt = System.out::println;
		
//		como não precisou manipular o numero em sim fez direto no map
//		Function<Integer, String> intToBin = n -> Integer.toBinaryString(n); 
		UnaryOperator<String> reverte = str -> new StringBuilder(str).reverse().toString();
		Function<String, Integer> binToInt = n -> Integer.parseInt(n, 2);
		
		nums.stream()
//			.map(intToBin) //fez direto aqui a conversao
			.map(Integer::toBinaryString) // '::' indica que está chamando por referencia
			.map(reverte)
			.map(binToInt)
			.forEach(printInt);
	}
}
