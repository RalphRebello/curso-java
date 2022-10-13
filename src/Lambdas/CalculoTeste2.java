package Lambdas;

public class CalculoTeste2 
{
	public static void main(String[] args) 
	{
//		Calculo calculo = (x,y) -> { return x + y; }; //funcao lambda | igual ao de baixo	
		
		Calculo calculo = (x,y) -> 
		{
			return x + y;			
		};
		
		System.out.println(calculo.executar(2, 3));
		
//		calculo = (x,y) -> x * y; não precisa colocar as chaves, dai nao usa o return
		calculo = (x,y) -> x * y;			
		
		System.out.println(calculo.executar(2, 3));
		
//		por conta das func's lambdas não se faz necessario criar uma classe que implementa
//		os metodos de uma interface, as lambdas já implementam os metodos direto com uma
//		sintaxe mais enxuta.
		
		System.out.println(calculo.legal()); //acesso pela variavel
		System.out.println(Calculo.muitolegal()); //acesso pela instancia
	}
}
