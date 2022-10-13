package Excessao.PersonaliazadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends Exception 
{
	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomeDoAtributo) 
	{
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() 
	{
		return String.format("O numero '%s' está fora do intervalo", nomeDoAtributo);
	}
}
