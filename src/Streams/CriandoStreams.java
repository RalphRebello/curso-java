package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams 
{
	public static void main(String[] args) 
	{
		Consumer<String> print = System.out::print;
		//Consumer<Integer> printInt = System.out::println;
		
		Stream<String> langs = Stream.of("java ", "lua ", "JS\n");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print); //controlar pelo indice
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print); //imprimir fora de ordem
		
//		Stream.generate(() -> "a").forEach(print); //gera uma stream infinita
//		Stream.iterate(0, n -> n + 1).forEach(printInt);
	}
}
