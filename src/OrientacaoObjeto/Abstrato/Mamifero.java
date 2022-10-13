package OrientacaoObjeto.Abstrato;

public abstract class Mamifero extends Animal 
{
	@Override
	public final String mover() 
	{
		return "Saindo do Lugar";
	}
	
	public abstract String mamar();
}
