package Excessao.PersonaliazadaB;

import Excessao.Aluno;

public class TesteValidacoes 
{
	public static void main(String[] args) 
	{
		try 
		{
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			Validar.aluno(null);
		}
		//pode tratar os dois no mesmo catch
		catch (StringVaziaException | NumeroForaDoIntervaloException e) 
		{
			System.out.println(e.getMessage());
		}
		//ou pode criar outro catch
		//catch(NumeroForaDoIntervaloException e)
		//{
		//	System.out.println(e.getMessage());
		//}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
		//nesse caso como ta lançando o erro é possivel colocar 
		//o extends as classes de exception ou usar o try catch
		//Validar.aluno(null);
		
		System.out.println("FIM...");
	}
}
