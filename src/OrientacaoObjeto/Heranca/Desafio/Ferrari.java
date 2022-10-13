package OrientacaoObjeto.Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo
{
	boolean turbo;
	boolean ar;
	
	//construtores
	public Ferrari()
	{
		this(300); //aponta para o de baixo
	}
	
	public Ferrari(int vel_max) //aponta para o construtor da classe pai
	{
		super(vel_max);
		setFator_aceleracao(15);
		setFator_frenagem(15); //variaveis acessiveis devido a herança da classe Carro
	}
	
	@Override
	public void ligarTurbo() 
	{
		turbo = true;
	}
	
	@Override
	public void desligarTurbo() 
	{
		turbo = false;		
	}
	
	@Override
	public void ligarAr() 
	{
		ar = true;
	}
	
	@Override
	public void desligarAr() 
	{
		ar = false;
	}
	
	@Override
	public int getFator_aceleracao() {
		if(turbo && !ar)
			return 35;
		else if(turbo && ar)
			return 30;
		else if(!turbo && !ar)
			return 20;
		else
			return 15;
	}
//	@Override  //sobrescreve um metodo da classe pai (Carro)
//	public void acelerar()
//	{
//		super.acelerar();
//	}
}
