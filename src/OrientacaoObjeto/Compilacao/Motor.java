package OrientacaoObjeto.Compilacao;

public class Motor
{
	//############ ATRIBUTOS ###################
	Carro carro;
	double fatorInjecao = 1;
	boolean ligado = false;
	
	//############ CONSTRUTORES ###################
	Motor(Carro carro)
	{
		this.carro = carro;
	}
	
	//############ METODOS ###################
	int giros()
	{
		if(!ligado)
		{
			return 0;
		}
		else
		{
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
	
}
