package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario 
{
	public static void main(String[] args) 
	{
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoquadrado = num -> num * num;
		
		int resultado = maisDois
						.andThen(vezesDois)
						.andThen(aoquadrado)
						.apply(0);
		
		System.out.println(resultado);
		
		int resultado2 = aoquadrado
						 .compose(vezesDois)
						 .compose(maisDois)
						 .apply(0);
		
		System.out.println(resultado2);
	}
}
