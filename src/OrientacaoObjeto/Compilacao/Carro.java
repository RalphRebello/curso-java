package OrientacaoObjeto.Compilacao;

public class Carro 
{
	//############ ATRIBUTOS ###################
	final Motor motor;
	
	//############ CONSTRUTORES ###################
	Carro()
	{
		this.motor = new Motor(this);
	}
	
	//############ METODOS ###################
	void acelerar()
	{
		if(motor.fatorInjecao < 2.6)
		{
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear()
	{
		if(motor.fatorInjecao > 0.5)
		{
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar()
	{
		motor.ligado = true;
	}
	
	void desligar()
	{
		motor.ligado = false;
	}
	
	boolean estaLigado()
	{
		return motor.ligado;
	}
}
