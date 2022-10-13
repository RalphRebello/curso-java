package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 
{
	public static void main(String[] args) 
	{	
		//não permite converter int para Double
		
		BinaryOperator<Double> calculo = (x,y) -> //<define o tipo> não pode ser primitivo
		{
			return x + y;			
		};
		
		System.out.println(calculo.apply(2.0, 3.0));
	
		calculo = (x,y) -> x * y;		
		
		System.out.println(calculo.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calculo2 = (x,y) -> //<define o tipo> não pode ser primitivo
		{
			return x + y;			
		};
		
		System.out.println(calculo2.apply(2, 3));
	
		calculo2 = (x,y) -> x * y;		
		
		System.out.println(calculo2.apply(2, 3));
	}
}
