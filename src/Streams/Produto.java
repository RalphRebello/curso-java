package Streams;

public class Produto 
{
	final double preco;
	final String nome;
	final double desconto;
	final boolean freteGratis;
	
	public Produto(double preco, String nome, double desconto, boolean freteGratis) 
	{
		this.preco = preco;
		this.nome = nome;
		this.desconto = desconto;
		this.freteGratis = freteGratis;
	}
}
