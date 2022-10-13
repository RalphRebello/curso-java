package Lambdas;

@FunctionalInterface //força a ter apenas um metodo para as funcoes lambda
public interface Calculo 
{
	double executar(double a, double b);
	
	
	//exemplo de metodos que podem funcionar, o primeiro pela instancia e o outro apenas
	//pela interface
	default String legal()
	{
		return "legal";
	}
	
	static String muitolegal()
	{
		return "muito legal";
	}
}
