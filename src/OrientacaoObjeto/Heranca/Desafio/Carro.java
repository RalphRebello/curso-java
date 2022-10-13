package OrientacaoObjeto.Heranca.Desafio;

public class Carro 
{
	//atributos
	public final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	private int fator_aceleracao = 5;
	private int fator_frenagem = 5;
	
	//construtores
	protected Carro(int vel_max)
	{
		VELOCIDADE_MAXIMA = vel_max;
	}
	
	//metodos
	public int getFator_aceleracao() 
	{
		return fator_aceleracao;
	}

	public void setFator_aceleracao(int fator_aceleracao) 
	{
		this.fator_aceleracao = fator_aceleracao;
	}

	public int getFator_frenagem() 
	{
		return fator_frenagem;
	}

	public void setFator_frenagem(int fator_frenagem) 
	{
		this.fator_frenagem = fator_frenagem;
	}
	//--------------------------------------------------------------------	
	public void acelerar()
	{
		if(velocidadeAtual + getFator_aceleracao() > VELOCIDADE_MAXIMA)
			velocidadeAtual = VELOCIDADE_MAXIMA;
		else
			velocidadeAtual += getFator_aceleracao();
	}

	public void frear()
	{
		if(velocidadeAtual > 0)
			velocidadeAtual -= fator_frenagem;
	}
	
	public String toString(Carro carro, String nome)
	{
		return nome + " -> " + carro.velocidadeAtual;
	}
	
}
