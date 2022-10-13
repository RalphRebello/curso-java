package Excessao;

public class basico 
{
	public static void main(String[] args) 
	{
		Aluno a1 = null;
		
		try
		{
		imprimirAluno(a1);
		}
		catch(Exception excecao)
		{
			System.out.println("Erro na hora de imprimir nome do aluno");
		}
		
		try 
		{
			System.out.println(7/0);
		} 
		catch (ArithmeticException excecao2) 
		{
			//excecao2.printStackTrace();
			System.out.println("erro de matematica " + 
								excecao2.getMessage());
		}		
		
		System.out.println("FIM");
	}
	
	public static void imprimirAluno(Aluno aluno)
	{
		System.out.println(aluno.nome);
	}
}
