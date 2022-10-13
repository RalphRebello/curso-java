package Lambdas;

public class Produto extends Object //todas as classes erdam de Object
{
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) 
	{
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString()
	{
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço R$" + precoFinal;
	}
}
