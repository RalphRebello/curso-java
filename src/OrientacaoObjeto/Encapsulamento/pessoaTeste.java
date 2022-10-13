package OrientacaoObjeto.Encapsulamento;

public class pessoaTeste 
{
	public static void main(String[] args) 
	{
		Pessoa p1 = new Pessoa("Ralph", "Rebello", -30);
		p1.setIdade(-15);
		
		System.out.println(p1.getIdade());
		System.out.println(p1); //esta chamando o metodo toString
		System.out.println(p1.getNomeCompleto());
	}
}
