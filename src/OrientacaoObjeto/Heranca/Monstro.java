package OrientacaoObjeto.Heranca;

public class Monstro extends Jogador 
{
	public Monstro()
	{
		this(0, 0); //nesse caso o this() chama o construtor de baixo
	}
	
	public Monstro(int x, int y)
	{
		super(x, y); //e esse construtor chama o construtor da classe pai
	}
}
