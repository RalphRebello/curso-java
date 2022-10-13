package OrientacaoObjeto.Polimorfismo;

public abstract class Comida 
{
	//atributo
	private double peso;

	//const
	public Comida(double peso)
	{
		setPeso(peso);
	}
		
	//metodos
	public double getPeso() 
	{
		return peso;
	}

	public void setPeso(double peso) 
	{
		if(peso >= 0)
			this.peso = peso;
	}
}
