package OrientacaoObjeto.Compilacao.Desafio;

import java.util.ArrayList;

public class Cliente 
{
	//atributos
	String nome;
	ArrayList<Compra> compras = new ArrayList<>();
	
	//construtor
	Cliente()
	{
		
	}
	
	Cliente(String nome, Compra compra)
	{
		this.nome = nome;
		this.compras.add(compra);
	}
	
	//metodo
	double obterValorTotal()
	{
		double valor_total = 0;
		
		for(Compra compra: compras)
		{
			valor_total += compra.obterValorItens();
		}
		
		return valor_total;
	}
}
