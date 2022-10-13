package OrientacaoObjeto.Abstrato;

public class Cachorro extends Mamifero 
{
	//metodo declarado na classe mamifero como final, portanto não pode ser sobrescrito
//	@Override
//	public String mover() 
//	{
//		return "Usando as patas";
//	}
	
	@Override
	public String mamar() 
	{
		return "tomando leite";
	}
}
