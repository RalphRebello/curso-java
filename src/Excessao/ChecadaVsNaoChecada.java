package Excessao;

public class ChecadaVsNaoChecada
{
	public static void main(String[] args) 
	{
		try 
		{
			geraErro1();
		} 
		catch (RuntimeException e) 
		{
			System.out.println(e.getMessage());
		}
		
		geraErro2();
		
		try 
		{
			geraErro3();
		} 
		catch (Throwable e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	static void geraErro1()
	{
		//não checada/verificada
		throw new RuntimeException("Ocorreu um erro bem legal! #01");
	}
	
	static void geraErro2()
	{	
		//checada
		try {
			throw new Exception("Ocorreu um erro bem legal #02");
		} catch (Exception e) {
			System.out.println("que legal");
		}
	}
	
	static void geraErro3() throws Exception
	{
		throw new Exception("Ocorreu um erro bem legal #03");
	}

}
